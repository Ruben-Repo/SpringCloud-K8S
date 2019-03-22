cd frontend

mvn clean install

docker build -t rubendocker/frontend-final:latest


cd backend

mvn clean install

docker build -t rubendocker/backend-final:latest


kubectl create -f k8s.yaml
