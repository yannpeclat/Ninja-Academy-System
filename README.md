<h1 align="center"> 🥷 Ninja Academy System</h1>

<div align="center">

**Sistema de Gerenciamento de Ninjas - Aplicando os Pilares da POO em Java**

[![Java](https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=java)](https://www.java.com/)
[![Collections](https://img.shields.io/badge/Collections-List%20%7C%20ArrayList-blue?style=for-the-badge&logo=java)](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)
[![Enums](https://img.shields.io/badge/Enums-Tipos%20Fortes-green?style=for-the-badge&logo=java)](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)
[![Interfaces](https://img.shields.io/badge/Interfaces-POO-purple?style=for-the-badge&logo=java)](https://docs.oracle.com/javase/tutorial/java/concepts/interface.html)
[![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge)](#-roadmap)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](#-licen%C3%A7a)

</div>

---

## 📋 Índice

- [Sobre o Projeto](#-sobre-o-projeto)
- [Funcionalidades](#-funcionalidades)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Arquitetura do Projeto](#-arquitetura-do-projeto)
- [Diagrama de Classes](#-diagrama-de-classes)
- [Conceitos Aplicados](#-conceitos-aplicados)
- [Estrutura de Diretórios](#-estrutura-de-diretórios)
- [Pré-requisitos](#-pré-requisitos)
- [Como Executar](#-como-executar)
- [Fluxo de Navegação](#-fluxo-de-navegação)
- [Roadmap](#-roadmap)
- [Autor](#-autor)
- [Licença](#-licen%C3%A7a)

---

## 🎯 Sobre o Projeto

O **Ninja Academy System** é um sistema completo de gerenciamento de ninjas desenvolvido em **Java Puro** como parte do meu aprendizado em **Programação Orientada a Objetos (POO)**.

A aplicação simula uma academia ninja onde é possível realizar operações completas de CRUD para gerenciar ninjas de **5 diferentes clãs** (Uchiha, Uzumaki, Hyuga, Senju, Nara), registrar missões, visualizar histórico e muito mais. O projeto demonstra na prática a aplicação de herança, polimorfismo, encapsulamento, interfaces, enums e outros princípios fundamentais da POO.

> 💡 **Objetivo de Aprendizado:** Consolidar conhecimentos em Java e POO através de um projeto prático, escalável e bem organizado, utilizando apenas recursos nativos da linguagem sem frameworks externos.

---

## ✨ Funcionalidades

### Operações Principais

| Funcionalidade | Descrição |
|----------------|-----------|
| ➕ **Cadastrar Ninja** | Registro de novos ninjas com escolha entre 5 clãs distintos |
| 📋 **Listar Ninjas** | Visualização de todos os ninjas cadastrados com seleção interativa |
| 👁️ **Detalhes Completos** | Exibição de informações detalhadas incluindo habilidades especiais do clã |
| ✏️ **Editar Ninja** | Atualização de nome, idade, aldeia ou todos os campos simultaneamente |
| ❌ **Remover Ninja** | Exclusão segura com confirmação e tratamento de estado |
| 📜 **Registrar Missão** | Atribuição de missões com classificação, tipo, descrição e recompensa |
| 📚 **Histórico de Missões** | Visualização, adição e edição de missões completadas por cada ninja |

### Recursos Avançados

- ✅ **Menu Interativo** com navegação intuitiva e submenu contextual
- ✅ **Validação Robusta** de todas as entradas do usuário
- ✅ **Feedback Visual** imediato após edições e operações
- ✅ **Tratamento de Estado** para evitar operações em ninjas removidos
- ✅ **Atualização em Tempo Real** das informações após edição
- ✅ **Enums Tipados** para Clãs, Ranks, Tipos e Classificações de Missão
- ✅ **Interface IMissionavel** para comportamento padronizado de missões
- ✅ **Service Layer** separando regras de negócio das entidades

---

## 🛠️ Tecnologias Utilizadas

<div align="center">

| Tecnologia | Versão | Finalidade |
|------------|--------|------------|
| ![Java](https://img.shields.io/badge/Java-25-orange?style=flat-square&logo=java) | 25+ | Linguagem principal |
| ![Collections](https://img.shields.io/badge/Collections-List%2FArrayList-blue?style=flat-square&logo=java) | - | Armazenamento dinâmico de dados |
| ![Enums](https://img.shields.io/badge/Enums-Tipos%20Fortes-green?style=flat-square&logo=java) | - | Constantes tipadas (Clan, Rank, MissionType, MissionClassification) |
| ![Interfaces](https://img.shields.io/badge/Interfaces-Contratos-purple?style=flat-square&logo=java) | - | Padronização de comportamentos (IMissionavel) |
| ![Scanner](https://img.shields.io/badge/Scanner-Entrada%20de%20Dados-cyan?style=flat-square) | - | Leitura de entrada do usuário |
| ![Terminal](https://img.shields.io/badge/Terminal-CLI-green?style=flat-square) | - | Interface com usuário |

</div>

### Enums Implementados

```java
// Clãs disponíveis
enum Clan { UCHIHA, UZUMAKI, HYUGA, SENJU, NARA }

// Ranks ninja
enum Rank { GENIN, CHUNIN, JOUNIN, KAGE }

// Tipos de missão
enum MissionType { ESCOLTA, RECONHECIMENTO, ESPIONAGEM, CAPTURA, RECUPERACAO }

// Classificação de dificuldade
enum MissionClassification { D, C, B, A, S }
```

---

## 🏛️ Arquitetura do Projeto

O projeto segue uma arquitetura em camadas bem definida:

```
┌─────────────────────────────────────────┐
│         Camada de Apresentação          │
│           (Program.java)                │
│      Menu Principal & Interação         │
└─────────────────┬───────────────────────┘
                  │
┌─────────────────▼───────────────────────┐
│         Camada de Serviço               │
│     (NinjaAcademyService.java)          │
│   Regras de Negócio & Validações        │
└─────────────────┬───────────────────────┘
                  │
┌─────────────────▼───────────────────────┐
│         Camada de Entidades             │
│    (Ninja, Mission + 5 Clãs)            │
│       Modelagem de Dados                │
└─────────────────┬───────────────────────┘
                  │
┌─────────────────▼───────────────────────┐
│         Camada de Interfaces            │
│        (IMissionavel.java)              │
│      Contratos de Comportamento         │
└─────────────────────────────────────────┘
                  │
┌─────────────────▼───────────────────────┐
│         Camada de Enums                 │
│ (Clan, Rank, MissionType,               │
│  MissionClassification)                 │
│      Constantes Tipadas                 │
└─────────────────────────────────────────┘
```

---

## 📊 Diagrama de Classes

```
                         ┌──────────────────┐
                         │   IMissionavel   │
                         │   (Interface)    │
                         ├──────────────────┤
                         │ +adicionarMissao │
                         │ +editarMissao    │
                         │ +getHistorico    │
                         │ +possuiMissoes   │
                         └────────┬─────────┘
                                  │
                                  │ implements
                                  ▼
                    ┌─────────────────────────┐
                    │      Ninja (Abstract)   │
                    │      (Classe Base)      │
                    ├─────────────────────────┤
                    │ -nome: String           │
                    │ -idade: int             │
                    │ -aldeia: String         │
                    │ -rankAtual: Rank        │
                    │ -historicoMissoes: List │
                    ├─────────────────────────┤
                    │ +getHabilidadeEspecial()│
                    │ +mostrarInfo()          │
                    │ +setters / getters      │
                    └───────────┬─────────────┘
                                │
        ┌───────────────────────┼───────────────────────┐
        │                       │                       │
   ┌────▼─────┐          ┌─────▼─────┐          ┌──────▼──────┐
   │  Uchiha  │          │  Uzumaki  │          │   Hyuga     │
   ├──────────┤          ├───────────┤          ├─────────────┤
   │Sharingan │          │Grande     │          │Byakugan     │
   │Fire Style│          │Reserva Chakra│       │Punho Suave  │
   └──────────┘          └───────────┘          └─────────────┘
        │                       │                       │
   ┌────▼─────┐          ┌─────▼─────┐
   │  Senju   │          │   Nara    │
   ├──────────┤          ├───────────┤
   │Wood Style│          │Shadow     │
   │Vitalidade│          │QI Elevado │
   └──────────┘          └───────────┘


                    ┌─────────────────────────┐
                    │       Mission           │
                    ├─────────────────────────┤
                    │ -nome: String           │
                    │ -classificacao: Enum    │
                    │ -descricao: String      │
                    │ -recompensa: double     │
                    │ -tipo: Enum             │
                    └─────────────────────────┘
```

### Clãs Disponíveis

| Clã | Habilidade Especial |
|-----|---------------------|
| 🟥 **Uchiha** | Sharingan e Fire Style |
| 🟧 **Uzumaki** | Grande Reserva de Chakra e Modo Sábio |
| ⬜ **Hyuga** | Byakugan e Punho Suave |
| 🟩 **Senju** | Vitalidade Excepcional e Wood Style (Mokuton) |
| ⬛ **Nara** | Shadow Possession e QI Elevado |

---

## 🧠 Conceitos Aplicados

Este projeto foi desenvolvido para colocar em prática os seguintes conceitos de **Programação Orientada a Objetos**:

### Pilares da POO

| Conceito | Aplicação no Projeto |
|----------|---------------------|
| **Herança** | 5 classes de clãs estendendo a classe abstrata `Ninja` |
| **Polimorfismo** | Método `getHabilidadeEspecial()` implementado especificamente para cada clã |
| **Encapsulamento** | Atributos privados com getters e setters controlados em todas as entidades |
| **Abstração** | Classe `Ninja` abstrata definindo contrato para subclasses |

### Outros Conceitos Avançados

| Conceito | Aplicação |
|----------|-----------|
| **Interfaces** | `IMissionavel` define contrato para operações de missão |
| **Enums** | 4 enums tipados para garantir integridade dos dados (Clan, Rank, MissionType, MissionClassification) |
| **Collections** | `List<Mission>` e `ArrayList` para armazenamento dinâmico |
| **Sobrecarga** | Construtores com e sem parâmetro de rank |
| **Expressões Switch** | Uso moderno de switch expressions (Java 14+) |
| **Validação** | Tratamento de exceções e validação de entrada robusta |
| **Service Layer** | Separação de responsabilidades com `NinjaAcademyService` |
| **Organização em Pacotes** | Estrutura modular (`entities`, `enums`, `interfaces`, `services`) |

---

## 📁 Estrutura de Diretórios

```
Ninja-Academy-System/
├── src/
│   ├── Program.java                          # Classe principal - Menu e ponto de entrada
│   └── model/
│       ├── entities/                         # Entidades do domínio
│       │   ├── Ninja.java                    # Classe abstrata base
│       │   ├── Mission.java                  # Entidade de missão
│       │   ├── Uchiha.java                   # Subclasse - Clã Uchiha
│       │   ├── Uzumaki.java                  # Subclasse - Clã Uzumaki
│       │   ├── Hyuga.java                    # Subclasse - Clã Hyuga
│       │   ├── Senju.java                    # Subclasse - Clã Senju
│       │   └── Nara.java                     # Subclasse - Clã Nara
│       ├── enums/                            # Enumerações tipadas
│       │   ├── Clan.java                     # Tipos de clãs
│       │   ├── Rank.java                     # Ranks ninja
│       │   ├── MissionType.java              # Tipos de missão
│       │   └── MissionClassification.java    # Classificação de dificuldade
│       ├── interfaces/                       # Contratos de comportamento
│       │   └── IMissionavel.java             # Interface para operações de missão
│       └── services/                         # Camada de serviço
│           └── NinjaAcademyService.java      # Regras de negócio e validações
├── out/                                      # Arquivos compilados (gerado automaticamente)
├── preview.gif                               # Demonstração visual
├── README.md                                 # Documentação do projeto
└── .gitignore                                # Arquivos ignorados pelo Git
```

### Responsabilidades por Pacote

| Pacote | Responsabilidade | Arquivos |
|--------|------------------|----------|
| `entities` | Modelagem de dados e entidades de domínio | 7 arquivos |
| `enums` | Constantes tipadas para integridade | 4 arquivos |
| `interfaces` | Definição de contratos de comportamento | 1 arquivo |
| `services` | Regras de negócio e orquestração | 1 arquivo |

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
cd Ninja-Academy-System
```

### 2. Compile o Projeto

```bash
# Compile todas as classes
javac -d out src/**/*.java src/*.java
```

### 3. Execute a Aplicação

```bash
java -cp out Program
```

### 🎮 Usando o Sistema

Após executar, você será apresentado ao menu principal:

```
----------------------------------
----- Ninja Academy System -------
----------------------------------
1. Cadastrar Ninja
2. Listar Ninjas
3. Registrar Missão
0. Sair
Escolha: 
```

#### Fluxo de Utilização

1. **Cadastrar Ninja**: Selecione o clã (1-5), informe nome, idade, aldeia e rank opcional
2. **Listar Ninjas**: Veja a lista, selecione um ninja e acesse o submenu com:
   - Histórico de Missões
   - Editar Ninja (com feedback visual imediato)
   - Remover Ninja (com confirmação e retorno automático ao menu)
3. **Registrar Missão**: Atribua missões diretamente do menu principal

---

## 🔄 Fluxo de Navegação

```
┌─────────────────┐
│  Menu Principal │
└────────┬────────┘
         │
    ┌────┴────┬────────────┐
    │         │            │
    ▼         ▼            ▼
[Cadastrar] [Listar]  [Registrar Missão]
    │         │            │
    │    ┌────┴────┐       │
    │    │         │       │
    │    ▼         ▼       │
    │ [Seleciona] [Info]  │
    │    │                │
    │    ▼                │
    │ ┌──┴──────────┐     │
    │ │ Submenu     │     │
    │ │ Ninja       │◄────┘
    │ └──┬──────────┘
    │    │
    ├────┼────┬─────────┐
    │    │    │         │
    ▼    ▼    ▼         ▼
[Hist] [Edit] [Remove] [Voltar]
    │    │    │
    │    │    └────────► Retorna ao Menu Principal
    │    │
    │    └─────────────► Mostra Info Atualizada
    │
    └──────────────────► Volta ao Submenu
```

### Comportamentos Corrigidos

| Situação | Comportamento Antigo | Comportamento Atual |
|----------|---------------------|---------------------|
| Editar Ninja | Voltava ao submenu sem feedback | ✅ Exibe informações atualizadas imediatamente |
| Remover Ninja | Permanecia no submenu | ✅ Sai do submenu e retorna ao menu principal |
| Operar ninja removido | Permitia ações inválidas | ✅ Bloqueia operações e notifica usuário |

---

## 🔮 Roadmap

### ✅ Concluído (v2.0)

- [x] Estrutura inicial com herança e polimorfismo
- [x] Implementação de menu interativo com switch expressions
- [x] Validação robusta de dados de entrada
- [x] CRUD completo (Create, Read, Update, Delete)
- [x] **Substituição de array por `List<>` e `ArrayList`**
- [x] **Organização avançada em pacotes (packages)**
- [x] **Adição de 3 novos clãs (Hyuga, Senju, Nara)**
- [x] **Implementação de Enums (Clan, Rank, MissionType, MissionClassification)**
- [x] **Criação de Interface (IMissionavel)**
- [x] **Service Layer (NinjaAcademyService)**
- [x] **Sistema de Missões completo**
- [x] **Correção de fluxo: edição com feedback visual**
- [x] **Correção de fluxo: remoção com retorno ao menu**
- [x] **Tratamento de estado para ninjas removidos**

### 🚧 Em Desenvolvimento (v2.1)

- [ ] Adicionar busca/filtro por nome, clã ou rank
- [ ] Implementar ordenação de lista (por nome, rank, idade)
- [ ] Adicionar contador estatístico de missões por classificação
- [ ] Melhorar mensagens de erro e feedback ao usuário
- [ ] Criar método para promoção automática de rank baseado em missões

### 🔜 Planejamento Futuro (v3.0+)

- [ ] Persistência de dados em arquivo texto (.txt ou .csv)
- [ ] Persistência binária com Serializable
- [ ] Testes unitários com JUnit 5
- [ ] Documentação JavaDoc completa
- [ ] Refatoração para padrões de projeto (Factory, Strategy)
- [ ] Interface gráfica com JavaFX (opcional)

> **Nota:** Este projeto mantém-se intencionalmente em **Java Puro** sem frameworks como Spring Boot, focando no aprendizado sólido dos fundamentos da linguagem e POO.

---

## 👨‍💻 Autor

<div align="center">

| ![Yann Peclat](https://ui-avatars.com/api/?name=Yann+Peclat&background=0D8ABC&color=fff&size=80) |
|:------------------------------------------------------------------------------------------------:|
|                                         **Yann Peclat**                                          |
|                     Futuro Engenheiro de Software focado em Backend Java 🚀                      |

</div>

<div align="center">

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/yannpeclat/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/yannpeclat)

</div>

---

## 🤝 Contribuição

Contribuições são bem-vindas! Se você quiser melhorar este projeto:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

---

## 📄 Licença

Este projeto está sob a licença **MIT**. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

### O que você pode fazer:

✅ Usar comercialmente  
✅ Modificar  
✅ Distribuir  
✅ Usar privadamente  

### O que você precisa fazer:

⚠️ Incluir aviso de licença e copyright  

---

<div align="center">

**Se este projeto te ajudou de alguma forma, considere dar uma ⭐!**

Feito com ☕ e 🎯 por Yann Peclat

**Java Puro • POO • Sem Frameworks • Aprendizado Contínuo**

</div>
