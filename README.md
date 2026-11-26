# 💈 Barber System

<p align="center">
  <img src="https://img.shields.io/badge/Java-Backend-orange?style=for-the-badge&logo=openjdk" />
  <img src="https://img.shields.io/badge/Spring%20Boot-Framework-6DB33F?style=for-the-badge&logo=springboot" />
  <img src="https://img.shields.io/badge/HTML5-Frontend-E34F26?style=for-the-badge&logo=html5" />
  <img src="https://img.shields.io/badge/CSS3-Styling-1572B6?style=for-the-badge&logo=css3" />
  <img src="https://img.shields.io/badge/JavaScript-Frontend-F7DF1E?style=for-the-badge&logo=javascript" />
</p>

<p align="center">
  <strong>Um sistema simples para gerenciamento de uma barbearia, desenvolvido para facilitar o controle de clientes, profissionais, serviços e agendamentos.</strong>
</p>

---

## 📌 Sobre o projeto

O **Barber System** é uma aplicação web desenvolvida com o objetivo de modernizar e simplificar o gerenciamento de uma barbearia.

O sistema permite organizar informações dos clientes, cadastrar barbeiros, gerenciar serviços oferecidos e controlar agendamentos.

O projeto foi desenvolvido com Java e Spring Boot no backend, utilizando HTML, CSS e JavaScript na interface do usuário.

## 🚀 Funcionalidades

- [x] Estrutura inicial do projeto
- [ ] Cadastro de clientes
- [ ] Cadastro de barbeiros
- [ ] Cadastro de serviços
- [ ] Gerenciamento de agendamentos
- [ ] Consulta de horários disponíveis
- [ ] Atualização e cancelamento de agendamentos
- [ ] Interface web responsiva

## 🛠️ Tecnologias utilizadas

| Tecnologia | Aplicação |
|---|---|
| Java | Linguagem principal |
| Spring Boot | Desenvolvimento do backend |
| Spring Web | Construção de APIs REST |
| Spring Data JPA | Persistência de dados |
| HTML5 | Estrutura da interface |
| CSS3 | Estilização e responsividade |
| JavaScript | Interatividade e consumo da API |

## 🏗️ Arquitetura do projeto

O projeto utiliza uma arquitetura dividida entre backend e frontend.

```text
barber-system/
│
├── backend/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/barber/
│           │       ├── controller/
│           │       ├── service/
│           │       ├── repository/
│           │       ├── model/
│           │       ├── dto/
│           │       └── BarberApplication.java
│           │
│           └── resources/
│               └── application.properties
│
├── frontend/
│   ├── index.html
│   ├── css/
│   │   └── style.css
│   └── js/
│       └── script.js
│
└── README.md
```

## 🧩 Entidades principais

O sistema possui como base as seguintes entidades:

| Entidade | Descrição |
|---|---|
| Cliente | Armazena os dados dos clientes |
| Barbeiro | Gerencia os profissionais |
| Serviço | Armazena os serviços e seus preços |
| Agendamento | Controla os horários e atendimentos |

### Relacionamentos

- Um cliente pode possuir vários agendamentos.
- Um barbeiro pode realizar vários agendamentos.
- Um serviço pode estar associado a vários agendamentos.
- Cada agendamento pertence a um cliente, um barbeiro e um serviço.

## ⚙️ Como executar o projeto

### Pré-requisitos

- Java JDK 21 ou superior
- Maven
- IDE de sua preferência (IntelliJ IDEA, Eclipse ou VS Code)
- Navegador atualizado

### 1. Clone o repositório

```bash
git clone https://github.com/SEU-USUARIO/barber-system.git
```

### 2. Acesse o backend

```bash
cd barber-system/backend
```

### 3. Execute a aplicação Spring Boot

```bash
mvn spring-boot:run
```

### 4. Execute o frontend

Abra o arquivo `frontend/index.html` no navegador ou utilize a extensão Live Server do VS Code.

## 🔌 Endpoints da API

Endpoints planejados para comunicação entre frontend e backend:

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/api/clientes` | Listar clientes |
| POST | `/api/clientes` | Cadastrar cliente |
| GET | `/api/barbeiros` | Listar barbeiros |
| POST | `/api/barbeiros` | Cadastrar barbeiro |
| GET | `/api/servicos` | Listar serviços |
| POST | `/api/servicos` | Cadastrar serviço |
| GET | `/api/agendamentos` | Listar agendamentos |
| POST | `/api/agendamentos` | Criar agendamento |

*Observação: endpoints planejados, sujeitos à implementação no backend.*

## 🎯 Objetivos de aprendizado

Este projeto também tem como objetivo colocar em prática conceitos fundamentais do desenvolvimento de software:

- Programação Orientada a Objetos (POO).
- Desenvolvimento de APIs REST.
- Arquitetura em camadas.
- Mapeamento objeto-relacional (JPA).
- Relacionamentos entre entidades.
- Separação de responsabilidades.
- Integração entre frontend e backend.
- Manipulação de dados e validações.

## 🔮 Melhorias futuras

- Implementação de autenticação com Spring Security.
- Controle de acesso por perfil de usuário.
- Integração com banco de dados MySQL.
- Dashboard administrativo.
- Relatórios de faturamento.
- Controle de estoque de produtos.
- Integração com WhatsApp para confirmação de agendamentos.

## 👨‍💻 Desenvolvedor

**Luiz Gustavo Cavalcante**

Estudante de Engenharia de Software, com foco em desenvolvimento Backend Java, Spring Boot, APIs REST e integração de sistemas.

<p align="center">
  Desenvolvido com ☕ e dedicação à tecnologia.
</p>

---

<p align="center">
  <strong>Barber System — Simplificando a gestão da sua barbearia. 💈</strong>
</p>
