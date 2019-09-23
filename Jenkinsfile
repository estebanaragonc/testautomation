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
            bat 'clean -Dtest=Unit test'
          }
        }
        stage('Regression') {
          steps {
            bat 'clean -Dtest=Regression test'
          }
        }
        stage('Login ') {
          steps {
            bat 'clean -Dtest=Login test'
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