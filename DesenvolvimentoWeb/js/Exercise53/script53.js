function average(){
    let score1 = parseFloat(document.getElementById('math').value);
    let score2 = parseFloat(document.getElementById('phisics').value);
    let score3 = parseFloat(document.getElementById('histoty').value);
    let score4 = parseFloat(document.getElementById('chemistry').value);
    let score5 = parseFloat(document.getElementById('biology').value);

    grade = (score1 + score2 + score3 + score4 + score5)/5;

    document.getElementById('result').innerText = 'Your final grade is: ' + grade;
}