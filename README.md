<div align="center">
  <a href="https://git.io/typing-svg">
    <img src="https://readme-typing-svg.demolab.com?font=Silkscreen&size=20&duration=1500&pause=1000&center=true&vCenter=true&multiline=true&repeat=false&random=false&width=700&height=110&lines=API+MEDICAL" 
    alt="Typing SVG" />
  </a>
  
  <h5 align="center"> 
    <b> Completo ✅ </b> | <a href="https://www.figma.com/design/vSaxzTG4lAqfYbJICvnf8Q/API_Medical?node-id=0-1&t=f3L0ZsehXjotUr6u-1">FIGMA📱</a> 
  </h5>
</div>

# Medical API Controller

Este projeto é um exemplo de uma API para gerenciamento de médicos utilizando Spring Boot. Ele inclui funcionalidades para cadastrar, listar, atualizar e excluir médicos no sistema. O código foi desenvolvido seguindo boas práticas de programação e utilizando recursos modernos do Spring Framework.

## Tecnologias Utilizadas

- **Java** ☕: Linguagem de programação principal.
- **Spring Boot** 🚀: Framework para criar APIs de forma rápida e eficiente.
- **Jakarta Validation** ✅: Para validação de dados nas requisições.
- **Jakarta Transactional** 🔄: Para gerenciamento de transações.

## Estrutura do Projeto

### Pacotes Principais

- `client.medical.api.controller`: Contém os controladores REST.
- `client.medical.api.medico`: Contém as classes relacionadas à entidade Medico, como DTOs e repositórios.

### Controlador Principal

A classe `MedicoController` fornece os seguintes endpoints:

#### 1. **Cadastrar Médico**
- **Endpoint**: `POST /medicos`
- **Descrição**: Cadastra um novo médico no sistema.
- **Payload**:
  ```json
  {
    "nome": "string",
    "email": "string",
    "telefone": "string",
    "crm": "string",
    "especialidade": "string",
    "endereco": {
      "logradouro": "string",
      "numero": "string",
      "bairro": "string",
      "cidade": "string",
      "uf": "string"
    }
  }
  ```

#### 2. **Listar Médicos**
- **Endpoint**: `GET /medicos`
- **Descrição**: Retorna uma lista paginada de médicos ativos.
- **Parâmetros de Consulta**:
  - `size`: Tamanho da página (padrão: 10).
  - `sort`: Campo para ordenação (padrão: nome).

#### 3. **Atualizar Médico**
- **Endpoint**: `PUT /medicos`
- **Descrição**: Atualiza as informações de um médico existente.
- **Payload**:
  ```json
  {
    "id": "long",
    "nome": "string",
    "email": "string",
    "telefone": "string",
    "crm": "string",
    "especialidade": "string",
    "endereco": {
      "logradouro": "string",
      "numero": "string",
      "bairro": "string",
      "cidade": "string",
      "uf": "string"
    }
  }
  ```

#### 4. **Excluir Médico**
- **Endpoint**: `DELETE /medicos/{id}`
- **Descrição**: Marca um médico como inativo no sistema.

## Configuração e Execução

### Pré-requisitos

1. **Java 17** ou superior.
2. **Maven** para gerenciamento de dependências.
3. Banco de dados configurado com suporte ao Spring Data JPA.

---

<div align="center">

## 👩🏻‍💻 Autor <br>

<table>
  <tr>
    <td align="center">
      <a href="https://lucasmessias.vercel.app">
        <img src="https://avatars.githubusercontent.com/u/e?email=robsonlmds@hotmail.com&s=500" width="100px;" title="Autor Robson Lucas Messias" alt="Foto de Perfil do GitHub - Robson Lucas Messias"/><br>
        <sub>
          <b>Robson Lucas Messias</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

</div>
 
<h4 align="center">
  Made by: Robson Lucas Messias | <a href="mailto:robsonlmds@hotmail.com">Contato</a>
</h4>

<p align="center">
  <a href="https://www.linkedin.com/in/r-lucas-messias/">
    <img alt="Robson Lucas Messias" src="https://img.shields.io/badge/LinkedIn-R.Lucas_Messias-0e76a8?style=flat&logoColor=white&logo=linkedin">
  </a>
</p>

<h1 align="center">
<img src="https://readme-typing-svg.herokuapp.com/?font=Silkscreen&size=35&center=true&vCenter=true&width=700&height=70&duration=5000&lines=Obrigado+pela+atenção!;" />
</h1>

