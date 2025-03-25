function sumNumbers(){
    let num1 = parseFloat(document.getElementById('number1').value);
    let num2 = parseFloat(document.getElementById('number2').value);
    let num3 = parseFloat(document.getElementById('number3').value);

    sum = num1 + num2 + num3;

    document.getElementById('result').innerText = 'The result is:' + sum;
}