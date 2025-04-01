const change = document.querySelector('#but');

const background = document.querySelector('div')

change.addEventListener("click", function () {
    if (background.style.backgroundColor == "white") {
        background.style.backgroundColor = "blue";
    }
    else {
        background.style.backgroundColor = "white";
    }

})