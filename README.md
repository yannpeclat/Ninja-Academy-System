<h1 align="center"> 🥷 Ninja Academy System</h1>

<div align="center">

**Sistema de Gerenciamento de Ninjas - Aplicando os Pilares da POO em Java**

[![Java](https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=java)](https://www.java.com/)
[![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge)](#-roadmap)
[![POO](https://img.shields.io/badge/POO-Herança%20%7C%20Polimorfismo%20%7C%20Encapsulamento-blue?style=for-the-badge)](#-conceitos-aplicados)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](#-licen%C3%A7a)

</div>

---

## 📋 Índice

- [Sobre o Projeto](#-sobre-o-projeto)
- [Funcionalidades](#-funcionalidades)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Conceitos Aplicados](#-conceitos-aplicados)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Pré-requisitos](#-pré-requisitos)
- [Como Executar](#-como-executar)
- [Demonstração](#-demonstra%C3%A7%C3%A3o)
- [Roadmap](#-roadmap)
- [Autor](#-autor)
- [Licença](#-licen%C3%A7a)

---

## 🎯 Sobre o Projeto

O **Ninja Academy System** é um sistema de gerenciamento de ninjas desenvolvido em **Java** como parte do meu aprendizado em **Programação Orientada a Objetos (POO)**. 

A aplicação simula uma academia ninja onde é possível realizar operações completas de CRUD (Create, Read, Update, Delete) para gerenciar ninjas de diferentes clãs (Uchiha e Uzumaki), demonstrando na prática a aplicação de herança, polimorfismo e outros princípios fundamentais da POO.

> 💡 **Objetivo de Aprendizado:** Consolidar conhecimentos em Java e POO através de um projeto prático e escalável.

---

## ✨ Funcionalidades

### Operações Principais

| Funcionalidade | Descrição |
|----------------|-----------|
| ➕ **Criar** | Cadastro de novos ninjas dos clãs Uchiha e Uzumaki |
| 📋 **Listar** | Visualização de todos os ninjas cadastrados |
| 👁️ **Detalhes** | Exibição de informações detalhadas de cada ninja |
| ✏️ **Editar** | Atualização de dados de ninjas existentes |
| ❌ **Remover** | Exclusão de ninjas do sistema |

### Diferenciais

- ✅ Menu interativo via terminal com navegação intuitiva
- ✅ Validação robusta de entradas do usuário
- ✅ Separação clara entre classes base e especializadas
- ✅ Código organizado e legível seguindo boas práticas

---

## 🛠️ Tecnologias Utilizadas

<div align="center">

| Tecnologia | Versão | Finalidade |
|------------|--------|------------|
| ![Java](https://img.shields.io/badge/Java-25-orange?style=flat-square&logo=java) | 25+ | Linguagem principal |
| ![Scanner](https://img.shields.io/badge/Scanner-API%20Java-blue?style=flat-square) | - | Entrada de dados |
| ![Terminal](https://img.shields.io/badge/Terminal-CLI-green?style=flat-square) | - | Interface com usuário |

</div>

---

## 🧠 Conceitos Aplicados

Este projeto foi desenvolvido para colocar em prática os seguintes conceitos de **Programação Orientada a Objetos**:

### Pilares da POO

| Conceito | Aplicação no Projeto |
|----------|---------------------|
| **Herança** | Classes `Uchiha` e `Uzumaki` estendendo a classe base `Ninja` |
| **Polimorfismo** | Comportamentos específicos de cada clã implementados nas subclasses |
| **Encapsulamento** | Atributos privados com getters e setters controlados |
| **Abstração** | Modelagem de ninjas com características essenciais |

### Outros Conceitos

- ✅ **Construtores** e sobrecarga de construtores
- ✅ **Arrays de objetos** para armazenamento em memória
- ✅ **Estruturas de controle** (`switch`, `do-while`, condicionais)
- ✅ **Validação de dados** de entrada
- ✅ **Organização em pacotes** (`model.entities`)

---

## 🏗️ Estrutura do Projeto

```
Ninja-Academy-System/
├── src/
│   ├── Program.java                 # Classe principal com menu e lógica de execução
│   └── model/
│       └── entities/
│           ├── Ninja.java           # Classe base (superclasse)
│           ├── Uchiha.java          # Subclasse especializada - Clã Uchiha
│           └── Uzumaki.java         # Subclasse especializada - Clã Uzumaki
├── README.md                        # Documentação do projeto
└── .gitignore                       # Arquivos ignorados pelo Git
```

### Diagrama de Classes (Simplificado)

```
                    ┌─────────────┐
                    │    Ninja    │
                    │  (Classe    │
                    │    Base)    │
                    └──────┬──────┘
                           │
            ┌──────────────┴──────────────┐
            │                             │
     ┌──────▼──────┐              ┌──────▼──────┐
     │   Uchiha    │              │   Uzumaki   │
     │  (Subclasse)│              │  (Subclasse)│
     └─────────────┘              └─────────────┘
```

---

## 📋 Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) - Versão 25 ou superior
- [Git](https://git-scm.com/) (para clonar o repositório)

Para verificar se o Java está instalado:

```bash
java -version
javac -version
```

---

## 💻 Como Executar

Siga os passos abaixo para rodar o projeto em sua máquina local:

### 1. Clone o Repositório

```bash
git clone https://github.com/yannpeclat/Ninja-Academy-System.git
```

### 2. Navegue até o Diretório do Projeto

```bash
cd Ninja-Academy-System/src
```

### 3. Compile o Projeto

```bash
javac model/entities/*.java Program.java
```

### 4. Execute a Aplicação

```bash
java Program
```

### 🎮 Usando o Sistema

Após executar, você será apresentado ao menu interativo. Basta seguir as instruções na tela para:
- Cadastrar novos ninjas
- Listar ninjas registrados
- Visualizar, editar ou remover registros

---

## 🎬 Demonstração

> 📝 *Adicione aqui um GIF ou screenshot da aplicação em funcionamento*

```
┌─────────────────────────────────────────┐
│        🥷 NINJA ACADEMY SYSTEM 🥷       │
├─────────────────────────────────────────┤
│  1. Criar Ninja                         │
│  2. Listar Ninjas                       │
│  3. Ver Detalhes                        │
│  4. Editar Ninja                        │
│  5. Remover Ninja                       │
│  0. Sair                                │
└─────────────────────────────────────────┘
```

---

## 🔮 Roadmap

### ✅ Concluído

- [x] Estrutura inicial com herança
- [x] Implementação de menu interativo
- [x] Uso de switch expression
- [x] Validação de dados de entrada
- [x] CRUD completo (Create, Read, Update, Delete)

### 🚧 Em Desenvolvimento

- [ ] Substituir array por `ArrayList` para maior flexibilidade
- [ ] Melhorar organização em pacotes (packages)
- [ ] Adicionar tratamento de exceções mais robusto
- [ ] Implementar busca por nome ou clã

### 🔜 Planejamento Futuro

- [ ] Persistência de dados (arquivo texto ou banco de dados)
- [ ] Migração para Spring Boot (API REST)
- [ ] Interface gráfica com JavaFX ou Swing
- [ ] Testes unitários com JUnit
- [ ] Integração contínua (CI/CD)

---

## 👨‍💻 Autor

<div align="center">

| ![Yann Peclat](https://ui-avatars.com/api/?name=Yann+Peclat&background=0D8ABC&color=fff&size=100) |
|:-:|
| **Yann Peclat** |
| Futuro Engenheiro de Software focado em Backend Java 🚀 |

</div>

<div align="center">

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/yannpeclat/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/yannpeclat)

</div>

---

## 📄 Licença

Este projeto está sob a licença **MIT**. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

<div align="center">

**Se este projeto te ajudou de alguma forma, considere dar uma ⭐!**

Feito com ☕ e 🎯 por Yann Peclat

</div>
