# bank-api

Back-end Spring Boot fictif exposant les données bancaires de clients via une API REST.

Back-end fonctionnant avec [bank-dashboard](https://github.com/donovan-cartier/bank-dashboard), front-end Angular qui consomme cette API. En production, les deux projets ont pour objectif de fonctionner ensemble.

---

## Fonctionnalités

- Consultation des clients
- Consultation des comptes (courant / épargne) par client
- Historique des transactions par compte
- Données fictives pré-chargées au démarrage

---

## Stack

- **Java 22**
- **Spring Boot 4**
- **PostgreSQL**
- **Maven**

---

## Architecture

```
src/main/java/
├── controller/
│   ├── ClientController.java      # GET /clients, /clients/{id}, /clients/{id}/accounts
│   ├── AccountController.java     # GET /accounts, /accounts/{id}, /accounts/{id}/transactions
│   └── TransactionController.java # GET /transactions, /transactions{id}
├── service/
│   ├── ClientService.java
│   ├── AccountService.java
│   └── TransactionService.java
├── repository/
│   ├── ClientRepository.java
│   ├── AccountRepository.java
│   └── TransactionRepository.java
└── model/
    ├── Client.java
    ├── Account.java
    └── Transaction.java
```

---

## Endpoints

```
GET /clients                              → liste des clients
GET /clients/{id}                         → détail d'un client
GET /clients/{id}/accounts                → comptes d'un client
GET /accounts/{id}                        → détail d'un compte
GET /accounts/{id}/transactions           → transactions d'un compte
GET /transactions                         → toutes les transactions
GET /transactions{id}                     → détail d'une transaction
```

## Exemple
 
`GET /clients/1/accounts`
 
```json
[
  {
    "id": 1,
    "iban": "FR00 0000 0000 0000 0000 0000 001",
    "type": "CHECKING",
    "balance": 2450.00,
    "client": {
      "id": 1,
      "firstName": "Jean",
      "lastName": "Dupont",
      "email": "jean.dupont@example.com"
    }
  },
  {
    "id": 2,
    "iban": "FR00 0000 0000 0000 0000 0000 002",
    "type": "SAVINGS",
    "balance": 8900.00,
    "client": {
      "id": 1,
      "firstName": "Jean",
      "lastName": "Dupont",
      "email": "jean.dupont@example.com"
    }
  }
]
```

---

## Lancer en local

Prérequis : Java 22, PostgreSQL

Créer la base de données :

```sql
CREATE DATABASE bank;
```

Configurer `src/main/resources/application.properties` :

```properties
spring.application.name=bank_api
spring.datasource.url=jdbc:postgresql://localhost:5432/bank_api
spring.datasource.username=postgres
spring.datasource.password=motdepasse
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.sql.init.mode=always
spring.jpa.defer-datasource-initialization=true
```

Lancer le projet depuis IntelliJ ou :

```bash
./mvnw spring-boot:run
```

L'API tourne sur `http://localhost:8080`. Les données fictives sont chargées automatiquement au premier démarrage via `data.sql`.

La documentation Swagger est accessible sur `http://localhost:8080/swagger-ui/index.html`.

---

## Projet associé — bank-dashboard

Ce back-end fait partie d'un projet full-stack avec [bank-dashboard](https://github.com/donovan-cartier/bank-dashboard), le front-end Angular qui consomme cette API.

En production, les deux projets fonctionnent ensemble :

```
bank-dashboard (Angular)  ──►  bank-api (Spring Boot)  ──►  PostgreSQL
```
