pipeline {
  agent {
    node {
      label 'Task'
    }

  }
  stages {
    stage('Clone') {
      steps {
        git(url: 'https://github.com/janani957/MicroService.git', branch: 'main', poll: true, changelog: true)
      }
    }

  }
}