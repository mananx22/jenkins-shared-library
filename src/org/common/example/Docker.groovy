package org.common.example

// "implements Serializable "to support states if pipeline is paused or resumed
class Docker implements Serializable {

// lets first create a variable
    def script


//now we are making available all jenkins env. variable through this code 
    Docker(script){
        this.script = script
    }


// now we are defining our new function
    def buildDockerImage(String img){
        script.echo "building our docker image"
        script.sh "docker build -t $img ." 
    }

    // splitting above function into smaller parts
    def dockerLogin() {
        script.withCredentials([script.usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'USER', passwordVariable: 'PASS')]) 
        { 
            script.sh "echo $script.PASS | docker login -u $script.USER --password-stdin"
        }

    }

    def dockerPush(String img) {
        script.sh "docker push  $img"
    }


}

