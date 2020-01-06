MAVEN_CLASSPATH = $(HOME)/.m2/repository/org/springframework/boot/spring-boot-starter/2.0.5.RELEASE/spring-boot-starter-2.0.5.RELEASE.jar:$(HOME)/.m2/repository/org/springframework/boot/spring-boot/2.0.5.RELEASE/spring-boot-2.0.5.RELEASE.jar:$(HOME)/.m2/repository/org/springframework/spring-context/5.0.9.RELEASE/spring-context-5.0.9.RELEASE.jar:$(HOME)/.m2/repository/org/springframework/spring-aop/5.0.9.RELEASE/spring-aop-5.0.9.RELEASE.jar:$(HOME)/.m2/repository/org/springframework/spring-beans/5.0.9.RELEASE/spring-beans-5.0.9.RELEASE.jar:$(HOME)/.m2/repository/org/springframework/spring-expression/5.0.9.RELEASE/spring-expression-5.0.9.RELEASE.jar:$(HOME)/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.0.5.RELEASE/spring-boot-autoconfigure-2.0.5.RELEASE.jar:$(HOME)/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.0.5.RELEASE/spring-boot-starter-logging-2.0.5.RELEASE.jar:$(HOME)/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:$(HOME)/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:$(HOME)/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:$(HOME)/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.10.0/log4j-to-slf4j-2.10.0.jar:$(HOME)/.m2/repository/org/apache/logging/log4j/log4j-api/2.10.0/log4j-api-2.10.0.jar:$(HOME)/.m2/repository/org/slf4j/jul-to-slf4j/1.7.25/jul-to-slf4j-1.7.25.jar:$(HOME)/.m2/repository/javax/annotation/javax.annotation-api/1.3.2/javax.annotation-api-1.3.2.jar:$(HOME)/.m2/repository/org/springframework/spring-core/5.0.9.RELEASE/spring-core-5.0.9.RELEASE.jar:$(HOME)/.m2/repository/org/springframework/spring-jcl/5.0.9.RELEASE/spring-jcl-5.0.9.RELEASE.jar:$(HOME)/.m2/repository/org/yaml/snakeyaml/1.19/snakeyaml-1.19.jar

run:
	@echo
	rm -rf target
	@echo
	mkdir -p target/classes
	@echo
	@echo javac -sourcepath src/main/java -cp "CLASSPATH" -d target/classes src/main/java/de/graalvm/HelloSpring.java
	@javac -sourcepath src/main/java -cp "$(MAVEN_CLASSPATH)" -d target/classes src/main/java/de/graalvm/HelloSpring.java
	@echo
	@echo native-image -cp CLASSPATH:target/classes de.graalvm.HelloSpring
	@native-image -cp "$(MAVEN_CLASSPATH):target/classes" de.graalvm.HelloSpring
	@echo
	@echo "Compare with"
	@echo
	@echo "  time java -cp "$(MAVEN_CLASSPATH):target/classes" de.graalvm.HelloSpring Miki Christoph"
	@echo
	@echo "  time ./de.graalvm.hellospring Miki Christoph"
	@echo
