# Pull base image.
FROM ubuntu:14.04

MAINTAINER  xutao "xutao1989103@gmail.com"

# Install Java.
RUN apt-get update && \
    apt-get install -y software-properties-common && \
    add-apt-repository -y ppa:webupd8team/java && \
    apt-get update && \
    echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | sudo /usr/bin/debconf-set-selections && \
    apt-get install -y oracle-java8-installer

# Define working directory.
WORKDIR /data

# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

COPY target/dronedemo-0.0.1-SNAPSHOT.jar /data/apps

# Define default command.
CMD ["bash"]
