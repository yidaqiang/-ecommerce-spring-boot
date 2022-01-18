# dockerfile: https://github.com/open-hand/dockerfile/tree/master/ruamel-yaml
FROM registry.cn-shanghai.aliyuncs.com/c7n/javabase:0.10.1
RUN mkdir /choerodon && chown -R www-data:www-data /choerodon
COPY --chown=www-data:www-data target/app.jar /choerodon/ecommerce.jar
WORKDIR /choerodon
USER 33
CMD java $JAVA_OPTS $SKYWALKING_OPTS -jar /choerodon/ecommerce.jar