algoritmo "Exercicio 79 Laço Repita"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Rafael Bomfim]

// Descrição   : 79 - Usando o "Repita", você foi designado para desenvolver um programa que 
// verifique as notas de um aluno e determine se ele foi aprovado ou reprovado.
// O critério para aprovação é que a nota tem que ser igual ou superior a 60. 
// O programa deve solicitar a entrada das notas do "X" aluno e exibir o resultado da verificação.

// Autor(a)    : Leonardo Alves
// Data atual  : 25/11/2024

var

nome:caracter
nota: real
contador, totalAluno:inteiro

inicio

escreval("Digite a quantidade de alunos na sua turma: ")
leia(totalAluno)
contador<-1
repita
escreval("Digite o nome do aluno(a): ")
leia(nome)
escreval("Digite a nota do aluno(a): ")
leia(nota)
escreval("o aluno(a) " ,nome , " tem nota: " ,nota )
se nota>=60 entao
escreval("Aprovado(a)")
fimSe
 se (nota>=0) e (nota<=59) entao
escreval("Reprovado(a)")
fimSe

 contador<-contador+1
 ate contador>totalAluno

fimalgoritmo