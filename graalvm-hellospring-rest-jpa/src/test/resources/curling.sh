curl -d '{"id":1, "foo":"value", "isbar":true}' -H "Content-Type: application/json" -X POST "http://localhost:8080/entity"

curl  http://localhost:8080/entity
curl  http://localhost:8080/entity/1
curl  http://localhost:8080/entity/2
