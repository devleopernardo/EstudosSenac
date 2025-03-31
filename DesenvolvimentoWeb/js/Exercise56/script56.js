function botao(){
    let paragraph = document.querySelector("#isso");
    if(paragraph.style.color === "black"){
        paragraph.style.color = "red";
    }
    else{
        paragraph.style.color = "black";
    }
}