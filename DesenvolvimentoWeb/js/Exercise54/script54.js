function subtraction(){
    let number1 = parseFloat(document.getElementById('num1').value);
    let number2 = parseFloat(document.getElementById('num2').value);

    subtrac = number1 - number2;

    document.getElementById('result').innerText = 'The gap between this two number is: ' + subtrac;
}