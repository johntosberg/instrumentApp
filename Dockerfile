# Build stage
FROM eclipse-temurin:17 AS build
WORKDIR /app
COPY build/libs/instrumentApp.jar .
#RUN ./gradlew bootJar --no-daemon

# Grafana Agent stage
FROM grafana/agent:main-59d22c9 as agent

# Runtime stage
FROM eclipse-temurin:17
WORKDIR /app
COPY --from=build /app/instrumentApp.jar app.jar
COPY --from=agent /bin/grafana-agent /bin/grafana-agent
COPY grafana/agent.yaml /etc/agent/agent.yaml

EXPOSE 8001
ENTRYPOINT ["sh", "-c", "(/bin/grafana-agent -config.file=/etc/agent/agent.yaml) & exec java -jar app.jar"]
