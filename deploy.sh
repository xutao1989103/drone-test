#!/bin/sh
echo "deploy begin .... .... ...."

docker-compose down
docker-compose pull
docker-compose up -d

echo "deploy end .... .... ...."
