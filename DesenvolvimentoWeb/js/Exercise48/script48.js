function checkNumber(){
    let number = parseFloat(window.prompt('Type a number:'))

    if(number % 2 == 0){
        window.alert('The number is Even!')
    }
    else{
        window.alert('The number is Odd!')
    }
}