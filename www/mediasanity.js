
var argscheck = require('cordova/argscheck'),
exec = require('cordova/exec');

var mediasanity_exports = {};

/**
 * @method setMediaGestureRequired
 */
mediasanity_exports.setMediaGestureRequired = function(gestureRequired, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "MediaSanity", 
            "setMediaGestureRequired", [gestureRequired]);
};

module.exports = mediasanity_exports;


