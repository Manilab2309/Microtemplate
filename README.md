# Microtemplate
Archetype for Microservices

User guide

Paso 1)

mvn archetype:generate -DgroupId=com.rcf -DartifactId=microTemplate -DarchetypeArtifactId=maven-archetype-archetype

Paso 2)
Desarrollamos el archetype
Clean Compile y Package

Paso 3)
mvn install:install-file -Dfile=C:/WKF/Microtemplate/target/Microtemplate-0.0.1-SNAPSHOT.jar -DgroupId=com.rcf -DartifactId=microTemplate -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar

Paso 4)

Usar el arquetipo desde una carpeta vacia !!!

mvn archetype:generate -DarchetypeGroupId=com.rcf -DarchetypeArtifactId=microTemplate -DarchetypeVersion=0.0.1-SNAPSHOT (te va preguntando el resto de parámetros)
