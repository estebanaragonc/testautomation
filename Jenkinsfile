pipeline {
  agent any
  stages {
    stage('Prepare') {
      steps {
        git(url: 'https://github.com/estebanaragonc/testautomation', branch: 'pipeline')
      }
    }
    stage('Test') {
      parallel {
        stage('Unit') {
          steps {
            bat 'mvn clean -Dtest=Unit test'
          }
        }
        stage('Regression') {
          steps {
            bat 'mvn clean -Dtest=Regression test'
          }
        }
      }
    }
    stage('QA') {
      steps {
        bat 'cls'
      }
    }
  }
}