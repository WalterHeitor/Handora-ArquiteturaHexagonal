# Cineminha

## Instruções para rodar o projeto

1. Clonar o repositório para sua máquina

```sh 
$ git clone https://github.com/zup-academy/cineminha
```

2. Ir para a branch `hexagonal-tc2-lt1`

```sh
$ git checkout hexagonal-tc2-lt1
```

> O projeto está com o H2 como banco de dados, caso queria utilizar outro banco, basta adicionar a dependência e
> realizar as configurações no application.properties

> O projeto está com o H2 como banco de dados, caso queria utilizar outro banco, basta adicionar a dependência e
> realizar as configurações no application.properties

## Consumindo a API REST da aplicação

Aqui demonstramos através de alguns exemplos como você pode consumir a API REST exposta pela aplicação. Estamos
utilizando o comando `cURL` como cliente HTTP mas você pode usar qualquer outro de sua preferência, como POSTman ou
Insomnia.

Dado que a aplicação esteja rodando, basta executar os comandos abaixo para exercitar os endpoints públicos da
aplicação.

### Criando novo Filme

```shell
curl --request POST \
  --url http://localhost:8080/api/filmes \
  --header 'Content-Type: application/json' \
  --data '{
    "nome": "Aula de matemática",
    "duracaoEmMinutos": 60,
    "classificacao": "LIVRE"
}'
```

### Criando nova Sala

```shell
curl --request POST \
  --url http://localhost:8080/api/salas \
  --header 'Content-Type: application/json' \
  --data '{
    "nome": "Pipoca"
}'
```

### Criando novo Filme

```shell
curl --request POST \
  --url http://localhost:8080/api/sessoess \
  --header 'Content-Type: application/json' \
  --data '{
  "horario": "18:30:00",
  "salaId": 1,
  "filmeId": 1,
  "preco": 25.99
}'
```