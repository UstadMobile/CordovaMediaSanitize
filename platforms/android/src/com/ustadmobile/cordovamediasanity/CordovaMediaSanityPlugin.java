package com.ustadmobile.cordovamediasanity;


import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaMediaSanity;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;

public class CordovaMediaSanityPlugin extends CordovaPlugin {
	
	@Override
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException{
		if(action.equals("setMediaGestureRequired")) {
			boolean mediaGestureRequired = args.getBoolean(0);
			Activity activity = cordova.getActivity();
			if(activity instanceof CordovaActivity) {
				CordovaMediaSanity.setMediaGestureRequired(
					(CordovaActivity)activity, mediaGestureRequired, callbackContext);
			}else {
				callbackContext.error("MediaSanity: Failure! Activity not instanceof CordovaActivity!");
			}
			return true;
		}
		
		return false;
	}
	
}

