
/**
 * @method setMediaGestureRequired
 */
window.setMediaGestureRequired = function(gestureRequired, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "MediaSanity", 
            "setMediaGestureRequired", [gestureRequired]);
};

