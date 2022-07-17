def build(dockerImageName)
    {
        pwd
        sh "docker build -t ${dockerImageName} ."
        echo "Image Got Build ${dockerImageName}"
        sh "docker image"
    }

def run(dockerImageName)
{
    sh "docker run --name 'javamaven' -dit ${dockerImageName}"
    sh "docker ps"
}

def cp()
{
    sh "docker cp javamaven:/usr/local/tomcat/webapps/wizard.war /tmp"
    
}
