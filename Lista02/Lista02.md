# Lista 02 - Programação Orientada a Objetos (POO) - Java

## 1. Gerenciamento de Oficina Mecânica
Desenvolva um programa em **Java** para gerenciar uma **oficina mecânica**. A oficina atende dois tipos de veículos:
- **Automóveis** (caracterizados pelo número de passageiros que podem transportar).
- **Caminhões** (caracterizados pelo número de eixos).

Os serviços oferecidos são:
- Troca de óleo
- Troca de pneu
- Limpeza do motor

A oficina **não trabalha com agendamento**, atendendo os veículos por ordem de chegada.

### Requisitos:
- Registrar os veículos em uma lista por ordem de chegada e definir quais serviços serão realizados.
- Atender os veículos retirando-os da lista e exibir uma mensagem quando o serviço for realizado.

> **Observação:** A definição dos atributos das classes é livre.

---

## 2. Perfil Eleitoral das Cidades Brasileiras
Desenvolva um programa em **Java** que colete e analise informações sobre o perfil eleitoral das cidades brasileiras.

### Informações coletadas:
- **Dados Pessoais:** Nome, endereço (rua, número, bairro, cidade, CEP, estado), número de filhos, data de nascimento, estado civil (casado, solteiro, outro).
- **Ocupação:** Setor privado, setor público, autônomo, informal.
- **Renda:** Renda bruta mensal.
- **Intenção de voto para presidente:**
  - (__) Fulano da Silva (PSDB)
  - (__) Beltrano da Costa (PT)
  - (__) Ciclano do Amaral (MDB)
  - (__) Nulo
  - (__) Branco

### Informações a serem exibidas no final:
- Número total de entrevistados.
- Intenção de votos para cada candidato.
- Intenção de votos considerando entrevistados **casados, com filhos e renda mensal inferior a R$ 1.500,00**.

---

## 3. Programa Sócio Torcedor para um Clube de Futebol
Desenvolva um sistema em **Java** para gerenciar um **programa sócio torcedor** de um clube de futebol.

### Informações gerais:
- O programa deve armazenar **nome**, **data de criação** e **valor mensal vigente**.
- Existem três categorias de sócios:
  - **Normal:** R$ 50,00.
  - **Vip:** R$ 50,00 + R$ 100,00.
  - **Plus:** R$ 50,00 + R$ 200,00.

### Restrições:
- Sócios **Vip** podem indicar um amigo.
- Sócios **Plus** podem indicar até **três dependentes**.

### Funcionalidades:
- Cadastro de sócios (nome e CPF).
- Impressão dos dados de um sócio (nome, CPF e valor a ser pago pelo plano).

