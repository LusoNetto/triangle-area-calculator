# Calculadora de Área de Triângulo

Este projeto é uma aplicação Java CLI para calcular a área de triângulos de diferentes formas, aplicando conhecimentos de Orientação a Objetos e TDD (Desenvolvimento Orientado a Testes).

## Estrutura do Projeto

- `Main.java` - Classe principal que contém a interface de linha de comando (CLI).
- `Triangulo.java` - Classe que representa um triângulo e contém os métodos para calcular a área.
- `TrianguloTest.java` - Testes unitários para a classe `Triangulo` usando JUnit 5.
- `CLITest.java` - Testes unitários para a classe `CLI` usando JUnit 5.
- `MainTest.java` - Testes de integração para a interface CLI.
- `pom.xml` - Arquivo de configuração do Maven.

## Pré-requisitos

- [JDK 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) - Java Development Kit
- [Maven](https://maven.apache.org/download.cgi) - Para gerenciamento de dependências e execução de testes
- [Git](https://git-scm.com/downloads) - Sistema de controle de versão

## Configuração do Ambiente

1. **Clone o Repositório**

   ```bash
   git clone https://github.com/seu-usuario/triangle-area-calculator.git
   cd triangle-area-calculator

# Compile o projeto usando Maven:

## bash
``mvn clean compile``
## Para executar todos os testes (unitários e de integração), use o comando:

## bash
``mvn test``
## Para executar a aplicação e calcular a área de um triângulo, use o seguinte comando:

## bash
``mvn exec:java -Dexec.mainClass="Main"``
## A aplicação irá solicitar ao usuário que escolha o método de cálculo da área:

# Base e Altura:

- Digite 1 e pressione Enter.
- Insira a base do triângulo e pressione Enter.
- Insira a altura do triângulo e pressione Enter.
- A área será calculada e exibida.

# Fórmula de Heron:

- Digite 2 e pressione Enter.
- Insira o comprimento do lado A do triângulo e pressione Enter.
- Insira o comprimento do lado B do triângulo e pressione Enter.
- Insira o comprimento do lado C do triângulo e pressione Enter.
- A área será calculada e exibida.

# MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
