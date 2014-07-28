package org.apache.cordova;

import android.webkit.WebSettings;

/**
 * 
 * @author mike
 *
 */
public class CordovaMediaSanity {

	public static void setMediaGestureRequired(CordovaActivity activity, boolean gestureRequired) {
		WebSettings settings = activity.appView.getSettings();
		settings.setMediaPlaybackRequiresUserGesture(gestureRequired);
	}
}
