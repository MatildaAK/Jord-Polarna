
const coll = document.querySelector(".errormsg");


function showId(id){
console.log(id)
var x = document.getElementById("errormsg")
x.style.display = "block";
x.classList.remove("hidden");
coll.innerHtml= "Du har tryckt på fel"
}