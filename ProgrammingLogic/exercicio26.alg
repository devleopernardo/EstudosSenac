algoritmo "Exercicio26"
// Função : 26 - Faça um programa que leia a nota de um aluno e verifique se ele foi aprovado (nota maior ou igual a 7) ou reprovado.
// Autor :
// Data : 14/10/2024
// Seção de Declarações
var

nota : real
nome : caractere
inicio
// Seção de Comandos

escreval ("Qual o Nome do Aluno")
leia (nome)
escreval ("Qual foi a sua nota")
leia (nota)

se nota >= 7  entao
   escreval(nome, " você foi Aprovado!")
senao
   escreval(nome, " você Foi reprovado!")
fimse

fimalgoritmo
