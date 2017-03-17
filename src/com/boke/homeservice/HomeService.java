package com.boke.homeservice;

import android.content.Intent;

import com.boke.imiloan.activity.MainActivity;
import com.boke.imiloan.moduls.card.presenter.CardProductInfoPresenter;
import com.boke.imiloan.moduls.card.presenter.CardProductListPresenter;
import com.boke.imiloan.moduls.card.view.activity.CreditProductInfoActivity;
import com.boke.imiloan.moduls.home.presenter.FineProductListPresenter;
import com.boke.imiloan.moduls.home.presenter.HomePresenter;
import com.boke.imiloan.moduls.loan.presenter.LoanProductInfoPresenter;
import com.boke.imiloan.moduls.loan.presenter.LoanProductListPresenter;
import com.boke.imiloan.moduls.loan.view.activity.LoanProductInfoActivity;
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
 * 首页相关插件
 */
public class HomeService extends CordovaPlugin {
	CallbackContext callbackContext;
	private static final String TAG = HomeService.class.getSimpleName();
    private HomePresenter homePresenter;

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
		} else if ("getHomeInfo".equals(action)) {
			this.homePresenter = new HomePresenter((MainActivity)cordova.getActivity());
			this.homePresenter.getHomeDataList(callbackContext,(MainActivity)cordova.getActivity());
		}else if ("start".equals(action)) {
			JSONObject paramObj = args.getJSONObject(0);
			int type = StringUtils.josnIntExist(paramObj,"type");
			//信用卡
			if(type==1){
				PreferencesUtils.putInt(cordova.getActivity(),"creditId",StringUtils.josnIntExist(paramObj,"id"));
				cordova.getActivity().startActivity(new Intent(cordova.getActivity(),CreditProductInfoActivity.class));
			}
			//贷款
			else if(type==2){
				PreferencesUtils.putInt(cordova.getActivity(),"LoanId",StringUtils.josnIntExist(paramObj,"id"));
				cordova.getActivity().startActivity(new Intent(cordova.getActivity(),LoanProductInfoActivity.class));
			}
			
		}else if ("getLoanProductList".equals(action)) {
			Map<String, String> params = new HashMap<>();
			JSONObject paramObj = args.getJSONObject(0);
			params.put("loan",StringUtils.josnExist(paramObj,"loan"));
			params.put("repay",StringUtils.josnExist(paramObj,"repay"));
			params.put("area",StringUtils.josnExist(paramObj,"area"));
			params.put("classifyId",StringUtils.josnExist(paramObj,"classifyId"));
			params.put("begin",StringUtils.josnExist(paramObj,"begin"));
			LoanProductListPresenter loanProductListPresenter = new LoanProductListPresenter((MainActivity)cordova.getActivity());
			loanProductListPresenter.getLoanDataList(params,callbackContext,(MainActivity)cordova.getActivity());
		}else if ("getLoanProductInfo".equals(action)) {
			Map<String,String> params = new HashMap<>();
			params.put("id",String.valueOf(PreferencesUtils.getInt(cordova.getActivity(),"LoanId")));
			LoanProductInfoPresenter loanProductInfoPresenter = new LoanProductInfoPresenter((LoanProductInfoActivity)cordova.getActivity());
			loanProductInfoPresenter.getLoanDataInfo(params,callbackContext,(LoanProductInfoActivity)cordova.getActivity());
		}else if ("getCreditProductList".equals(action)) {
			Map<String, String> params = new HashMap<>();
			JSONObject paramObj = args.getJSONObject(0);
			params.put("begin",StringUtils.josnExist(paramObj,"begin"));
			CardProductListPresenter cardProductListPresenter = new CardProductListPresenter((MainActivity)cordova.getActivity());
			cardProductListPresenter.getCreditDataList(params,callbackContext,(MainActivity)cordova.getActivity());
		}else if ("getCreditProductInfo".equals(action)) {
			Map<String, String> params = new HashMap<>();
			params.put("id",String.valueOf(PreferencesUtils.getInt(cordova.getActivity(),"creditId")));
			CardProductInfoPresenter cardProductInfoPresenter = new CardProductInfoPresenter((CreditProductInfoActivity)cordova.getActivity());
			cardProductInfoPresenter.getCreditDataInfo(params,callbackContext,(CreditProductInfoActivity)cordova.getActivity());
			
		}else if ("getFineProductList".equals(action)) {
			Map<String, String> params = new HashMap<>();
			JSONObject paramObj = args.getJSONObject(0);
			params.put("begin",StringUtils.josnExist(paramObj,"begin"));
			FineProductListPresenter fineProductListPresenter = new FineProductListPresenter((MainActivity)cordova.getActivity());
			fineProductListPresenter.getFineProductDataList(params,callbackContext,(MainActivity)cordova.getActivity());
		}	
		else {
			return false;
		}
		return true;
	}


	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		super.onActivityResult(requestCode, resultCode, intent);

	}
}
