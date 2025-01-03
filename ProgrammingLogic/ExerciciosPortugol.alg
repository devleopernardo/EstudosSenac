algoritmo "DeltaEx11ListaGustavaGuanabara"
// Disciplina : [Linguagem e Lógica de Programação]
// Professor : Gustavo Guanabara
// Descrição : 11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
// segundo grau e mostre o valor de Delta.
// Autor(a) : Leonardo Alves
// Data atual : 15/10/2024
var
    a: real
    b: real
    c: real
    delta: real
inicio
    escreval("Digite os valores de A, B e C. Para calcularmos o Delta.")
    leia(a)
    leia(b)
    leia(c)

    delta <- b^2 - (4*a*c)

    escreva("O Valor de Delta é: ", delta)

fimalgoritmo