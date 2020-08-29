# Brasil Utils

Classes utilitárias para facilitar projetos no Brasil.

## Descrição

Resolvi reunir todas as classes de utilitarios para assuntos somente do brasil que ja construi. Comecei agora então tem poucos assuntos.

## Assuntos

### Placas

* PlacaUtil
  * Valida placa atual e placa tipo mercosul, exemplos abaixo:
  
  * Valida Placa mercosul:

  ```java
  final String placa = "EZT9B23";
  assertTrue(PlacaUtil.isPlacaMercosul(placa));
  ```

  * Valida Placa antiga:

  ```java
  final String placa = "HTN9905";
  assertTrue(PlacaUtil.isPlaca(placa));
  ```

### Documento

* DocumentoUtil
  * Valida CPF e CNPJ com ou sem pontuacao

## Testes

* Execute os testes implementados com maven ou gradle

```shell
gradle test
```

ou

```shell
mvn test
```

## Dependencias

* Usando JUnit5

## Historio de Versões

* 0.1.1
  * Adicionado README.MD e alterado placas, cpf e cnpj de exemplo nas classes de teste.
  * See [commit change](commits) or See [release history](releases)
* 0.1
  * Primeira versão

## Agradecimentos

Inspiração, trechos de código, etc.

* [junit-platform](https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html)
* [Gerador de CPF](https://www.4devs.com.br/gerador_de_cpf)
* [Gerador de CNPJ](https://www.4devs.com.br/gerador_de_cnpj)
* [Gerador de Placas](https://www.4devs.com.br/gerador_de_placa_automoveis)
