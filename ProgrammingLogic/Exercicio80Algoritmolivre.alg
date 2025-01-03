algoritmo "Nome do Programa"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : [Nome do Professor]

// Descrição   : 80 - A padaria Bom Pão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. 
// Cada pãozinho custa R$ 0,15 e a broa custa R$  1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda 
// dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado). Você foi contratado para fazer os cálculos para o dono.
// Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.
// Observação: Você tem liberdade para realizar essa atividade da forma que preferir.

// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : DATA_ATUAL/MES_ATUAL/ANO_ATUAL
var

paes, broas: inteiro
valorPaes, valorBroas: real
poupanca: real

inicio

escreval ("Quantos Paes Franceses foram vendidos?")
leia (paes)
escreval ("Quantos Broas foram vendidas?")
leia (broas)

valorPaes <- paes * 0.15
valorBroas <- broas * 1.5

poupanca <- (valorPaes + valorBroas) * 0.1

escreval ("A quantia em Dinheiro vendida no dia: ", valorPaes + valorBroas)
escreval ("A quantia que deve ser guardada em Poupanca: ", poupanca)

fimalgoritmo