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

<!--

<details>
  <summary><strong>🛠 Executando Testes 🛠</strong></summary><br>
  
  Para executar todos os testes basta rodar o comando: `mvn test`
  
  Para executar apenas uma classe de testes: `mvn test -Dtest="TestClassName"`
</details>

-->

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
  <summary><strong>Calcula a idade da pessoa estudante em dias</strong></summary><br>

Para isso, o usuário deverá enviar o `nome`, idade em `anos`, `meses` e `dias`.

<br>
  <ul>
    <li><p><strong>mensagem para nome: </strong><code>Qual o nome da Pessoa Estudante?</code></p></li>
    <li><p><strong>mensagem para pedir para informar a idade: </strong><code>Qual a sua idade em anos, meses e dias?</code></p></li>
    <li><p><strong>mensagem para os anos: </strong><code>anos:</code></p></li>
    <li><p><strong>mensagem para os meses: </strong><code>meses:</code></p></li>
    <li><p><strong>mensagem para os dias: </strong><code>dias:</code></p></li>
    <li><p><strong>mensagem final: </strong><code>A idade de Nome em dias é TotalDeDias.</code></p></li>
  </ul>

  <br>

<strong>OBS:</strong> A contagem é feita pensando que <code>todos os anos</code> contém <code>365</code> dias e que os <code>meses</code> contém <code>30</code> dias.

</details>

<br>

### ✍️ Secretaria ✍️

<details>
  <summary><strong>Calcula a média das notas de uma pessoa estudante</strong></summary><br>

  Para isso, o usuário deverá enviar o `nome` e as notas: `nota 1`, `nota 1`, `nota 3` e `nota 4`.
  
<br>
  <ul>
    <li><p><strong>mensagem para nome: </strong><code>Qual o nome da Pessoa Estudante?</code></p></li>
    <li><p><strong>mensagem para a nota 1: </strong><code>Avaliação 1:</code></p></li>
    <li><p><strong>mensagem para a nota 2: </strong><code>Avaliação 2:</code></p></li>
    <li><p><strong>mensagem para a nota 3: </strong><code>Avaliação 3:</code></p></li>
    <li><p><strong>mensagem para a nota 4: </strong><code>Avaliação 4:</code></p></li>
    <li><p><strong>mensagem final: </strong><code>A média das notas de Nome é Media</code></p></li>
  </ul>

  <br>

<strong>OBS:</strong> A contagem é feita somando <code>todas as notas</code> todos os anos</code> e divindo por <code>4</code>

</details>

<br>

### 🚪 Portaria 🚪

<details>
  <summary><strong>Realiza o controle de acesso e a emissão do relatório</strong></summary><br>

#### 🚪 Entrada Inicial	🚪
```
Entre com o número correspondente à opção desejada:
1 - Registrar o acesso de pessoa estudante
2 - Finalizar o acesso e emitir o relatório
```

<br>

* Se o usuário retornar o número `1`, a seguinte mensagem retornará: `Entre com a idade da pessoa estudante:`.
  1 - Após, caso o usuário mandar um número menor que 11, a mensagem será: `Pessoa estudante do Ensino Fundamental I, catraca liberada!`.
  2 - Caso o usuário mandar um número entre 11 à 14, a mensagem será: `Pessoa estudante do Ensino Fundamental II, catraca liberada!`.
  3 - E caso o usuário mandar um número maior que 14, a mensagem será: `Pessoa estudante do Ensino Médio, catraca liberada!`.
  4 - Se o usuário não mandar um número, a mensagem será: `Idade incorreta`.

* Se o usuário retornar o número `2`, após cadastrar a entrada dos estudantes, ele mostrará as seguintes informações: `A quantidade de estudantes de cada ensino que entraram`, `a porcentagem de estudantes de cada ensino` e `a quantidade total`.

<br>

#### Exemplo de saída:
  
```
----- Quantidade -----
Ensino Fundamental I: 40
Ensino Fundamental II: 100
Ensino Médio: 60

----- Percentual -----
Ensino Fundamental I: 20.0%
Ensino Fundamental II: 50.0%
Ensino Médio: 30.0%

TOTAL: 200
```

<br>

</details>

