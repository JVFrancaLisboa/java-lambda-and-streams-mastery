# 📌 Java Lambda & Streams Mastery

## Domine Programação Funcional Moderna com Java — na Prática.

Este repositório reúne **exemplos, exercícios e demonstrações reais** do uso de Expressões Lambda, API Streams, Collectors e outros recursos funcionais do Java moderno (Java 8+).

O objetivo é servir como um **acervo de estudos estruturado**, ideal tanto para revisão quanto para preparação para entrevistas técnicas.

---

## 🚀 Conteúdo e Habilidades Demonstradas

Aqui estão as habilidades de Java Avançado que você desenvolverá e demonstrará neste repositório:

### 1. Expressões Lambda

* Estrutura de uma lambda e Funções Anônimas.
* Implementação das Interfaces Funcionais principais: **`Function`**, **`Predicate`**, **`Consumer`** e **`Supplier`**.
* Uso de Lambdas com blocos de código e múltiplos parâmetros.

### 2. Streams API

* **Criação de Streams:** (A partir de Listas, Arrays, `Stream.of`, etc.).
* **Operações Intermediárias:** `filter()`, `map()`, `flatMap()`, `distinct()`, `sorted()`, `limit()`.
* **Operações Terminais:** `collect()`, `reduce()`, `forEach()`, `count()`, `anyMatch()`.

### 3. Collectors & Transformações de Dados

* Uso de `Collectors.toList()`, `toSet()`, `joining()`, `counting()`.
* Técnicas de **Agrupamento (`groupingBy`)** e Particionamento.
* Cálculos estatísticos: soma, média e resumo com `summingInt()`, `averagingDouble()`.
* Conversão para `Map` (`toMap`).

### 4. Exemplos Práticos

* Filtrar e processar objetos (ex.: encontrar usuários com base em critérios).
* **Transformação de Entidades em DTOs** (Mapeamento de Objetos).
* Ordenação customizada e Agrupamento de listas por categoria.
* Criação de **Pipelines completos** com múltiplas operações para alto desempenho.

---

## 🧠 Por que este Repositório é Essencial?

Este conteúdo consolida conhecimentos essenciais do Java moderno, especialmente aqueles que empresas realmente testam em entrevistas técnicas — como **manipulação eficiente de coleções, imutabilidade, programação funcional** e boas práticas em pipelines de dados.

Demonstrar domínio em Streams e Lambdas é um grande diferencial em qualquer vaga de Backend Java.

## 🛠️ Como executar

### Pré-requisitos

* **Java 17+** (ou superior)
* **Maven** ou **Gradle** (para projetos estruturados)

### Rodando os exemplos

Para exemplos simples (arquivos `.java`):
```bash
javac src/Main.java
java Main
