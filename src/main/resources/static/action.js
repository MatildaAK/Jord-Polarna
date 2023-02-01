
const coll = document.querySelector(".errormsg");
var wrongAnswer = new Audio('audio/Felsvar.mp4');
var rightAnswer = new Audio('audio/Rättsvar.mp4');

const allAudio = [];
/* Audio for the questions */
var questionAudio1 = new Audio('audio/q1lvl1.mp4');
var questionAudio2 = new Audio('audio/q2lvl1.mp4');
var questionAudio3 = new Audio('audio/q3lvl1.mp4');
var questionAudio4 = new Audio('audio/q4lvl1.mp4');
var questionAudio5 = new Audio('audio/q5lvl1.mp4');
var questionAudio6 = new Audio('audio/q1lvl2.mp4');
var questionAudio7 = new Audio('audio/q2lvl2.mp4');
var questionAudio8 = new Audio('audio/q3lvl2.mp4');
var questionAudio9 = new Audio('audio/q123lvl3.mp4');
var presentation = new Audio('audio/Presentation.mp4');
var level = new Audio('audio/väljlvl.mp4');
allAudio.push(questionAudio1, questionAudio2, questionAudio3, questionAudio4, questionAudio5, questionAudio6,questionAudio7,questionAudio8);



function pauseAudio(audio) {
    audio.pause();
    audio.currentTime = 0;
}

function play_Audio(id) {

pauseAudio(rightAnswer);
pauseAudio(wrongAnswer);
if(id ==1){
questionAudio1.play();
    }else if(id ==2){
    questionAudio2.play()
    }else if(id ==3){
    questionAudio3.play()
    }else if(id ==4){
    questionAudio4.play()
    }else if (id ==5){
    questionAudio5.play()}
    else if (id ==6){
    questionAudio6.play()}
    else if (id ==7){
    questionAudio7.play()}
    else if (id ==8){
    questionAudio8.play()}
    else if (id== 9 || id == 10 || id== 11){
    questionAudio9.play()}
}



function showId(correct, id){
console.log("allaudio ", allAudio);
allAudio.forEach(audio => pauseAudio(audio));
var error = document.getElementById("errorMsg")
var correctMsg = document.getElementById("correctRes")
if(correct == id){
error.classList.add("hidden");
correctMsg.classList.remove("hidden");
   if (rightAnswer.paused) {
   pauseAudio(wrongAnswer);
    rightAnswer.play();
    }else{
    pauseAudio(wrongAnswer);
    rightAnswer.currentTime = 0;
    }
}
else{
correctMsg.classList.add("hidden");
error.classList.add("hidden")
error.classList.remove("hidden");
   if (wrongAnswer.paused) {
    pauseAudio(rightAnswer)
    wrongAnswer.play();
    }else{
    pauseAudio(rightAnswer);
    wrongAnswer.currentTime = 0;
   }
}
}

function playPresentation(){
presentation.play()}

function playLvl(){
level.play()}

/*---Print---*/
const printBtn = document.getElementById('print');

printBtn.addEventListener('click', function() {
    print();
})