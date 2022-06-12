FROM java:8
MAINTAINER wanghongbean<wanghongbean@gmail.com>

VOLUME /tmp

ADD ./target/demo-docker-1.0.0.jar demo-docker.jar
#RUN bash -c 'touch /demo-docker.jar'
ENTRYPOINT ["java","-jar","/demo-docker.jar"]
EXPOSE 8001