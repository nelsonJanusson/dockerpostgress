docker pull postgres

docker volume create postgres_data

docker run --name postgress-start -e POSTGRES_PASSWORD=mysecretpassword -d -p 5432:5432 postgres

