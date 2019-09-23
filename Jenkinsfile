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
            bat 'cls'
          }
        }
        stage('Regression') {
          steps {
            bat 'cls'
          }
        }
        stage('Performance') {
          steps {
            bat 'cls'
          }
        }
        stage('Login ') {
          steps {
            bat 'cls'
          }
        }
      }
    }
    stage('Browsers') {
      parallel {
        stage('Chrome') {
          steps {
            bat 'cls'
          }
        }
        stage('IE') {
          steps {
            bat 'cls'
          }
        }
      }
    }
    stage('QA') {
      steps {
        input(message: 'Deploy?', ok: 'ok', submitter: 'Elvis Aragón')
      }
    }
    stage('Deploy Disney server') {
      steps {
        bat 'cls'
      }
    }
  }
}