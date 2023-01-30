
const coll = document.querySelector(".errormsg");


function showId(correct, id){
var error = document.getElementById("errorMsg")
var correctMsg = document.getElementById("correctRes")
if(correct == id){
console.log("du har rätt")
error.classList.add("hidden");
correctMsg.classList.remove("hidden");
}
else{
correctMsg.classList.add("hidden");
error.classList.add("hidden")
error.classList.remove("hidden");
console.log("du har fel")
}

//x.innerHtml= "Du har tryckt på fel"


}