package com.boke.userservice;

import android.content.Intent;

import com.boke.imiloan.moduls.user.presenter.UserPresenter;
import com.boke.imiloan.moduls.user.view.activity.FindPwdActivity;
import com.boke.imiloan.moduls.user.view.activity.LoginActivity;
import com.boke.imiloan.moduls.user.view.activity.RegisterActivity;
import com.boke.imiloan.utils.StringUtils;
import com.boke.imiloan.views.LoadingDialog;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户相关插件
 */
public class UserService extends CordovaPlugin {
	CallbackContext callbackContext;
	private UserPresenter userPresenter;
	private static final String TAG = UserService.class.getSimpleName();

	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
	}

	/**
	 * Executes the request and returns PluginResult.
	 * 
	 * @param action
	 *            The action to execute.
	 * @param args
	 *            JSONArry of arguments for the plugin.
	 * @param callbackContext
	 *            The callback id used when calling back into JavaScript.
	 * @return True if the action was valid, false if not.
	 */
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		this.callbackContext = callbackContext;
		cordova.setActivityResultCallback(this);
		if ("quit".equals(action)) {
			cordova.getActivity().finish();
			callbackContext.success();
		} else if ("memLogin".equals(action)) {
			this.userPresenter = new UserPresenter((LoginActivity)cordova.getActivity());
			LoadingDialog.getInstance().showDialog((LoginActivity)cordova.getActivity(),"");
			JSONObject paramObj = args.getJSONObject(0);
			Map<String,String> params = new HashMap<>();
			params.put("cellPhone", StringUtils.josnExist(paramObj,"cellPhone"));
			params.put("password",StringUtils.josnExist(paramObj,"password"));
			userPresenter.memLogin(params,callbackContext,(LoginActivity) cordova.getActivity());

		}else if ("memRregister".equals(action)) {
			this.userPresenter = new UserPresenter((RegisterActivity)cordova.getActivity());
			LoadingDialog.getInstance().showDialog((RegisterActivity)cordova.getActivity(),"");
			JSONObject paramObj = args.getJSONObject(0);
			Map<String,String> params = new HashMap<>();
			params.put("cellPhone", StringUtils.josnExist(paramObj,"cellPhone"));
			userPresenter.memRregister(params,callbackContext,(RegisterActivity) cordova.getActivity());
			
		}else if ("memRegisterSubmit".equals(action)) {
			this.userPresenter = new UserPresenter((RegisterActivity)cordova.getActivity());
			LoadingDialog.getInstance().showDialog((RegisterActivity)cordova.getActivity(),"");
			JSONObject paramObj = args.getJSONObject(0);
			Map<String,String> params = new HashMap<>();
			params.put("cellPhone", StringUtils.josnExist(paramObj,"cellPhone"));
			params.put("identifying", StringUtils.josnExist(paramObj,"identifying"));
			params.put("password", StringUtils.josnExist(paramObj,"password"));
			userPresenter.memRegisterSubmit(params,callbackContext,(RegisterActivity) cordova.getActivity());
			
		}else if ("memFindPassword".equals(action)) {
			this.userPresenter = new UserPresenter((FindPwdActivity)cordova.getActivity());
			LoadingDialog.getInstance().showDialog((FindPwdActivity)cordova.getActivity(),"");
			JSONObject paramObj = args.getJSONObject(0);
			Map<String,String> params = new HashMap<>();
			params.put("cellPhone", StringUtils.josnExist(paramObj,"cellPhone"));
			userPresenter.memFindPassword(params,callbackContext,(FindPwdActivity) cordova.getActivity());
			
		}else if ("memFindPasswordSubmit".equals(action)) {
			this.userPresenter = new UserPresenter((FindPwdActivity)cordova.getActivity());
			LoadingDialog.getInstance().showDialog((FindPwdActivity)cordova.getActivity(),"");
			JSONObject paramObj = args.getJSONObject(0);
			Map<String,String> params = new HashMap<>();
			params.put("cellPhone", StringUtils.josnExist(paramObj,"cellPhone"));
			params.put("identifying", StringUtils.josnExist(paramObj,"identifying"));
			params.put("password", StringUtils.josnExist(paramObj,"password"));
			userPresenter.memFindPasswordSubmit(params,callbackContext,(FindPwdActivity) cordova.getActivity());
			
		}else if ("goToRegist".equals(action)) {
            cordova.getActivity().startActivity(new Intent(cordova.getActivity(),RegisterActivity.class));
		}else if ("goToFindPassword".equals(action)) {
			cordova.getActivity().startActivity(new Intent(cordova.getActivity(),FindPwdActivity.class));
		}
		else if ("dismissLogin".equals(action)) {
			cordova.getActivity().finish();
		}else if ("dismissRegist".equals(action)) {
			cordova.getActivity().finish();
		}else if ("dismissFindPassword".equals(action)) {
			cordova.getActivity().finish();
		}else {
			return false;
		}
		return true;
	}


}
