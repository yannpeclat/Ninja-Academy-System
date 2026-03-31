Ninja Academy System
Java
GitHub stars

Sistema completo de gerenciamento da Academia Ninja com herança, polimorfismo e menus interativos!

🎮 Demo

Copy code
=== NINJAS MENU ===
1. Criar Ninja    2. Listar Ninja    0. Sair
> 1

1. Uchiha    2. Uzumaki
> 1
Nome: Sasuke    Idade: 17    Aldeia: Folha
✅ Sasuke criado!

> 2
1. Sasuke
> 1
=== Detalhes ===
Nome: Sasuke    Aldeia: Folha    Idade: 17
Habilidade: Sharingan Ativado! 🔥
🚀 Funcionalidades
Feature

Status

✅ **Herança Polimórfica

Ninja ← Uchiha, Uzumaki

✅ **Menu Interativo

do...while + switch expression

✅ **CRUD Completo

Criar + Listar + Selecionar

✅ **Validação Robusta

Tipos inválidos + Buffer

✅ **UX Profissional

Locale.US + Mensagens claras

🏗️ Arquitetura

Copy code
src/
├── Program.java           # Menu + Controller
└── entities/
├── Ninja.java         # Abstract Parent
├── Uchiha.java        # Sharingan 🔥
└── Uzumaki.java       # Bijuu Mode 💥
Diagrama UML
mermaid

Copy code
classDiagram
class Ninja {
-String nome
-int idade
-String aldeia
+mostrarInformacoes()
}
class Uchiha {
-String habilidadeEspecialUchiha
+mostrarInformacoes()
}
class Uzumaki {
-String habilidadeEspecialUzumaki  
+mostrarInformacoes()
}
Ninja <|-- Uchiha
Ninja <|-- Uzumaki
💻 Como Executar
bash

Copy code
# 1. Clone
git clone https://github.com/SeuUser/ninja-academy.git
cd ninja-academy/src

# 2. Compile
javac entities/*.java Program.java

# 3. Execute
java Program
🧠 Evolução do Projeto
v1.0

Classes básicas + Herança

v1.1

Menu interativo** do...while

v1.2

Switch expression** (Java 14+)

v1.3

Validação nula** ninjaNovo != null

v2.0

➡️ **Próximos upgrades

🔮 Roadmap v2.0+
Imediato (v2.0)
[ ] Deletar Ninja (case 4)
[ ] Editar Ninja (case 5)
[ ] ArrayList dinâmico
[ ] Limite academia (5/10 ninjas)
Avançado (v3.0)
[ ] Salvar/ Carregar File I/O
[ ] Mais clãs Senju, Hyuga
[ ] Batalha Interface Atacante
[ ] JSON Gson export
Enterprise (v4.0)
[ ] Banco SQLite
[ ] REST API Spring Boot
[ ] Frontend React
[ ] Docker 🐳
🎯 Conceitos Dominados

Copy code
🔥 Herança + Polimorfismo
🔥 Arrays de objetos
🔥 Switch expression (Java moderno)
🔥 Validação entrada
🔥 Gerenciamento memória
🔥 UX/CLI profissional
👨‍💻 Desenvolvedor
Yann - LinkedIn
De iniciante a arquiteto em 1 aula! 🚀

📄 Licença
MIT License - Use livremente!

⭐ Star se curtiu!
🤝 Fork e contribua!