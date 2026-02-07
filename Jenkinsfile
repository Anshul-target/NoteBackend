pipeline {
    agent none
    
    stages {
        stage('Stage 1 - Agent 1') {
            agent any
            steps {
                echo "=== STAGE 1 START ==="
                checkout scm
                
                script {
                    def commit = sh(script: 'git rev-parse HEAD', returnStdout: true).trim()
                    def content = readFile('version.txt').trim()
                    echo "Stage 1 - Commit: ${commit}"
                    echo "Stage 1 - Content: ${content}"
                }
                
                // Sleep to give time to push new commit
                echo "Sleeping for 60 seconds... (Push new commit now!)"
                sleep(60)
                
                echo "=== STAGE 1 END ==="
            }
        }
        
        stage('Stage 2 - Agent 2') {
            agent any
            steps {
                echo "=== STAGE 2 START ==="
                checkout scm
                
                script {
                    def commit = sh(script: 'git rev-parse HEAD', returnStdout: true).trim()
                    def content = readFile('version.txt').trim()
                    echo "Stage 2 - Commit: ${commit}"
                    echo "Stage 2 - Content: ${content}"
                }
                
                echo "=== STAGE 2 END ==="
            }
        }
    }
}
