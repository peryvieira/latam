FROM openjdk:11-jdk
ADD target/latam-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]


#RUN mkdir app
#ARG JAR_FILE
#ADD /target/${JAR_FILE} /app/latam.jar
#WORKDIR /app
#ENTRYPOINT ["java", "-jar", "latam.jar"]


#VOLUME /tmp
#ADD target/latam-0.0.1-SNAPSHOT.jar target/app.jar
#RUN bash -c 'touch target/app.jar'
#ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local","target/app.jar"]

#FROM openjdk:11-jdk
#WORKDIR /app
#COPY target/latam-0.0.1.jar /app/app.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "app.jar"]

#ARG JAR_FILE=*.jar
#COPY ${JAR_FILE} latam-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java", "-jar", "latam.jar"]