const botao = document.querySelector("#botao");
const paragraph = document.querySelector('p');

botao.addEventListener("click", function() {
    if (botao.textContent == "100px") {
        botao.textContent = "12px";
        paragraph.style.fontSize = "100px";
    }
    else {
        botao.textContent = "100px";
        paragraph.style.fontSize = "12px";
    }
    
})