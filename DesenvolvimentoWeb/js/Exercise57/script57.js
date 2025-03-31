function hide(){
    let peekaboo = document.querySelector("#gif");
    if(peekaboo.style.visibility == "visible"){
        peekaboo.style.visibility = "hidden";
    }
    else{
        peekaboo.style.visibility = "visible";
    }
}