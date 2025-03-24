function adultHood(){
    let age = window.prompt('Type your Age:')

    age = parseFloat(age);

    if (age>=18){
        window.alert('You have reached adulthood!')
    }
    else {
        window.alert('You are a Child!')
    }
}