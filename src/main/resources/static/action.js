
const coll = document.querySelector(".errormsg");
const questionText = document.getElementById("questiontext");
var wrongAnswer = new Audio('audio/Felsvar.mp4');
var rightAnswer = new Audio('audio/Rättsvar.mp4');
var page = document.getElementById("pageId").value;
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
    console.log("page: ", this.page);
    var text = returnText(this.page);
    questionText.innerText = text;


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

function returnText(id){
    if (id ==1){

     var text = 'Det är viktigt att glasburkar hamnar på rätt plats eftersom det tar ungefär en miljon år för naturen att bryta ned glasflaskor. Bra jobbat!'
        console.log(text);
        return text;
    }else if (id ==2){
      return "Bra jobbat! Tänk på att du kan återanvända plastflaskor på flera olika sätt. Visste du att vissa plastflaskor även kan lämnas tillbaka till en matbutik genom att panta flaskan?"
    }else if (id==3){
    return "Batterier som inte slängs på rätt ställe kan vara dåligt för människor och djur om batterierna till exempel hamnar i en sjö. Det är därför extra viktigt att slänga batterierna på rätt plats. "
    }else if(id ==4){
    return "Korrekt! En kaviartub görs av aluminium som tar flera hundra år för naturen att bryta ned."
    }else if(id ==5){
    return "Ja, jättebra! Visste du att vi varje vecka slänger ungefär 60 ton skräp på gatan och i naturen?"
    }else if(id==6){
    return "Bra! Att cykla gör att både kropp och knopp mår bra. Förutom att få frisk luft får man även mer energi för att kunna lära sig fler saker i skolan. Det går dessutom fortare att ta sig till skolan."
    }else if(id==7){
    return "Självklart! Många av våra kompisar promenerar till skolan och då hinner vi träffa dem innan skolan börjar. Vi kanske till och med kan promenera tillsammans till skolan!"
    }else if(id==8){
    return "Tåg är både snälla mot klimatet och rymmer väldigt många resenärer!"
    }else if(id==9){
     return "Bra! Flugsvampar är giftiga!"
    }else if(id==10){
    return "Bra jobbat! Bananskalet hör hemma i komposten!"
    }else if(id==11){
    return "Helt rätt! Mögligt bröd kan vara giftigt!"
    }


}