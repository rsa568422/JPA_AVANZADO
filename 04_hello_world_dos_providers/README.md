## Usando dos providers

Proyecto con aplicación mínima pero ahora usando dos providers.

Ejecutad la aplicación main sin modificar nada del código. Hecho esto, id al fichero 
pom.xml y cambiad el orden entre las librerías hibernate y eclipseLink.

Como veréis, el provider usado no está explicitamente establecido en nuestra aplicación sinó
que depende del classpath en tiempo de ejecución. Por supuesto, esto es una situación muy peligrosa
que debe ser solucionada.

Abrid después el fichero [persistence.xml](src/main/resources/META-INF/persistence.xml) para ver
las indicaciones de como fijar el provider a usar.
