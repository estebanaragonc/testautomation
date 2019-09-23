pipeline {
  agent any
  stages {
    stage('Preparing') {
      steps {
        git(url: 'https://github.com/estebanaragonc/testautomation', branch: 'pipeline')
      }
    }
    stage('Unit') {
      steps {
        bat 'mvn clean -Dtest=Unit test'
      }
    }
  }
}