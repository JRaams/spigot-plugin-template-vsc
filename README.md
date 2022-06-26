# spigot-plugin-template-vsc

Spigot MC 1.8.8 plugin template for use with Visual Studio Code using JDK 1.8

### 0. Prerequisites

1. Visual Studio Code ("VSC") [download](https://code.visualstudio.com/download)

2. The "Extension Pack for Java" / `vscjava.vscode-java-pack` extension for VSC

3. Java 8 JDK [download](https://www.azul.com/downloads/?version=java-8-lts&package=jdk)

4. Apache Maven [download](https://maven.apache.org/download.cgi)

Add to system path and check with `$ mvn -v`

### 1. Building the jar

**GUI**

MAVEN Tab -> **right click** Plugin -> `install`

**CLI**

`$ mvn clean install -f pom.xml`

Will be output to `dist/[name].[version].jar`

### 2. Updating the JAR version

Edit field `project/version` in file `pom.xml` to the new version and rebuild.
