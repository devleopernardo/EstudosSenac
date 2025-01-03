algoritmo "Condicoes Basicas"
// Disciplina : [Linguagem e Lógica de Programação]
// Professor : Gustavo Guanabara
// Descrição : 17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
// 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
// o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
// Autor : Leonardo
// Data atual : 15/10/2024
var
    velocidade: real
    valormulta: real
inicio
    escreval("Digite a velocidade do carro?")
    escreva("Km/h ")
    leia(velocidade)
    se ( velocidade > 80 ) entao
    valorMulta <- (velocidade - 80) * 5
        escreval("Você foi multado em R$ ", valorMulta)
    } senao         escreval("Você está dentro do limite de Velocidade.")
    fimse

fimalgoritmo