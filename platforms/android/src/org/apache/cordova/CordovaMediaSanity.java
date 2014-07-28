package org.apache.cordova;

import android.webkit.WebSettings;

/**
 * 
 * @author mike
 *
 */
public class CordovaMediaSanity {
	
	public CordovaMediaSanity() {
		
	}

	public static void setMediaGestureRequired(final CordovaActivity activity, final boolean gestureRequired, final CallbackContext callbackContext) {
		activity.runOnUiThread(new Runnable() {
            public void run() {
            	WebSettings settings = activity.appView.getSettings();
        		settings.setMediaPlaybackRequiresUserGesture(gestureRequired);
        		callbackContext.success();
            }
		});
		
	}
}
