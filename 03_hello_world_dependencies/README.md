## Mejorando la especificación de las dependencias

En la lección hemos visto el inconveniente de no tener explícitamente indicadas las dependencias
directas de nuestro código.

Concretamente, el primer proyecto tenía una dependencia en el pom.xml a org.hibernate:hibernate-core:jar:5.2.12.Final, y esta dependencia, de forma transitiva incluía las clases de JPA:

org.hibernate.javax.persistence:hibernate-jpa-2.1-api:jar:1.0.0.Final

El analizador de Maven nos informaba de la situación con:

'''mvn dependency:analyze'''

Este proyecto corrige la situacion modificando el fichero [pom.xml](pom.xml)
