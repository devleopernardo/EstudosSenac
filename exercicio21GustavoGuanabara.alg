algoritmo "Ano Bissexto"
// Disciplina : [Linguagem e Lógica de Programação]
// Professor : [Nome do Professor]
// Descrição : 21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.
// Autor(a) : Leonardo
// Data atual : 15/10/2024
var
    ano: inteiro
inicio
    escreval("Digite um Ano do calendario Cristão e descobriremos se ele é bissexto:")
    leia(ano)

    se ano % 4 = 0 entao
    escreval ("Esse ano é Bissexto!")
    senao
    escreval ("Não é Bissexto")
    fimse


fimalgoritmo