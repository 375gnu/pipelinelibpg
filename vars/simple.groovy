def call(String name) {
  pipeline {
    agent any
    stages {
      stage('say hi') {
        steps {
          echo "hi ${name}!"
        }
      }
    }
  }
}
