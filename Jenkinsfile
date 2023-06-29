pipeline 
{
    agent 
    {
        label "linux"
    }
    option
    {
        buildDiscarder (logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '5', artifactDaysToKeepStr: '', daysToKeepStr: ''))
        disableConcurrentBuilds()
    
    }
    stages 
    {
        stage('Hello')
        {
            steps
            {
                echo "Hello"
            }
        }
    }
}