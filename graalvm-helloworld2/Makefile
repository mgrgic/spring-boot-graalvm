run:
	@echo
	rm -rf ../out/production/graalvm-helloworld2
	@echo
	mkdir -p ../out/production/graalvm-helloworld2
	@echo
	javac -sourcepath src -d ../out/production/graalvm-helloworld2 src/HelloWorld.java
	@echo
	cd ../out/production/graalvm-helloworld2 && native-image HelloWorld
	@echo
	@echo "Compare with"
	@echo
	@echo "  time java -cp ../out/production//graalvm-helloworld HelloWorld Miki Christoph"
	@echo
	@echo "  time ../out/production/graalvm-helloworld/helloworld Miki Christoph"
	@echo
