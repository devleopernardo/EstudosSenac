algoritmo "Nome do Programa"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Nome do Professor]

// Descrição   : Desafio: Descubra o Número Secreto
// Descrição: O programa deve ler um número do usuário e verificar se esse número é o "número secreto". O número secreto é definido como sendo divisível por 3, 
// maior que 10, e menor que 100. O programa deve informar se o número digitado pelo usuário atende a essas condições ou não.

// Se nao atender a condicao repetir ate acertar o numero secreto.


// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : DATA_ATUAL/MES_ATUAL/ANO_ATUAL

var

secretNumb: inteiro

inicio

escreval("Adivinhe o numero secreto: ")
leia(secretNumb)

repita
    se (verdadeiro) entao
    escreval("Acertou Miseravi")
    senao
    escreval ("ERROU")
    fimse

ate (secretNumb > 10) e (secretNumb < 100) e (secretNumb % 3 = 0)

fimalgoritmo