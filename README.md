# 🎮 Tic Tac Toe Project

This repository contains two versions of the Tic Tac Toe game:

- *CLI Version (Console-based Java):*  
  Playable directly in the terminal.  
  No frameworks required.

- *Web Version (Spring Boot + HTML/CSS):*  
  Playable in the browser with a frontend and backend.  
  REST APIs implemented with Spring Boot.

---

## 📂 Project Structure

tic-tac-toe/  
├── cli-tictactoe/   # CLI version (console game)  
└── web-tictactoe/   # Web version (Spring Boot + Frontend)

---

## 🛠 Prerequisites

Before running either project, make sure you have:

- Java Development Kit (JDK 17 or higher)  
- Maven 3.9+  
- Git (to clone the repository)

Optional IDEs:

- IntelliJ IDEA  
- Eclipse  
- VS Code with Java extensions

---

## 🚀 Quick Start

### ▶ CLI Version

git clone <repo-url>
cd cli-tictactoe
javac Main.java
java Main

- Enter numbers 1-9 to place your move.  
- Player X starts first.

---

### 🌍 Web Version

git clone <repo-url>
cd web-tictactoe
mvn clean package
java -jar target/web-tictactoe-0.0.1-SNAPSHOT.jar

- Visit: http://localhost:8080

### Frontend files:

- src/main/resources/templates/index.html  
- src/main/resources/static/style.css

### REST APIs:

- GET /api/game  
- POST /api/game/move  
- POST /api/game/reset

---

## 👨💻 Authors

Developed by 'V-Jash' 
Contact: jashwanthvallabhaneni@gmail.com

---

### CLI-TicTacToe-Guide.pdf (contents)

Title: Tic Tac Toe – CLI Version

Sections:  
1. Introduction  
- Simple 3x3 Tic Tac Toe played in the console.

Prerequisites:  
- JDK 17+  
- Any IDE (IntelliJ, Eclipse, VS Code) or plain text editor

Setup commands:

git clone <repo-url>
cd cli-tictactoe
javac Main.java
java Main

- Enter numbers 1-9 to place your move.  
- Player X starts first.

---

### Web-TicTacToe-Guide.pdf (contents)

Title: Tic Tac Toe – Web Version

Sections:  
1. Introduction  
- Spring Boot backend + HTML/CSS frontend.  
- Playable in any browser.

Prerequisites:  
- JDK 17+  
- Maven 3.9+  
- IDE: IntelliJ (recommended), Eclipse, or VS Code

Setup commands :

git clone <repo-url>
cd web-tictactoe
mvn clean package
java -jar target/web-tictactoe-0.0.1-SNAPSHOT.jar

Run in Browser:  
Visit: http://localhost:8080

Use REST APIs:  
- GET /api/game  
- POST /api/game/move  
- POST /api/game/reset

Frontend files:  
- src/main/resources/templates/index.html  
- src/main/resources/static/style.css
