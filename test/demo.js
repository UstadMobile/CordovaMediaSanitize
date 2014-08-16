/*
 Demo run Cordova Media Sanity
*/

var mediaSanity = null;

function runMediaSanity() {
    mediaSanity = ( cordova && cordova.plugins && cordova.plugins.MediaSanity ) 
        ? cordova.plugins.MediaSanity : null;
        
    mediaSanity.setMediaGestureRequired(false, function() {
        console.log("MEDIA: Set media gesture required to false OK");
        document.getElementById("mediasanitystatus").innerHTML = "set gesture required to false";
    }, function(err) {
        console.log("Media: set media gesture required FAIL : " + err);
        document.getElementById("mediasanitystatus").innerHTML = "ERROR: could not set gesture required to false";
    });
}

function reapTimerThreads() {
    mediaSanity.reapTimerThreads(0, function(numReaped) {
        console.log("MEDIA: Reaped " + numReaped + " timer threads");
        document.getElementById("mediasanitystatus").innerHTML = "Reaped " + numReaped + " timer threads";
    }, function(err) {
        console.log("MEDIA: FAILED to reap threads : " + err);
        document.getElementById("mediasanitystatus").innerHTML = "ERROR: failed to reap timer threads";
    });
}

document.addEventListener("deviceready", runMediaSanity, false);

