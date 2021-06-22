// use this to let your editor know you're using a groovy file
#!/usr/bin/env groovy

def call() {
    echo "building our java application"
    sh "mvn package"
}