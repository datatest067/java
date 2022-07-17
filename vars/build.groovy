def build(dockerImageName)
    {
        pwd
        sh "docker build -t ${dockerImageName} ."
        echo "Image Got Build ${dockerImageName}"
        sh "docker image"
    }

def run(containerName,dockerImageName)
{
    sh "docker run -dit --name ${containerName} ${dockerImageName}"
    sh "docker ps"
}

def cp(containerName)
{
    sh "docker cp ${containerName}:/usr/local/tomcat/webapps/wizard.war /tmp
    
}
