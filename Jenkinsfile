pipeline 
{
    agent any
        stages 
        {
                stage('One') 
                {
                        steps 
                        {
                                echo 'Hi, Hellow This is stage One made by branch1'
                        }
                }
                stage('Two') 
                {
                        steps 
                        {
                            input('Do you want to proceed?')
                        }
                }
                stage('Three') 
                {
                    when
                        {
                            not 
                            {
                                branch "main"
                            }
                        }
                    steps 
                    {
                        echo "Hello"
                    }
                }
                stage('Four') 
                {
                                parallel
                                {
                                    stage('Unit Test') 
                                    {
                                                        steps 
                                                        {
                                                                echo "Running the unit test...."
                                                        }
                                    }
                                    stage('Integration test') 
                                    {
                                                        agent 
                                                        {
                                                                any 
                                                                {
                                                                        reuseNode false
                                                                        image 'ubuntu'
                                                                }
                                                        }
                                                        steps 
                                                        {
                                                            echo "Runnning the integration test"
                                                        }
                                    }
                                } 
                }
        }
}