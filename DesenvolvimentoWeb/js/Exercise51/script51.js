function multiplication(){
    let numb1 = parseFloat(document.getElementById('number1').value);
    let numb2 = parseFloat(document.getElementById('number2').value);

    mult = numb1 * numb2;

    document.getElementById('result').innerText = 'The result of the multiplication is: ' + mult;
}