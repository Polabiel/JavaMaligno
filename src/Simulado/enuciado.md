# Atividade de hoje

Fazer em Java 2 programas completos, cada um
com sua main. Um dos programas deve ser
reativo e o outro proativo.

## Sobre o REATIVO

Ele deverá manter um número inteiro, inicialmente valendo zero, e deverá aceitar conexões de programas proativos.

Para cada conexao que aceitar, ele deverá criar uma thread para cuidar da conexão aceita.

As threads deverão todas pertencer a uma unica classe e deverão enviar ao programa proativo, sempre que receber dele o string "ATUAL" de cuja conexão toma conta, o valor atual do referido número inteiro, incrementando-o em seguida; caso receba o string "FIM", deve encerrar a conexão da qual cuida, e a thread responsável por cuidar da conexao dever terminar.

## SOBRE O PROGAMA PROATIVO

Ele deverá solicitar conexao com o programa reativo, e deverá, repetidas vezes, pedir ao usuario que digite que deseja.

Caso o usuário digite algo diferente de "ATUAL" e de "FIM" (com letras escritas em caixa alta ou baixa, indiferentemente), deve informar que trata-se de uma digitação invalida.

Não sendo invalida, caso tenha sido digitado pelo usuario o string "FIM", deve-se encerrar a conexao com o programa reativo.

Não tendo sido digitado "FIM" (claro que, neste caso, terá sido digitado "ATUAL"), deve encaminhar o que foi digitado ao programa reativo e em seguida receber dele um string contendo um número inteiro, que o programa proativo deve então printar.

OBS: O PROGRAMA REATIVO TEM CARACTERISTICAS DE SERVIDOR, ENQUANTO O PROGRAMA PROATIVO TEM CARACTERISTICAS DE CLIENTE.
