def call(){
 sh 'docker context use default'
 sh 'sudo docker-compose build'
 sh 'sudo docker-compose up -d'
}
