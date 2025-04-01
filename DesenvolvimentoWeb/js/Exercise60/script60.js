const text = document.querySelector("#but");

text.addEventListener("click", function() {
    if(text.textContent == "ON") {
        text.textContent = "OFF";
    }
    else{
        text.textContent = "ON";
    }
})