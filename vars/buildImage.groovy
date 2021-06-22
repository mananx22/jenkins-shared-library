def call(String img) {
    echo "building our docker image"                    
     withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'USER', passwordVariable: 'PASS')]) {                    
     sh "docker build -t $img ."
     sh "echo $PASS | docker login -u $USER --password-stdin"
     sh "docker push  $img"
    }
}