#The call method, which is a special method in Jenkins shared library that allows the function to be directly called from a Jenkins pipeline.
def call(String repoUrl, String branch){

#${env.WORKSPACE} assigns the Jenkins environment variable WORKSPACE
   def workingDir = "${env.WORKSPACE}"

#sh is used to execute a shell command to clone the repository in the workingDir and checkout(switch) to the specified branch .
   sh "git clone ${repoUrl} ${workingDir}"
   sh "git checkout ${branch}"

#the path workingDir is returned to Jenkins Pipeline.
   return workingDir
}
