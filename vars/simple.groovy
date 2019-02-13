def call(Map config) {
  pipeline {
    agent any
    stages {
      stage('say hi') {
        steps {
          echo "hi ${config.name}!"
        }
      }
      stage('say bye') {
        when { expression { config.sayBye != null } }
        steps {
          echo "bye ${config.name}"
        }
      }
    }
  }
}
