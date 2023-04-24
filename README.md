# Meu Projeto Spring Boot

Esse é um projeto criado  para fins de estudos.

### AUTOR :
[Marco Antonio Menezes Jorge](https://github.com/MarcoAntonioMj)
## Tecnologias Utilizadas
- [Spring Boot](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack)
- [Visual Studio Code](https://code.visualstudio.com/)

### Licença
Este projeto está licenciado sob a Licença MIT - consulte o arquivo LICENSE para obter detalhes.

### Como Contribuir
- Faça um fork do repositório
- Crie um branch com a sua feature (git checkout -b feature/nome-da-feature)
- Faça commit das suas alterações (git commit -am 'Adiciona feature')
- Faça push para o branch (git push origin feature/nome-da-feature)
- Abra um Pull Request

## Como Usar o Spring Boot no Visual Studio Code
- Instale o plugin do Spring Boot Extension Pack no Visual Studio Code.
- Crie um novo projeto Spring Boot usando o Spring Initializr ou o comando Spring Boot: Create a Maven Project no menu de comandos do Visual Studio Code.
- Abra o arquivo pom.xml do projeto e certifique-se de que as dependências do Spring Boot necessárias estejam listadas.
- Configure o arquivo application.properties com as configurações de banco de dados ou outras configurações específicas do projeto.
- Escreva o código da sua aplicação Spring Boot usando a linguagem de programação Java e os recursos do Spring Framework.
- Execute a aplicação Spring Boot usando o comando Spring Boot: Run no menu de comandos do Visual Studio Code ou usando a linha de comando mvn spring-boot:run.
- Para mais informações sobre como usar o Spring Boot no Visual Studio Code, consulte a documentação do [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack).

# JPA

Para eu começar meus estudos em JPA, estendi meu conhecimento realizando um curso na Udemy, o ["Spring Framework 5 e Spring Boot 2"](https://www.udemy.com/course/spring-framework-5-spring-boot-2/). Com o curso, adquiri os conceitos e práticas essenciais sobre o assunto, o que me ajudou a compreender melhor o funcionamento e a aplicação da JPA.

Além disso, criei um arquivo em PDF com conceitos e exemplos de aplicação JPA básicos, disponibilizado no meu repositório no GitHub. Isso me permitiu revisar os tópicos aprendidos no curso e reforçar meu entendimento sobre a JPA.[clique aqui para acessar o PDF](https://github.com/MarcoAntonioMj/Spring-Boot/tree/main/PDFS)

Com esses recursos, estou dando os primeiros passos na aprendizagem de JPA e espero aprimorar meus conhecimentos nessa área.

### @ Spring boot 

Segue abaixo uma lista com algumas das principais anotações JPA em Spring Boot, um breve resumo do que cada uma faz e a importação necessária: 

### @Entity - Indica que uma classe é uma entidade JPA que será mapeada para uma tabela do banco de dados.
```
import javax.persistence.Entity;
@Entity
public class MinhaEntidade {
  //...
}
```
### @Table - Especifica o nome da tabela do banco de dados correspondente a uma entidade JPA.
```
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "nome_da_tabela")
public class MinhaEntidade {
  //...
}
```
### @Id - Indica o atributo que é a chave primária da entidade.
```
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MinhaEntidade {
  @Id
  private Long id;
  //...
}
```
### @GeneratedValue - Especifica como a chave primária será gerada automaticamente pelo banco de dados.
```
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MinhaEntidade {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  //...
}
```
### @Column - Especifica o nome e outras propriedades de uma coluna do banco de dados correspondente a um atributo da entidade.
```
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MinhaEntidade {
  @Id
  private Long id;

  @Column(name = "nome_completo", nullable = false)
  private String nome;
  //...
}
```
## Eu pedi para o ChatGPT para fazer um exercício para treinar essas anotações: .
[clique aqui para acessar os exer](https://github.com/MarcoAntonioMj/Spring-Boot/blob/main/exer%20jpa.pdf)

