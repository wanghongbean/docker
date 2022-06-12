#基于unbunt镜像
FROM ubuntu 
#维护作者信息
MAINTAINER wanghongbean<wanghongbean@gmail.com>

RUN  sed -i s@/archive.ubuntu.com/@/mirrors.aliyun.com/@g /etc/apt/sources.list
RUN  apt-get clean
RUN apt-get update

RUN apt-get install -y vim 

ENV HOME_PATH /usr/local
WORKDIR $HOME_PATH
RUN mkdir /usr/local/java
#ADD 是相对路径jar，添加到容器并解压
ADD jdk-18_linux-x64_bin.tar.gz /usr/local/java

#配置java环境变量
ENV JAVA_HOME /usr/local/java/jdk-18.0.1.1
#ENV JRE_HOME $JAVA_HOME/jre
#ENV CLASSPATH $JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$CLASSPATH
ENV PATH $JAVA_HOME/bin:$PATH

EXPOSE 80
CMD echo $MY_PATH
CMD echo "success...ok"
CMD /bin/bash