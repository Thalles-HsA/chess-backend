# ♟️ Xadrez Backend
Este é o backend da aplicação de xadrez, desenvolvido em Java 17 com Spring Boot 3.4.4. Ele fornece uma API RESTful para representar o estado do tabuleiro, processar movimentos e preparar a integração futura com um motor de inteligência artificial.

## 📦 Tecnologias utilizadas
- Java 17
- Spring Boot 3.4.4
- Maven
- API REST
- Arquitetura em camadas (Controller, Service, Model)

## 🚀 Como executar o projeto
### ✅ Pré-requisitos

- Java 17 ou superior
-  Maven 3.8 ou superior
- Git
- IDE de sua preferência (IntelliJ, VSCode, Eclipse...)

### ▶️ Rodando localmente

- git clone https://github.com/seu-usuario/xadrez-backend.git  
- cd xadrez-backend  
- ./mvnw spring-boot:run
- O servidor será iniciado em: http://localhost:8080

### 🔗 Endpoints disponíveis

## GET /game

Retorna o estado atual do tabuleiro de xadrez.

**Exemplo de resposta:**

{
  "board": [
    ["bR", "bN", "bB", "bQ", "bK", "bB", "bN", "bR"],
    ["bP", "bP", "bP", "bP", "bP", "bP", "bP", "bP"],
    [null, null, null, null, null, null, null, null],
    [null, null, null, null, null, null, null, null],
    [null, null, null, null, null, null, null, null],
    [null, null, null, null, null, null, null, null],
    ["wP", "wP", "wP", "wP", "wP", "wP", "wP", "wP"],
    ["wR", "wN", "wB", "wQ", "wK", "wB", "wN", "wR"]
  ]
}

## POST /game/move
Envia uma jogada.
Corpo da requisição:

{
  "from": "e2",
  "to": "e4"
}

Respostas possíveis:

"OK"
"Invalid move"


### 🧩 Estrutura do projeto
src/main/java/com/br/xadrez/
├── controller     -> Endpoints REST  
├── service        -> Lógica de negócio  
├── model          -> Representação de peças, tabuleiro e movimentos  
├── dto            -> (Futuro) Objetos de transferência  
└── util           -> Utilitários (FEN, validações etc)


### 🎯 Futuras implementações
Validação de jogadas

Controle de turnos (branco/preto)

Histórico de jogadas

Exportação/importação em FEN

Integração com motor de IA (Python)

Persistência com banco de dados

Suporte a roque, promoção e en passant

### 📜 Licença
Este projeto está licenciado sob a MIT License.