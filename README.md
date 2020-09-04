# AREP_ServidorWeb_Parcial1

## Enlaces

* [![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://arepparcialbs.herokuapp.com/)
* [![CircleCI](https://circleci.com/gh/luisalejandrojaramillo/AREP_SparkWebApp_Lab02.svg?style=svg)](https://circleci.com/gh/luisalejandrojaramillo/AREP_SparkWebApp_Lab02)

### Requisitos
* Git
* Java 8
* Maven
* App de Heroku 

### Procfile Changes
* Para pruebas locales en Windows
web: java -cp target/classes;target/dependency/* edu.escuelaing.arep.SparkWebApp
* Para Heroku
web: java  $JAVA_OPTS -cp target/classes:target/dependency/* edu.escuelaing.arep.SparkWebApp

### Instalación
1. Abrimos una terminal
2. Clonamos el repositorio
```
git clone https://github.com/luisalejandrojaramillo/AREP_ServidorWeb_Parcial1
```
3. Entramos al directorio
```
cd AREP_ServidorWeb_Parcial1
```
4. Empaquetamos y corremos las puebas
```
mvn package
```
5. Ejecutamos el Java Client
```
java -cp target/Parcial-1.0-SNAPSHOT.jar edu.escuelaing.arep.cliente.JavaClient
```
6. Realizamos los cambios respectivos al Procfile

7. Heroku local
```
mvn clean install
heroku local web
```



## Requerimientos

1. Construir un servicio WEB (puede usar Spark o Sockets) que reciba una lista de números y retorne una estructura JSON con: La lista de números ordenada. Para probar, y para ver como el browser arma el query, puede usar una cadena puede enviarla en un solo campo con valores separados por comas. Ayuda: use un form html con un solo campo.

2. Usted debe implementar el ordenamiento por medio de bubble sort. Piense que este algoritmo se podría user para objetos de otro tipo.

3. Su diseño debe soportar la composición de nuevas operaciones sobre la lista para modificar servicios existentes o componer nuevos servicios. Por ejemplo, piense que en el futuro podemos solicitar que se creen nuevos servicios sobre la lista aumentando el API web, es decir,  debe ser fácilmente extensible.

4. Agregue una operaciónes para calcular la sumatoria  y el promedio de la lista y modifique su programa para que la estructura Json contenga estos valores.

5. El diseño del servidor debe tener en cuenta buenas prácticas de diseño OO.

6. Despliegue el servicio en Heroku.

7. Construya un cliente JAVA para probar el servicio en heroku.

8. El cliente y el servidor debe entregarlos en un proyecto estructurado con Maven.

9. El cliente debe traer "quemada" en el código fuente la url de su aplicación desplegada en Heroku.

## License
[MIT License ](/LICENSE)
## Autor
Luis Alejandro Jaramillo Rincon
