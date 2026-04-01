<h1 align="center">🥷 Lista Ninja</h1>

<p align="center">
  Sistema de gerenciamento de ninjas em Java com foco em Programação Orientada a Objetos
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=java">
  <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge">
  <img src="https://img.shields.io/badge/POO-Herança%20%7C%20Polimorfismo-blue?style=for-the-badge">
</p>

---

## 🎯 Sobre o Projeto

Projeto desenvolvido para praticar conceitos fundamentais de **Programação Orientada a Objetos (POO)** em Java.

A aplicação simula uma academia ninja onde é possível cadastrar, visualizar, editar e remover ninjas de diferentes clãs.

---

## 📸 Preview do Sistema

<p align="center">
  <img src="preview.gif" width="600">
</p>

---

## 🚀 Funcionalidades

### 🔹 Operações principais
- ✅ Criar ninjas (Uchiha e Uzumaki)
- ✅ Listar ninjas cadastrados
- ✅ Visualizar detalhes de cada ninja
- ✅ Editar ninjas existentes
- ✅ Remover ninjas

### 🔹 Extras
- ✅ Menu interativo via terminal
- ✅ Validação de entradas do usuário

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Herança
- Polimorfismo
- Arrays de objetos
- Estruturas de controle (`switch`, `do-while`)
- Entrada de dados com `Scanner`

---

## 🏗️ Estrutura do Projeto

```bash
src/
├── Program.java
└── entities/
    ├── Ninja.java
    ├── Uchiha.java
    └── Uzumaki.java
```

---

## 💻 Como Executar
```bash
# Clone o repositório
git clone https://github.com/yannpeclat/Ninja-Academy-System.git

# Acesse a pasta
cd Ninja-Academy-System/src

# Compile
javac entities/*.java Program.java

# Execute
java Program
```

---

## 📈 Evolução do Projeto
- v1.0.0 → Estrutura inicial com herança
- v1.1.0 → Implementação de menu interativo
- v1.2.0 → Uso de switch expression
- v1.3.0 → Validação de dados de entrada
- v2.0.0 → CRUD completo (criar, listar, editar, excluir ninjas)

---

## 🔮 Roadmap
🔹 Próximas melhorias

- Substituir array por ArrayList
- Melhorar organização em pacotes

🔹 Futuro (nível avançado)

- Persistência de dados (arquivo ou banco)
- API com Spring Boot
- Interface gráfica

---

## 👨‍💻 Autor

Yann Peclat
Futuro Engenheiro de Software focado em Backend Java 🚀

## 📄 Licença

Este projeto está sob a licença MIT.