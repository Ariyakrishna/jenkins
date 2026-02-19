pipeline {
    agent any
    parameters {
        string(name: 'ENV', defaultValue: 'DEV', description: 'Environment (DEV, QA, etc)')
    }
    stages {
        stage('Hello') {
            steps {
                script {
                    if (params.ENV == 'DEV') {
                        println('This is DEV environment')
                    } else if (params.ENV == 'QA') {
                        println('This is QA environment')
                    } else {
                        println("This is ${params.ENV} environment")
                    }
                }
            }
        }
    }
}
