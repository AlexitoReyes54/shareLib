def call(){
    withSonarQubeEnv('sonarqube-server') {
          //sh "dotnet tool install --global dotnet-sonarscanner" 
          sh "dotnet ${tool 'SonarScanner for MSBuild'}/SonarScanner.MSBuild.dll begin /k:\"heroku\""
          sh "dotnet build" 
          sh "dotnet ${tool 'SonarScanner for MSBuild'}/SonarScanner.MSBuild.dll end"
        }
}
