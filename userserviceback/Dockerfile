FROM tomcat:8.5.55-jdk11-openjdk

COPY /target/kubda.war /usr/local/tomcat/webapps/kubda.war

WORKDIR /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
