FROM java:8
EXPOSE 8686
ADD /target/assurance-1.0.jar assurance-micro.jar
ENTRYPOINT ["java","-jar","assurance-micro.jar"]