Algoritmo "Exercicio 15"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Rafael
// Descrição   : 15 - Faça um programa que leia um número inteiro e
// mostre o seu antecessor e seu sucessor.
// Autor(a)    : leonardo
// Data atual  : 08/10/2024
Var
   // Seção de Declarações das variáveis

   numeroDigitado, numeroDigitadoAntecessor, numeroDigitadoSucessor : inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   escreval("Digite um numero inteiro e direi seu Antecessor e Sucessor:")
   leia(numeroDigitado)
   numeroDigitadoAntecessor <- numeroDigitado - 1
   numeroDigitadoSucessor <- numeroDigitado + 1

   escreval ("Resposta:", numeroDigitadoAntecessor, " e", numeroDigitadoSucessor )

Fimalgoritmo