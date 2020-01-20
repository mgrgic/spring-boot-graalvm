# spring-boot-graalvm

A collection of Java applications to be build and run using [GraalVM](https://www.graalvm.org/)

## Switch to GraalVM

    export PATH = /path/to/graalvm-ce-19.2.1/bin/:$PATH
    export JAVA_HOME = /path/to/graalvm-ce-19.2.1/

## Compile

    javac HelloWorld.java 

## Build

### Using Makefiles

Every submodule contains a Makefile which builds a native-image and can be started by:

    make

### Manual builds

Building Spring Boot app:

    mvn package

Building HelloWorld without the need of classpath definitions:

    native-image HelloWorld

Extending classpath for all dependencies including built Spring Boot App JAR:
    
    native-image -cp ~/.m2/repository/org/springframework/boot/spring-boot-starter/2.2.0.RELEASE/spring-boot-starter-2.2.0.RELEASE.jar:<a lot of JARs>:/path/to/workspace/spring-boot-graalvm/graalvm-hellospring/target/graalvm-hellospring-1.0.0.jar \ 
    -H:Path=/home/miki/ws/playground/spring-boot-graalvm/graalvm-hellospring/target \
    -H:Name=hellospring \
    -H:Class=de.graalvm.HelloSpring 

## Run

    java Helloworld foo bar
    
    java -jar graalvm-hellospring-1.0.0.jar foo bar
    
    ./hellospring foo bar
