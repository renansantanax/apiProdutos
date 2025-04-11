
# 🛒 API de Produtos – Spring Boot

API de Produtos é um projeto backend desenvolvido com Spring Boot 3+, responsável por gerenciar o ciclo completo de produtos — desde cadastro até atualização e remoção. Este backend se integra diretamente com o frontend Angular disponível no repositório [Web Produtos](https://github.com/renansantanax/webProdutos), formando um sistema completo fullstack. O objetivo é fornecer uma base robusta, segura e escalável para aplicações de e-commerce, catálogos internos ou sistemas administrativos. O projeto segue princípios de boas práticas de arquitetura em camadas, uso de DTOs, segurança com JWT e documentação automatizada com Swagger/OpenAPI, oferecendo um ambiente moderno e profissional para APIs REST.
---

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.4.2**
- **Spring Web** – Criação de APIs REST
- **Spring Validation** – Validações automáticas via anotações
- **Springdoc OpenAPI** – Documentação automática com Swagger
- **PostgreSQL** – Banco de dados relacional
- **Lombok** – Redução de boilerplate (getters, setters, etc.)
- **JWT** – Autenticação com tokens JWT
- **Maven** – Gerenciamento de dependências
- **Docker & Docker Compose** – Containerização do ambiente
- **JUnit 5** – Testes automatizados

---

## 🧱 Arquitetura do Projeto

- **Camadas separadas**:
  - `controllers` – Ponto de entrada das requisições HTTP.
  - `services` – Regras de negócio.
  - `repositories` – Persistência de dados (Spring Data JPA).
  - `dtos` – Objetos de transporte de dados (entrada e saída).
  - `entities` – Mapeamento das tabelas do banco.
  - `handlers` – Tratamento centralizado de exceções.
  - `filters` – Filtros de autenticação e CORS.
  - `configurations` – Configurações CORS, JWT e segurança.

- **Autenticação JWT**: via filtros configurados e proteção de rotas.

- **Swagger UI**: disponível em `/swagger-ui.html` para testes e visualização da API.

---

## 🐳 Docker

Para rodar o projeto em containers:

```bash
docker-compose up --build
```

Inclui:
- Banco PostgreSQL
- API Spring Boot

---

## 📁 Estrutura do Projeto

```
apiProdutos/
├── src/
│   ├── main/
│   │   ├── java/.../
│   │   │   ├── controllers/
│   │   │   ├── services/
│   │   │   ├── repositories/
│   │   │   ├── dtos/
│   │   │   ├── entities/
│   │   │   ├── filters/
│   │   │   ├── configurations/
│   └── resources/
│       └── application.properties
├── docker-compose.yml
├── pom.xml
```

---

## ✅ Padrões e Boas Práticas

- **DTOs**: desacoplamento entre entidade e API pública
- **Tratamento global de exceções** com `@ControllerAdvice`
- **Validações com Bean Validation** (javax.validation)
- **Documentação com Swagger/OpenAPI**
- **Autenticação baseada em JWT**
- **Versionamento da API** preparado via `/api/v1/...`

---

## 📌 Pré-requisitos

- Java 21+
- Maven
- Docker e Docker Compose
- PostgreSQL (caso queira rodar fora do Docker)

---

## 👨‍💻 Autor

Projeto desenvolvido por **Renan Santana** para fins de aprendizados e demonstração de boas práticas com Spring Boot.
