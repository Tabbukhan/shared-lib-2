@Library('comexample@master') _

pipeline {
    agent any

    stages {
        stage('Use Shared Library Step') {
            steps {
                call('World')
            }
        }

        stage('Use Shared Library Function') {
            steps {
                script {
                    sayHello('World')
                }
            }
        }
    }
}
