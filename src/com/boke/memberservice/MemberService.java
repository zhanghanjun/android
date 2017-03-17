package com.boke.memberservice;


import android.content.Intent;

import com.boke.imiloan.activity.MainActivity;
import com.boke.imiloan.base.MyApplication;
import com.boke.imiloan.moduls.mine.presenter.MemberAccountInfoPresenter;
import com.boke.imiloan.moduls.mine.presenter.MemberApplyInfoPresenter;
import com.boke.imiloan.moduls.mine.presenter.MemberApplyTransactionPresenter;
import com.boke.imiloan.moduls.mine.presenter.MemberDeleteApplyTransactionPresenter;
import com.boke.imiloan.moduls.mine.presenter.MemberInfoPresenter;
import com.boke.imiloan.moduls.mine.view.activity.MemberAccountInfoActivity;
import com.boke.imiloan.moduls.mine.view.activity.MemberApplyInfoActivity;
import com.boke.imiloan.moduls.mine.view.activity.MemberPersonalInfoActivity;
import com.boke.imiloan.moduls.mine.view.activity.MemberSettingInfoActivity;
import com.boke.imiloan.moduls.mine.view.activity.list.MemberApplyTransactionListActivity;
import com.boke.imiloan.utils.PreferencesUtils;
import com.boke.imiloan.utils.StringUtils;

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
 * 个人中心相关插件
 */
public class MemberService extends CordovaPlugin {
	CallbackContext callbackContext;
	private static final String TAG = MemberService.class.getSimpleName();

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
		} else if ("start".equals(action)) {
			JSONObject paramObj = args.getJSONObject(0);
			int type = StringUtils.josnIntExist(paramObj,"type");
			if(type==1){
               cordova.getActivity().startActivity(new Intent(cordova.getActivity(), MemberAccountInfoActivity.class));
			}else if(type==2){
				cordova.getActivity().startActivity(new Intent(cordova.getActivity(), MemberPersonalInfoActivity.class));
			}else if(type==3){
				cordova.getActivity().startActivity(new Intent(cordova.getActivity(), MemberApplyInfoActivity.class));
			}else if(type==4){
				cordova.getActivity().startActivity(new Intent(cordova.getActivity(), MemberApplyTransactionListActivity.class));
			}else if(type==5){
				cordova.getActivity().startActivity(new Intent(cordova.getActivity(), MemberSettingInfoActivity.class));
			}else if(type==6){
				cordova.getActivity().startActivity(new Intent(cordova.getActivity(), MemberPersonalInfoActivity.class));
			}
		}else if ("getApplyInfo".equals(action)) {
			String token ="";
			if(StringUtils.isEmpty(PreferencesUtils.getString(cordova.getActivity(),"token"))){
				token = MyApplication.getInstance().getUser().getData().getToken();
			}else{
				token = PreferencesUtils.getString(cordova.getActivity(),"token");
			}
			Map<String,String> params = new HashMap<>();
			params.put("token",token);
			MemberApplyInfoPresenter memberApplyInfoPresenter = new MemberApplyInfoPresenter((MemberApplyInfoActivity)cordova.getActivity());
			memberApplyInfoPresenter.getMemberApplyInfo(params,callbackContext,(MemberApplyInfoActivity) cordova.getActivity());
		}else if ("getApplyTransaction".equals(action)) {
			JSONObject paramObj = args.getJSONObject(0);
            String begin = StringUtils.josnExist(paramObj,"begin");
			String token ="";
			if(StringUtils.isEmpty(PreferencesUtils.getString(cordova.getActivity(),"token"))){
				token = MyApplication.getInstance().getUser().getData().getToken();
			}else{
				token = PreferencesUtils.getString(cordova.getActivity(),"token");
			}
			Map<String,String> params = new HashMap<>();
			params.put("token",token);
			params.put("begin",begin);
			MemberApplyTransactionPresenter memberApplyTransactionPresenter = new MemberApplyTransactionPresenter((MemberApplyTransactionListActivity)cordova.getActivity());
			memberApplyTransactionPresenter.getApplyTransaction(params,callbackContext,(MemberApplyTransactionListActivity) cordova.getActivity());
		}else if ("getMemberInfo".equals(action)) {
			String token ="";
			if(StringUtils.isEmpty(PreferencesUtils.getString(cordova.getActivity(),"token"))){
				token = MyApplication.getInstance().getUser().getData().getToken();
			}else{
				token = PreferencesUtils.getString(cordova.getActivity(),"token");
			}
			Map<String,String> params = new HashMap<>();
			params.put("token",token);
			MemberInfoPresenter memberInfoPresenter = new MemberInfoPresenter((MainActivity)cordova.getActivity());
			memberInfoPresenter.getMemberInfo(params,callbackContext,(MainActivity) cordova.getActivity());
			
		}else if ("getMemberAccountInfo".equals(action)) {
			String token ="";
			if(StringUtils.isEmpty(PreferencesUtils.getString(cordova.getActivity(),"token"))){
				token = MyApplication.getInstance().getUser().getData().getToken();
			}else{
				token = PreferencesUtils.getString(cordova.getActivity(),"token");
			}
			Map<String,String> params = new HashMap<>();
			params.put("token",token);
			MemberAccountInfoPresenter memberAccountInfoPresenter = new MemberAccountInfoPresenter((MemberAccountInfoActivity)cordova.getActivity());
			memberAccountInfoPresenter.getMemberAccountInfo(params,callbackContext,(MemberAccountInfoActivity) cordova.getActivity());

		}else if ("deleteApplyTransaction".equals(action)) {
			JSONObject paramObj = args.getJSONObject(0);
			String id = StringUtils.josnExist(paramObj,"id");
			String token ="";
			if(StringUtils.isEmpty(PreferencesUtils.getString(cordova.getActivity(),"token"))){
				token = MyApplication.getInstance().getUser().getData().getToken();
			}else{
				token = PreferencesUtils.getString(cordova.getActivity(),"token");
			}
			Map<String,String> params = new HashMap<>();
			params.put("token",token);
			params.put("id",id);
			MemberDeleteApplyTransactionPresenter memberDeleteApplyTransactionPresenter = new MemberDeleteApplyTransactionPresenter((MemberApplyTransactionListActivity)cordova.getActivity());
			memberDeleteApplyTransactionPresenter.deleteApplyTransaction(params,callbackContext,(MemberApplyTransactionListActivity) cordova.getActivity());
		}else if ("setMemberInfo".equals(action)) {

		}else if ("setApplyInfo".equals(action)) {

		}	
		else {
			return false;
		}
		return true;
	}


}
