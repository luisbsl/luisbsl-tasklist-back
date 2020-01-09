# Sistema de Gestão de Tarefas

API Rest em Spring Boot para gestão de tarefas

Cliente em React hospedado em https://luisbsl-tasklist-web.herokuapp.com/

### Stack
* Java 8
* Spring Boot
* Maven
* Docker
* docker-compose

## Rodando local

```docker-compose up -d```

```./mvnw clean spring-boot:run -DskipTests -Dspring-boot.run.profiles=dev```


### Hospedagem Heroku
https://luisbsl-tasklist-back.herokuapp.com/tasks

### Endpoints

* GET - https://luisbsl-tasklist-back.herokuapp.com/tasks
* POST - https://luisbsl-tasklist-back.herokuapp.com/tasks - Pass objeto json
* PUT - https://luisbsl-tasklist-back.herokuapp.com/tasks - Pass objeto json
* DELETE - https://luisbsl-tasklist-back.herokuapp.com/tasks/id - Id

### Considerações
Pontos a melhorar
* Cobertura de testes unitários e de integração
* Documentação Swagger
* Versionamento através de content negotiation - vnd.tasklist+json (back e front)