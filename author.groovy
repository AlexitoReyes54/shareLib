def call(Map config = [:] ){
  sh "echo pipeline created by ${config.name}"
}
