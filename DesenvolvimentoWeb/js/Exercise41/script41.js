function sum() {
    let number1 = window.prompt('Type the first number: ')
    let number2 = window.prompt('Type the second number: ')

    number1 = parseFloat(number1);
    number2 = parseFloat(number2);

    let sum = number1 + number2;
    alert(`The Sum of two numbers is: ${sum}`)
}