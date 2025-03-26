function sum(){
    let number1 = parseFloat(document.getElementById('num1').value);
    let number2 = parseFloat(document.getElementById('num2').value);

    sumResult = number1 + number2;

    document.getElementById('sumresult').innerText = 'The sum of these numbers is: ' + sumResult;
}

function subtract(){
    let number1 = parseFloat(document.getElementById('num1').value);
    let number2 = parseFloat(document.getElementById('num2').value);

    subtracResult = number1 - number2;

    document.getElementById('subresult').innerText = 'The subtraction of these numbers is: ' + subtracResult;
}

function division(){
    let number1 = parseFloat(document.getElementById('num1').value);
    let number2 = parseFloat(document.getElementById('num2').value);

    diviResult = number1 / number2;

    document.getElementById('diviresult').innerText = 'The Division of these numbers is: ' + diviResult;
}

function multiplication(){
    let number1 = parseFloat(document.getElementById('num1').value);
    let number2 = parseFloat(document.getElementById('num2').value);

    multiResult = number1 * number2;

    document.getElementById('multiresult').innerText = 'The subtraction of these numbers is: ' + multiResult;
}