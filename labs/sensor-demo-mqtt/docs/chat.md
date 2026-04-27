nili3/sensor/nili3_co2/state und nili3/sensor/nili3_temperature/state

Erstelle die fsd und tech-spec als adoc

Die aktuelle Version von Quarkus ist 3.34.5, Java 25, postgres 18 (auf alpine gedockert)

the Configuration of the docker-containers (docker compose) should be in deployment/docker/

The database name is "db" and the username = "app" and password = "app" in postgres

erstelle nun die Anwendung

erstelle einen Ordner "backend" und kopiere alle quarkus bezogenen Dateien hinein, damit die Struktur übersichtlich bleibt.

add open-api dependency for swagger-ui

create a .env file with the mqtt-host and the username and password for the mqtt server

do not use deprecated properties like "quarkus.hibernate-orm.database.generation" but use the new ones like "quarkus.hibernate-orm.database.generation=drop-and-create" instead

make a profile for development and production, where in development the database is dropped and created on startup, and in production it is not

claude --resume 450fc592-7548-455f-bd53-00d229adddb5
