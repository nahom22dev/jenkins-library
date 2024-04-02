def call(Map pipelineParams = [:]) {

    def APP_NAME = "app-name"
    def BRANCH_NAME = "main"

    pipeline {
        agent any

        stages {
            stage('Hello') {
                steps {
                    echo 'Hello World'
                    createGithubRelease(repo: "owner/repo")
                }
            }
            // stage('Create Release') {
            //     steps {
            //         script {
            //             catchError {
            //                 sh """
            //                     echo "curl github-api/create-release"
            //                 """
            //             }
            //         }
            //     }
            // }
        }
    }
}