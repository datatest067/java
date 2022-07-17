def build(dockerImageName)
    {
        pwd
        sh "docker build -t ${dockerImageName} ."
        echo "Image Got Build ${dockerImageName}"
        sh "docker image"
    }

def run(dockerImageName)
{
    
   
}

def cp()
{
    sh "docker cp javamaven:/usr/local/tomcat/webapps/wizard.war /tmp"
    
}
