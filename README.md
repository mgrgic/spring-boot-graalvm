# spring-boot-graalvm

## Switch to GraalVM

    export PATH=~/tools/graalvm-ce-19.2.1/bin/:$PATH
    export JAVA_HOME=~/tools/graalvm-ce-19.2.1/

## Compile
javac HelloWorld.java 

## Build
native-image HelloWorld

## Execute
java Helloworld foo bar
./helloworld foo bar
