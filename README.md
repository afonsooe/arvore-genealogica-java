# arvore-genealogica-java
# Árvore Genealógica em Java

Projeto acadêmico desenvolvido para a disciplina de Estrutura de Dados, com o objetivo de implementar uma árvore genealógica utilizando classes de árvore do Java e recursividade.

---

## Objetivo

Construir uma árvore genealógica com 5 níveis hierárquicos a partir de uma personalidade histórica, utilizando a classe `DefaultMutableTreeNode` da biblioteca padrão do Java.

---

## Pessoa escolhida

Dom Pedro II – Imperador do Brasil.

---

## Conceitos aplicados

- Estruturas de dados em árvore
- Hierarquia de nós (pai e filhos)
- Recursividade
- Organização de dados históricos

---

## Tecnologias utilizadas

- Java
- Biblioteca `javax.swing.tree`
- IDE (IntelliJ / Eclipse / VS Code)

---

## Estrutura da árvore

A árvore foi organizada nos seguintes níveis:

1. Pessoa principal (raiz)
2. Pais
3. Avós
4. Bisavós
5. Trisavós

Todos os níveis foram preenchidos com dados históricos reais.

---

## Fontes utilizadas na pesquisa

* Wikipedia
* Sites de história sobre a família imperial brasileira
* Artigos sobre a genealogia da família real portuguesa e austríaca

---

## Funcionamento da recursividade

O método `imprimirArvore` percorre a árvore de forma recursiva, imprimindo cada nó com indentação proporcional ao seu nível hierárquico.

---

## Em casos em que um ancestral não foi encontrado, como isso foi representado no código?

Neste trabalho não foi necessário utilizar ancestrais desconhecidos, pois foi possível encontrar informações históricas suficientes para completar os cinco níveis exigidos da árvore genealógica.

---

## Qual foi a maior dificuldade ao implementar esta atividade?

A maior dificuldade foi compreender a lógica da recursividade e organizar corretamente as ligações entre os nós da árvore, garantindo que cada ancestral fosse conectado ao nível correto da estrutura genealógica.

---

## Como executar

Clone o repositório:
   git clone https://github.com/SEU-USUARIO/arvore-genealogica-java.git
