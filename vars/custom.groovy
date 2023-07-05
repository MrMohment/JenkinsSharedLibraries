def call(String stageName){

  if ("${stageName}" == "Build"){
          sh "echo Starting the build process"
			    sh "mvn clean package" 
			    sh "echo Build is now complete"
  }
  if ("${stageName}" == "CodeQuality"){
        sh "echo Now performing Code Quality Analysis"
				sh "mvn sonar:sonar"
				sh "echo Code Quality Analysis complete"
  }
  if ("${stageName}" == "UploadArtifacts"){
        sh "echo Uploading artifacts to Nexus Repo"
				sh "mvn deploy"
				sh "echo Upload complete"
  }
}
