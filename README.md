# OpenAPI Bookstore
In diesem Beispielprojekt wird anhand einer OpenAPI Spezifikation (OAS3) und der OpenAPI Generator CLI ein Mock Server generiert.

## Vorgehensweise
1. Mit dem Swagger-Editor wurde eine API Spezifikation (v3) erzeugt und im Anschluss in ein api.yaml Datei exportiert.
2. Die Datei `config.json` enthält die Konfiguration für den OpenAPI Generator
3. Mit der OpenAPI CLI einen Rumpf für das Spring-Maven Projekt erzeugen (siehe `generate-project.sh`).
4. Die `api.yaml` Datei wird in die Maven Resources übernommen und kann im Anschluss im Root-Verzeichnis gelöscht werden.
5. Service Implementierung `BooksApiService` im Package `org.openapitools.api.service` erzeugt 
6. Maven Generate-Phase starten um die API zu generieren: `mvn clean gernerate-sources`
7. Spring-Boot Service starten: `mvn spring-boot:run`
8. CURL Request zum Testen des Services: `curl -X GET http://localhost:8080/v1/books`
