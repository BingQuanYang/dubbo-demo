#下载基础镜像
#拷贝jdk
#配置jdk环境变量
#拷贝jar包
#启动
FROM ubuntu:18.04
ADD ./jdk-8u271-linux-x64.tar.gz /opt/
ENV JAVA_HOME=/opt/jdk1.8.0_271
ENV PATH=$JAVA_HOME/bin:$PATH
ENV CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
WORKDIR /opt
COPY ./sentinel-dashboard.jar /opt/
#java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar
ENTRYPOINT ["java","-Dserver.port=8719","-Dcsp.sentinel.dashboard.server=localhost:8788","-Dproject.name=sentinel-dashboard","-jar","/opt/sentinel-dashboard.jar"]
#注意端口问题