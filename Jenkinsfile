@Library('javatest') _

pipeline{
    agent any
    stages {
        stage('build') {
            steps{
              script {
                  pwd
                  build.build("mavenimage")
                }
            }
        }
         stage('run') {
            steps{
                 script {
                  pwd
                  build.run("mavenimage")
                }
              }
        }
        stage('cp') {
            steps{
                 script {
                  pwd
                  build.run()
                }
              }
        }
    }
}
