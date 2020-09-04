# AREP_ServidorWeb_Parcial1

AREP_ServidorWeb_Parcial1
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
5. Ejecutamos 

6. Realizamos los cambios respectivos al Procfile

7. Heroku local
```
mvn clean install
heroku local web
```

## License
[MIT License ](/LICENSE)
## Autor
Luis Alejandro Jaramillo Rincon
