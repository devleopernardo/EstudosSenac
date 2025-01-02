algoritmo "Exercicio 76 Contador de Divisíveis"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Rafael Bomfim]
// Descrição   : 76- Crie um programa usando o "Repita" que conta quantos números entre 1 e 100 são divisíveis por 3.
// Autor(a)    : Leonardo Alves
// Data atual  : 23/11/2024

var

counter: inteiro
counterResult: inteiro

inicio

repita
    counter <- counter + 1 
    se (counter % 3 = 0) entao
        counterResult <- counterResult + 1
        escreval (counter)
    fimse
    
ate counter > 100

escreval("Existem ",counterResult , " números Divisíveis por 3 de 1 a 100")
fimalgoritmo