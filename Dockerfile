FROM java:latest


COPY ./server/target/universal/models2016-program*.zip .
RUN unzip *.zip && rm *.zip && mv models2016-program* server
WORKDIR server

ENTRYPOINT ["./bin/models2016-program"]

CMD ["-Dhttp.port=80", "-Dconfig.file=/server/config.conf"]

# sudo docker run --name models2016-program --rm -v /path/to/config.prod.conf:/server/config.conf:z gbecan/models2016