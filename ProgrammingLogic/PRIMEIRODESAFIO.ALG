Algoritmo "PrimeiroDesafio"

// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Rafael Bomfim

// Descrição   : [DESAFIO] Escreva um programa para calcular a redução do
// tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados
// por dias e quantos anos ele já fumou. Considere que um fumante
// perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um
// fumante perderá e exiba o total em dias.

// Autor(a)    : Leonardo Alves
// Data atual  : 10/10/2024

Var
   // Seção de Declarações das variáveis

   tempoMinutos, tempoDias : inteiro
   cigarrosFumados, cigarrosDia : inteiro
   anosFumados : inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   escreval ("Se você é um fumante vamos descobrir o tempo que você perdeu na vida?")
   escreval ("Digite quantos cigarros você fuma por dia:")
   leia (cigarrosDia)
   escreval ("Digite quantos anos você já fumou:")
   leia (anosFumados)

   cigarrosFumados <- cigarrosDia * 365 * anosFumados        // Descobrindo quantos Cigarros foram Pitados.

   tempoMinutos <- cigarrosFumados * 10             // Descobrindo quantos minutos o fumante perdeu. Sendo um Cigarro Equivale a 10 minutos

   tempoDias <- tempoMinutos div 1440             // Descobrindo quantos dias o fumante perdeu ao todo.

   escreval ("A quantidade de dias perdidos fumando foi: ", tempoDias)


Fimalgoritmo