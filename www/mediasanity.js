
var argscheck = require('cordova/argscheck'),
exec = require('cordova/exec');

var mediasanity_exports = {};

/**
 * Set whether or not a gesture is required for media to play
 * @method setMediaGestureRequired
 * @param gestureRequired boolean true or false for if gesture is 
 *  required to play media
 * @param successCallback function Run when successfully applied
 * @param errorCallback function Run when this fails to apply
 */
mediasanity_exports.setMediaGestureRequired = function(gestureRequired, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "MediaSanity", 
            "setMediaGestureRequired", [gestureRequired]);
};

/**
 * Set whether or not a gesture is required for media to play
 * @method reapTimerThreads
 * @param graceThreadsAllowed int Number of grace timer threads allowed
 * @param successCallback function Run when successfully runs
 * @param errorCallback function Run when this fails to apply
 */
mediasanity_exports.reapTimerThreads = function(graceThreadsAllowed, successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "MediaSanity", 
        "reapTimerThreads", [graceThreadsAllowed]);
};

module.exports = mediasanity_exports;


