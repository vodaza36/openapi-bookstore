# OpenAPI Bookstore
In diesem Beispielprojekt wird anhand einer OpenAPI Spezifikation (OAS3) und der OpenAPI Generator CLI ein Mock Server generiert.

## Branch '2-maven-integration'
Dieser Branch beschäftigt sich mit dem OpenAPI CodeGen und der Maven Integration.

## Vorgehensweise
1. In der `pom.xml` ist das CodeGen Maven Plugin bereits vorinitalisiert.
2. Der Code kann wie folgt generiert werden: `mvn clean generate-sources`
3. Um die Default-Implementierung zu erweitern, muss eine neue Java-Klasse angelegt werden, welche das BooksApiDelegate Interface implementiert.