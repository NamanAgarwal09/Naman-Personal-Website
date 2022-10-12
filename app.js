

/* Toggle between adding and removing the "responsive" class to NavBar when the user clicks on the icon */
function myFunction() {
  var x = document.getElementById("Top-navbar");
  if (x.className === "NavBar") {
    x.className += " responsive";
  } else {
    x.className = "NavBar";
  }
} 

// CODE FOR DETAIL PART OF THE WEBSITE
// FIRST WE NEED THREE THINGS:- Button class, whole midle part class
// and class of the constent part
// middle class:- about,
// Button class:- btn-101,
//  Content class:- content.

const btns = document.querySelectorAll(".btn-101");
const about = document.querySelector(".about");
const articles = document.querySelectorAll(".content");

about.addEventListener('click', function(e){
  // to find the button being clicked
  const id = e.target.dataset.id;
  if(id){
    btns.forEach(function(btn){
      // Remove active from other buttons:-
      btn.classList.remove('active');
      // Add active to button which is clicked:-
      e.target.classList.add("active"); 
    });
    // hide other articles
    articles.forEach(function(articles){
      articles.classList.remove('active');
    });
    const element = document.getElementById(id);
    element.classList.add("active"); 
  }
});