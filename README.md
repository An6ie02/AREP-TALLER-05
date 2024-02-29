# AREP-TALLER-05
Modularización con virtualización e introducción a docker

Commands to run the project
```bash
docker build --tag dockersparktaller .
```

![imagesDocker](./image/image.png)

```bash
docker run -d -p 34000:46000 --name dockercontainer dockersparktaller
```

![dockerContainer](./image/container.png)

```bash
docker tag dockersparktaller angiemojica/calculate_spark_web
```
![docker](./image/imagenewDocker.png)

```bash
docker login
```

```bash
docker push angiemojica/calculate_spark_web:latest
```

![dockerhub](./image/dockerhub.png)

![index](./image/index.png)

![test](./image/test.png)

```bash
docker pull angiemojica/calculate_spark_web:latest
```
![dockerPull](./image/pull.png)

```bash
docker run -d -p 34000:46000 --name dockercontainer angiemojica/calculate_spark_web
```
![containerPull](./image/contPull.png)

