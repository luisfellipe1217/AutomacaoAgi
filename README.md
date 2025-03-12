# 🚀 Automação de Testes - AgiBank

## 📌 Sobre o Projeto
Este projeto consiste na automação de testes do **AgiBlog**, desenvolvido utilizando **Java**, **Selenium WebDriver** e **Cucumber**. 
A estrutura segue o padrão **Page Object Model (POM)** para melhor organização e reutilização do código.

---

## 🛠️ Tecnologias Utilizadas
- **Java 17**
- **Maven**
- **Selenium WebDriver**
- **Cucumber**
- **JUnit**
- **GitHub Actions**

---

## 📂 Estrutura do Projeto
```bash
AutomacaoAgi/
│── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/     
│   ├── test/
│   │   ├── java/
|   |   |   |── pageObjects/ # Mapeamento dos elementos das paginas utilizadas na automação
│   │   │   ├── runners/    # Runners do Cucumber
│   │   │   ├── steps/      # Definições dos steps do Cucumber
|   |   |   ├── support/    # Definições do WebDriver
│   │   ├── resources/
│   │   │   ├── features/   # Features do Cucumber
│── pom.xml                 # Configuração do Maven
│── README.md               # Documentação do projeto
│── .github/workflows/      # Configuração do GitHub Actions
```

---

## 🔧 Configuração do Ambiente
### **Pré-requisitos:**
1. **Instalar o Java 17 ou superior**
2. **Instalar o Maven**
3. **Instalar o Google Chrome e o ChromeDriver** (caso esteja rodando localmente)
4. **Clonar o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/AutomacaoAgi.git
   cd AutomacaoAgi
   ```
5. **Executar os testes localmente**:
   ```bash
   mvn clean test
   ```

---

## 🚀 Execução dos Testes
### **Localmente**
Para rodar os testes localmente, utilize o seguinte comando:
```bash
mvn clean test
```
---

## 📊 Relatórios de Execução
Após a execução dos testes, um relatório em HTML será gerado na pasta:
```
target/
```
Para visualizar, abra o arquivo no navegador.

---

## 📌 Contato
Caso tenha dúvidas ou sugestões, entre em contato.

📧 Email: luis.fellipe1217@gmail.com
📌 LinkedIn: (https://www.linkedin.com/in/luis-fellipe-santos/)

