Algoritmo "Exercicio 17"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Rafael
// Descrição   : 17 - Faça um algoritmo que leia o salário de
// um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.
// Autor(a)    : Leonardo
// Data atual  : 09/10/2024
Var
   // Seção de Declarações das variáveis

   salario : real



Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   escreval ("Qual o salario do funcionario")
   leia (salario)

   salario <- salario * (15/100) + salario

   escreval ("O novo salario eh: ", salario)




Fimalgoritmo