# Farmácia Digital

## Instruções para rodar o projeto

1. Clonar o repositório para sua máquina

```sh 
$ git clone https://github.com/zup-academy/farmacia-digital
```

2. Ir para a branch `hexagonal-tc1-lt3`

```sh
$ git checkout hexagonal-tc1-lt3
```

> O projeto está com o H2 como banco de dados, caso queria utilizar outro banco, basta adicionar a dependência e realizar as configurações no application.properties

## Consumindo a API REST da aplicação

Aqui demonstramos através de alguns exemplos como você pode consumir a API REST exposta pela aplicação. Estamos utilizando o comando `cURL` como cliente HTTP mas você pode usar qualquer outro de sua preferência, como POSTman ou Insomnia.

Dado que a aplicação esteja rodando, basta executar os comandos abaixo para exercitar os endpoints públicos da aplicação.

### Criando nova Farmacia

```shell
curl --request POST \
  --url http://localhost:8080/farmaceuticas \
  --header 'Content-Type: application/json' \
  --data '{
    "nome": "Farmácia do João",
    "documento": "06.181.343/0001-86",
    "emailDeContato": "contato@farmaciadojoao.com.br",
    "telefonePrincipal": "(11) 9999-9999"
}'
```

### Criando nova Categoria

```shell
curl --request POST \
  --url http://localhost:8080/categorias \
  --header 'Content-Type: application/json' \
  --data '{
    "nome": "analgésicos"
}'
```

### Criando novo Remedio

```shell
curl --request POST \
  --url http://localhost:8080/remedios \
  --header 'Content-Type: application/json' \
  --data '{
  "nome": "Aspirina",
  "farmaciaId": 1,
  "categoriaId": 1,
  "dataFabricacao": "2022-03-15",
  "dataValidade": "2023-03-15"
}'
```



