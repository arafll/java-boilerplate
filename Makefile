.PHONY: build clean run test docker

build:
\tmvn clean package

clean:
\tmvn clean

run:
\tjava -jar target/your-app.jar

test:
\tmvn test

docker:
\tdocker build -t your-app-image .
