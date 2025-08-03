# 🧱 arquiteturaProduto

## Visão Geral da Arquitetura

```

src/
└── main/
    └── java/
        └── projetoAula02/
            ├── controllers/             # Controladores responsáveis por lidar com as requisições HTTP
            │   └── ProdutoController.java
            ├── domain/
            │   ├── dto/                 # Data Transfer Objects para entrada e saída de dados
            │   │   ├── ProdutoRequest.java
            │   │   └── ProdutoResponse.java
            │   ├── entities/            # Entidades que representam os modelos de negócio
            │   │   └── Produto.java
            │   ├── interfaces/          # Interfaces de serviços que definem contratos da aplicação
            │   │   └── ProdutoService.java
            │   └── service/             # Implementações dos serviços e regras de negócio
            │       └── ProdutoServiceImpl.java
            ├── repository/              # Classe responsável pela persistência de dados
            │   └── ProdutoRepository.java
            └── main/
                └── Main.java            # Classe principal com o método main (entrada da aplicação)

```



Este projeto segue a arquitetura em camadas (layered architecture), separando responsabilidades entre apresentação, lógica de negócio e persistência de dados. Isso facilita a manutenção, escalabilidade e entendimento da aplicação.

---

## Estrutura e Camadas do Projeto

### 1. Camada de Apresentação (Controller)

- Responsável por receber e responder às requisições do usuário.
- Traduz as entradas em chamadas para a camada de serviço.
- Classe:
  - `ProdutoController.java`

### 2. Camada de Aplicação (Service)

- Contém a lógica de negócio da aplicação.
- Executa as operações principais utilizando os dados e regras de domínio.
- Classes:
  - `ProdutoService.java` (interface)
  - `ProdutoServiceImpl.java` (implementação)

### 3. Camada de Persistência (Repository)

- Responsável por simular a manipulação e acesso aos dados.
- Aqui os dados são gerenciados via listas em memória.
- Classe:
  - `ProdutoRepository.java`

### 4. Camada de Domínio (Entities & DTOs)

- **Entidades** representam os objetos principais do sistema, como `Produto`.
- **DTOs** são usados para transportar dados entre as camadas de forma segura e eficiente.
- Classes:
  - `Produto.java`
  - `ProdutoRequest.java`
  - `ProdutoResponse.java`

### 5. Camada de Segurança

> ⚠️ **Este projeto não possui uma camada de segurança implementada.**
>  
Você pode adicionar autenticação e autorização no futuro usando Spring Security ou outro framework.

---

## Tecnologias e Padrões

- ☕ Java
- 🛠️ Padrão MVC
- 🧱 Arquitetura em Camadas
- 🧪 DTOs para separação de responsabilidades
- ✏️ Simulação de banco de dados com listas em memória
- 🧹 Separação clara entre entidades e transporte de dados

---
<img width="482" height="562" alt="image" src="https://github.com/user-attachments/assets/843d60e1-e84e-4b5d-ada1-c87454e8e39b" />

## Instruções Resumidas para Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/arquiteturaProduto-main.git

---

## Contato

Para dúvidas ou sugestões, entre em contato:  
- kkaioribeiro@gmail.com
- https://www.linkedin.com/in/kaiomuniz/

---
