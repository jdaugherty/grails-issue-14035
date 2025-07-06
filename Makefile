
docker-image:
	./gradlew build
	cp build/libs/badapp-0.1-SNAPSHOT-plain.war ./docker/usr/local/tomcat/webapps/badapp.war
	docker build -t badapp:0.1-SNAPSHOT ./docker

docker-run:
	docker run -i -p 8080:8080 badapp:0.1-SNAPSHOT