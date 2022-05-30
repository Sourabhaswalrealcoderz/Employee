FROM adoptopenjdk/openjdk8:alpine-jre
EXPOSE 8080
ADD target/Tale-Service-1.0.jar reimbursement.jar
ENTRYPOINT ["java","-jar","/reimbursement.jar"]
