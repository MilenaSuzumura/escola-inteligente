# 🏫 Escola Inteligente 🧑‍🏫

Escola Inteligente é uma aplicação Java que interage através do terminal apresentando algumas funcionalidades para determinados departamentos; com o intuito de praticar Controle de Fluxo e Entrada de dados em Java.

<strong>OBS:</strong> ESSA ATIVIDADE FOI DESENVOLVIDA NA TRYBE.

<br>

## 📑 Informações básicas e Orientações 📑

<details>
  <summary><strong>⚙️ Técnologias usadas ⚙️</strong></summary><br>
  
  * Java;
  * Maven;
  * Eslint.
</details>
<details>
  <summary><strong>⌨️ Instalando Dependências ⌨️</strong></summary><br>
  
  Execute:  `mvn install`
</details>

<details>
  <summary><strong>🛠 Executando Testes 🛠</strong></summary><br>
  
  Para executar todos os testes basta rodar o comando: `mvn test`
  
  Para executar apenas uma classe de testes: `mvn test -Dtest="TestClassName"`
</details>

<br>

## 👥 Informações gerais 👥

<details>
  <summary><strong>🚪 Entrada Inicial	🚪</strong></summary><br>

```
Boas vindas a Escola Inteligente!
Escolha um departamento:
1 - Pessoa Estudante - Calcular idade em dias
2 - Secretaria - Calcular a média das notas
3 - Portaria - Gerar relatório de controle de acesso
```

</details>

<br>

### 🧑‍🎓 Pessoa Estudante 🧑‍🎓

<details>
  <summary><strong>Calcular a idade da pessoa estudante em dias</strong></summary><br>

Para isso, o usuário deverá enviar o `nome`, idade em `anos`, `meses` e `dias`.

<br>
  <ul>
    <li><p><strong>mensagem para nome: </strong><code>"Qual o nome da Pessoa Estudante?"</code></p></li>
    <li><p><strong>mensagem para pedir para informar a idade: </strong><code>"Qual a sua idade em anos, meses e dias?"</code></p></li>
    <li><p><strong>mensagem para os anos: </strong><code>"anos:"</code></p></li>
    <li><p><strong>mensagem para os meses: </strong><code>"meses:"</code></p></li>
    <li><p><strong>mensagem para os dias: </strong><code>""dias:""</code></p></li>
  </ul>

  <br>

<strong>OBS:</strong> A contagem é feita pensando que <code>todos os anos</code> contém <code>365</code> dias e que os <code>meses</code> contém <code>30</code> dias.

</details>

<details>
  <summary><strong>🌐 Conexão à Internet	🌐</strong></summary><br>
  
  1 - Criei um método chamado `conectarInternet` que irá receber o atributo `connectionRate` do tipo `double` e deverá retornar `true`ou `false`;
  
  2 - Para o atributo `connectionRate` ser true, a taxa de conexão deverá ser maior que 0.5, indicando uma conexão bem-sucedida;

  3 - Caso o atributo `connectionRate` for menor ou igual a 0.5, o método deve retornar false, indicando que a conexão falhou.

</details>

<br>

### 👤 Residente 👤

<details>
  <summary><strong>🫂 Criando Residente	🫂</strong></summary><br>
  
  1 - Criei vários atributos chamados: `nome` do tipo `String`, `idade` do tipo `int`, `peso` do tipo `double` e `altura` do tipo `double`;
  
  2 - Criei um constructor para receber os valores do atributos e assim, poder ser acessado.

</details>

<details>
  <summary><strong>🧮 Cálculo do IMC	🧮</strong></summary><br>
  
  1 - Criei um método chamado `calcularImc` que deverá retornar um `double` com o resultado do cálculo do IMC do residente;
  
  2 - Para fazer o cálculo, precisei descobrir o resultado da `alturaAoQuadrado`. Ou seja, multipliquei `altura` pela `altura`;

<!--

A funcionalidade de calcular a idade de uma pessoa estudante em dias para o departamento Pessoa Estudante.
A funcionalidade de calcular a média das notas de uma pessoa estudante para o departamento Secretaria.
A funcionalidade de gerar um relatório de controle de acesso das pessoas estudantes na escola para o departamento Portaria.

-->

