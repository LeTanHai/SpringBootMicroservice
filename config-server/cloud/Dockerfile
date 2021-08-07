FROM openjdk:11
LABEL name="config-serve"

RUN mkdir /tmp/env

ADD ./target/*.jar config-server.jar
ADD config /config
ADD run.sh /run.sh
RUN chmod 777 /run.sh
EXPOSE 8888
WORKDIR /
ENTRYPOINT [ "/run.sh" ]