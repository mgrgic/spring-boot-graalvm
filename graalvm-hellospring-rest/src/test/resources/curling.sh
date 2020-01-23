curl http://localhost:8080/hello
printf "\n---------------------\n"
curl -H "Content-Type: application/json" http://localhost:8080/lombok
printf "\n---------------------\n"
curl -H "Content-Type: application/json" http://localhost:8080/pojo
printf "\n---------------------\n"
curl -H "Content-Type: application/json" http://localhost:8080/serialized
printf "\n---------------------\n"
curl -H "Content-Type: application/json" http://localhost:8080/simplemap
printf "\n---------------------\n"
curl -H "Content-Type: application/json" http://localhost:8080/map
printf "\n---------------------\n"
