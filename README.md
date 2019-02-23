# OpenAPI Bookstore
In diesem Beispielprojekt wird anhand einer OpenAPI Spezifikation (OAS3) und der OpenAPI Generator CLI ein Mock Server generiert.

## Vorgehensweise
1. Mit dem Swagger-Editor wurde eine API Spezifikation (v3) erzeugt und im Anschluss in ein api.yaml Datei exportiert.
2. Die Datei `config.json` enthält die Konfiguration für den OpenAPI Generator
3. Mit der OpenAPI CLI einen Rumpf für das Spring-Maven Projekt erzeugen (siehe `generate-project.sh`).
4. Die `api.yaml` Datei wird in die Maven Resources übernommen und kann im Anschluss im Root-Verzeichnis gelöscht werden.