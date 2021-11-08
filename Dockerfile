FROM openjdk:8
EXPOSE 8086
ADD target/payment.jar payment.jar
ENTRYPOINT ["java","-jar","/payment.jar"] 