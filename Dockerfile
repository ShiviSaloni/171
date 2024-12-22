FROM openjdk:latest

WORKDIR /app

COPY . /app

RUN javac LargestDivisibleNumber.java

CMD ["java", "LargestDivisibleNumber"]
