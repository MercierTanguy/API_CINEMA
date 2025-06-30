# API CINEMA 

Ce projet est une API RESTful développée en **Spring Boot 3.3.4**, avec persistance via **JPA** et une base de données **PostgreSQL**. Il permet de gérer une collection d’acteurs via des opérations CRUD (Create, Read, Update, Delete).

## Fonctionnalités

- Lister tous les acteurs
- Ajouter un acteur
- Récupérer un acteur par ID
- Modifier un acteur existant
- Supprimer un acteur
  
## Technologies utilisées

- Java 17
- Spring Boot 3.3.4
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven

## Endpoint 

- /actors (GET) 
- /actors (POST)
- /actors/{id} (GET)
- /actors/{id} (PUT)
- /actors/{id} (DELETE)
