
const coll = document.querySelector(".errormsg");


function showId(id){
console.log(id)
var x = document.getElementById("errormsg")
x.classList.remove("hidden");
x.innerHtml= "Du har tryckt på fel"
}