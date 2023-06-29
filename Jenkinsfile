pipeline {
    agent {
        label "linux"
    }
    options {
        buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '5', daysToKeepStr: ''))
        disableConcurrentBuilds()
    }
    stages {
        stage('Hello') {
            steps {
                echo "Hello"
            }
        }
    }
}
