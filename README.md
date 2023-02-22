## Spring Boot Unit Testing Controller | JUnit & Mockito

Dans ce repo, nous allons apprendre à effectuer des tests unitaires les API CRUD REST de la couche controller de Spring
Boot à l'aide de JUnit 5 et du framework Mockito.

### Technologies
---

- Java 17
- Spring Boot 3
- Lombok
- MapStruct
- JUnit 5
- Mockito
- AssertJ Library
- JsonPath
- Maven

### Quelques des points à noter
---

- Spring boot fournit une dépendance `spring-boot-starter-test`  pour les tests unitaires et les tests d'intégration de
  l'application Spring boot
- **Annotation @WebMvcTest** - pour tester les contrôleurs Spring MVC. De plus, le test basé sur @WebMvcTest s'exécute
  plus rapidement car il ne chargera que le contrôleur spécifié et ses dépendances uniquement sans charger l'application
  entière.

### Exécutez les tests unitaires
---

- Exécuter le test : `mvn test`

### Ressources utiles
---

- [JUnit Framework Best Practices](https://www.javaguides.net/2018/08/junit-framework-best-practices.html)
- [Best Practices for Unit Testing in Java](https://www.developer.com/java/best-practices-unit-testing-java/)