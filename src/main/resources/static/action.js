
const coll = document.querySelector(".errormsg");
var wrongAnswer = new Audio('audio/Felsvar.mp4');
var rightAnswer = new Audio('audio/Rättsvar.mp4');

function showId(correct, id){
var error = document.getElementById("errorMsg")
var correctMsg = document.getElementById("correctRes")
if(correct == id){
console.log("du har rätt")
error.classList.add("hidden");
correctMsg.classList.remove("hidden");
   if (rightAnswer.paused) {
        wrongAnswer.currentTime = 0;
        wrongAnswer.pause();
        rightAnswer.play();
    }else{
        wrongAnswer.currentTime = 0;
        wrongAnswer.pause()
        rightAnswer.currentTime = 0;
    }
}
else{
correctMsg.classList.add("hidden");
error.classList.add("hidden")
error.classList.remove("hidden");
console.log("du har fel")
   if (wrongAnswer.paused) {
        rightAnswer.currentTime = 0;
        rightAnswer.pause();
        wrongAnswer.play();
    }else{
        rightAnswer.currentTime=0;
        rightAnswer.pause();
        wrongAnswer.currentTime = 0;
       }
}
}