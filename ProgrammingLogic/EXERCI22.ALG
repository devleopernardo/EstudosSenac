Algoritmo "Exerci22"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Rafael

// Descrição   : 22 - Faça um programa que leia três números inteiros
// e exiba o resultado da divisão inteira do primeiro pelo segundo e
// depois do resultado pelo terceiro.
// (Lembrando use o DIV)

// Autor(a)    : Leonardo
// Data atual  : 10/10/2024
Var
   // Seção de Declarações das variáveis

   num1, num2, num3 : inteiro
   divisao1, divisao2 : inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval (" Digite 3 numeros")
   leia(num1)
   leia(num2)
   leia(num3)
   
   divisao1 <- num1 div num2
   divisao2 <- divisao1 div num3
   
   escreval (" O resultado das divisoes eh:", divisao2)
   
   


Fimalgoritmo