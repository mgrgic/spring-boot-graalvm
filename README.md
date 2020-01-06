# spring-boot-graalvm

export PATH=~/tools/graalvm-ce-java8-19.3.0.2/bin/:$PATH
export JAVA_HOME=~/tools/graalvm-ce-java8-19.3.0.2/


## Compile
javac HelloWorld.java 

## Build
native-image HelloWorld

## Execute
java Helloworld foo bar
./helloworld foo bar
