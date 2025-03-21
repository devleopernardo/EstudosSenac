function mult() {
    let number1 = window.prompt('Type the first number: ')
    let number2 = window.prompt('Type the second number: ')
    let number3 = window.prompt('Type the third number: ')

    number1 = parseFloat(number1);
    number2 = parseFloat(number2);
    number3 = parseFloat(number3);

    let mult = number1 * number2 * number3;
    alert(`The multiplication of three numbers is: ${mult}`)

}