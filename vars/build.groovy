def build(dockerImageName)
    {
        pwd
        sh "docker build -t ${dockerImageName} ."
        echo "Image Got Build ${dockerImageName}"
        sh "docker image"
    }

def run(dockerImageName)
{
    sh "container_id='$(docker run -t -d ${dockerImageName} /bin/bash)'"
    echo ${container_id}
    sh "docker ps"
    sh "docker cp "$container_id":/usr/local/tomcat/webapps/wizard.war /tmp"
   
}

def cp()
{
    sh "docker cp javamaven:/usr/local/tomcat/webapps/wizard.war /tmp"
    
}
