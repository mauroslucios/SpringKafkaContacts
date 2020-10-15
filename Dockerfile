FROM openjdk
WORKDIR /app
COPY target/contatos-0.0.1-SNAPSHOT.jar /app/contatos.jar
ENTRYPOINT ["java","-jar","contatos.jar"]

