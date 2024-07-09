# SpringMykongExample
The project will be created by maven.

#Continuous Integration batch commands in sequence
cd "C:\Users\UTKARSH\git\SpringMykongExample"

git log --format="%H" -n 1 > "C:\Users\Vicky\Jenkins\tmp\version.txt"

@FOR /F %i in ('type C:\Users\Vicky\Jenkins\tmp\version.txt') DO set version=%i

echo %version%

#Creating the build folder - used for easier reference
mkdir "C:\Users\Vicky\Jenkins\Builds\SpringbootV1"

#Copying the build output - war file to the build folder
copy /Y "C:\Users\UTKARSH\git\SpringMykongExample\target\myApp.jar" "C:\Users\Vicky\Jenkins\Builds\SpringbootV1"
copy /Y "C:\Users\UTKARSH\git\SpringMykongExample\target\Dockerfile" "C:\Users\Vicky\Jenkins\Builds\SpringbootV1"

#Pipeline code
pipeline{
    agent any
    tools{
        maven 'Maven3.9.8'
    }
    stages{
        stage('Build Maven3.9.8'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'd1b194e3-0fdb-4956-9d56-8830d19f0f15', url: 'https://github.com/Ignition3951/SpringMykongExample']])
                bat  'mvn clean install'
            }
        }
        stage('Docker Build'){
            steps{
                bat 'docker build -t utk1311/spring-3-example-docker .'
            }
        }
    }
}