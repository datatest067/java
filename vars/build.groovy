def build(dockerImageName)
    {
        pwd
        sh "docker build -t ${dockerImageName} ."
        echo "Image Got Build ${dockerImageName}"
        sh "docker image"
    }

def run(dockerImageName)
{
    sh "docker run -dit --name javamaven ${dockerImageName}"
    sh "docker ps"
}

def cp(containerName)
{
    sh "docker cp javamaven:/usr/local/tomcat/webapps/wizard.war /tmp
    
}
