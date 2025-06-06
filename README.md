# JavaSistemaFuncionarioDependentes

Sistema simples em Java para cadastro e gerenciamento de **funcionários** e seus **dependentes**.

## Funcionalidades

* Cadastro de funcionários (nome, cargo, etc.)
* Cadastro de dependentes associados a cada funcionário
* Listagem de funcionários e seus dependentes
* Exclusão e atualização de dados

## Estrutura do Projeto

* `src/` - Código-fonte Java

  * `entities/` - Contém as classes `Funcionario` e `Dependente`
  * `controllers/` - Contém o `FuncionarioController`, que gerencia operações
  * `application/` - Classe principal com o `main()`

* `bin/` - Classes compiladas

* `.settings/`, `.classpath`, `.project` - Arquivos do Eclipse

## Requisitos

* Java 8 ou superior
* Eclipse IDE (opcional, mas recomendado)

## Como Executar

1. **Importar no Eclipse:**

   * `File > Import > Existing Projects into Workspace`
   * Escolha a pasta extraída do projeto

2. **Compilar e Executar:**

   * Rode a classe principal em `application/Main.java`

## Docker (opcional)

Existe um arquivo `docker-compose.yml`, possivelmente para uso futuro com banco de dados.



---

