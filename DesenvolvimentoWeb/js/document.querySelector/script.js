const botao = document.querySelector("#botao");

const body = document.querySelector('body')

botao.addEventListener("click", function () {
    if (botao.textContent === "Ligar") {
        botao.textContent = "Desligar";
    } else {
        botao.textContent = "Ligar";
    }
    body.style.backgroundColor = body.style.backgroundColor === "black" ? "white" : "black";
})