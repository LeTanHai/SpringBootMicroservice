FROM openjdk:11
LABEL name="limit-server"

RUN mkdir /tmp/env

ADD ./target/*.jar limit-server.jar
ADD config /config
ADD run.sh /run.sh
RUN chmod 777 /run.sh

EXPOSE 8080
WORKDIR /
ENTRYPOINT [ "/run.sh" ]