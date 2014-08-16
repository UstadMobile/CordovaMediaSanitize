package com.ustadmobile.cordovamediasanity;


import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaMediaSanity;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.app.Activity;
import com.wanikani.androidnotifier.TimerThreadsReaper;

public class CordovaMediaSanityPlugin extends CordovaPlugin {
	
	/** Action for disabling or enabling gesture before play */
	public static final String ACTION_SETMEDIAGESTUREREQUIRED = 
			"setMediaGestureRequired";
	
	/** Action to trigger killing off leaking timer threads */
	public static final String ACTION_REAPTIMERTHREADS = 
			"reapTimerThreads";
	
	/** The threads reaper */
	TimerThreadsReaper reaper;
	
	/** Thread reaper task */
	TimerThreadsReaper.ReaperTask rtask;

	
	@Override
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException{
		if(action.equals(ACTION_SETMEDIAGESTUREREQUIRED)) {
			boolean mediaGestureRequired = args.getBoolean(0);
			Activity activity = cordova.getActivity();
			if(activity instanceof CordovaActivity) {
				CordovaMediaSanity.setMediaGestureRequired(
					(CordovaActivity)activity, mediaGestureRequired, callbackContext);
			}else {
				callbackContext.error("MediaSanity: Failure! Activity not instanceof CordovaActivity!");
			}
			return true;
		}else if(action.equals(ACTION_REAPTIMERTHREADS)){
			int graceTimers = args.getInt(0);
			return reapTimerThreads(graceTimers, callbackContext);
		}
		
		return false;
	}
	
	
	public boolean reapTimerThreads(int graceTimers, CallbackContext context) {
		if(reaper == null) {
			reaper = new TimerThreadsReaper ();
		}
		
		int numKilled = reaper.killDelta(graceTimers);
		context.success(numKilled);
		return true;
	}
	
}

