## Docker Postgresql
docker run -it --rm=true -d --name test-postgres -e POSTGRES_USER=hans -e POSTGRES_PASSWORD=hans2023 -e POSTGRES_DB=soccer_bet -p 5432:5432 postgres:14.1