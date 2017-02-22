FROM niaquinto/gradle
MAINTAINER xylancer@gmail.com

COPY code .

ENTRYPOINT ["gradle"]
CMD ["build"]