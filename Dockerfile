# ============================
# 1. Build Stage
# ============================
FROM eclipse-temurin:21-jdk AS builder

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests

# ============================
# 2. Runtime Stage
# ============================
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=builder /app/target/library-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
