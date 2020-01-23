run:
	@echo
	rm -rf ./out/production/graalvm-helloworld
	@echo
	mkdir -p ./out/production/graalvm-helloworld
	@echo
	javac -sourcepath src -d ./out/production/graalvm-helloworld src/HelloWorld.java
	@echo
	cd ./out/production/graalvm-helloworld && native-image HelloWorld
	@echo
	@echo "Compare with"
	@echo
	@echo "  time java -cp ./out/production/graalvm-helloworld HelloWorld"
	@echo
	@echo "  time ./out/production/graalvm-helloworld/helloworld"
	@echo
