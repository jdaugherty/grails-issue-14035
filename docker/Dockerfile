FROM tomcat:10.1.36-jre17-temurin-noble

ENV DATASOURCE_URL="jdbc:h2:./prodDb;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE" \
  DATASOURCE_DBCREATE=create-drop \
  DATASOURCE_DRIVERCLASSNAME=org.h2.Driver \
  DATASOURCE_DIALECT=org.hibernate.dialect.H2Dialect \
  DATASOURCE_USERNAME=sa

RUN sed -i -n '/tomcat.util.scan.StandardJarScanFilter.jarsToSkip=/{:a;N;/#/!ba;s/.*\n/tomcat.util.scan.StandardJarScanFilter.jarsToSkip=*\n\n/};p' /usr/local/tomcat/conf/catalina.properties

COPY ./usr/local/ /usr/local/
