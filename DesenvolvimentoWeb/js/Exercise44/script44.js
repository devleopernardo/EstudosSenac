function sub() {
    let number1 = window.prompt('Type the first number: ')
    let number2 = window.prompt('Type the second number: ')

    number1 = parseFloat(number1);
    number2 = parseFloat(number2);

    let sub = number1 - number2;
    alert(`The Subtraction of two numbers is: ${sub}`)

}