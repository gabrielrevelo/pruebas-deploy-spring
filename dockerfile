# Configuración de la imagen base
FROM openjdk:17

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar los archivos necesarios a la imagen
COPY build/libs/usermicroservice-0.0.1-SNAPSHOT.jar /app/usermicroservice-0.0.1-SNAPSHOT.jar

# Expone el puerto en el que se ejecuta la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "/app/usermicroservice-0.0.1-SNAPSHOT.jar"]
