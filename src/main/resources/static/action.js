
const coll = document.querySelector(".errormsg");
var wrongAnswer = new Audio('audio/Felsvar.mp4');
var rightAnswer = new Audio('audio/Rättsvar.mp4');

/* Audio for the questions */
var questionAudio = document.getElementById("idAudio");
            function play_Audio() {
            questionAudio.play();
            }

function showId(correct, id){
var error = document.getElementById("errorMsg")
var correctMsg = document.getElementById("correctRes")
if(correct == id){
console.log("du har rätt")
error.classList.add("hidden");
correctMsg.classList.remove("hidden");
   if (rightAnswer.paused || wrongAnswer.paused) {
        rightAnswer.play();
    }else{
        wrongAnswer.currentTime= 0;
        rightAnswer.currentTime = 0;
    }
}
else{
correctMsg.classList.add("hidden");
error.classList.add("hidden")
error.classList.remove("hidden");
console.log("du har fel")
   if (wrongAnswer.paused) {
        wrongAnswer.play();
    }else{
        wrongAnswer.currentTime = 0;
    }
}
}