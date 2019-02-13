def call(String name, Map config) {
  pipeline {
    agent any
    stages {
      stage('say hi') {
        steps {
          echo "hi ${name}!"
        }
      }
      stage('say bye') {
        when { expression { config.sayBye != null } }
        steps {
          echo "bye ${name}"
        }
      }
    }
  }
}
