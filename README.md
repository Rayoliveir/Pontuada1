# Atividade Pontuada: API REST com Spring Boot

Desenvolva uma API RESTful com Spring Boot para gerir funcionários, seguindo os requisitos:

**Modelagem:** Implemente as classes (`model`) e o mapeamento ORM conforme o diagrama de classes (anexo).

**Endpoints:**

* `/`: Mensagem de boas-vindas.
* `/dev`: Nome do desenvolvedor.
* `/funcionarios`: Operações CRUD (Create, Read, Update, Delete).

**Validação:**

* Valide os dados da API.
* Impeça emails duplicados.

**Tratamento de Exceções:**

* Trate erros com mensagens apropriadas.
* Retorne status HTTP apropriados para os erros.

**Respostas:**

* Padronize as respostas em formato JSON.
* Inclua o status HTTP nas respostas.

**Organização:**

* Utilize os seguintes pacotes:
    * `model`
    * `repository`
    * `service`
    * `controller`

**Testes:**

* Teste os endpoints utilizando Postman ou Insomnia.
* Utilize as pastas de teste:
    * `welcome`
    * `funcionarios`

**Diagrama de Classes:**

* (Fornecido separadamente)

**Observações:**

* Utilize Spring Boot e a linguagem Java.
* Documente o código de forma clara.
* Considere aspectos de segurança da API.
