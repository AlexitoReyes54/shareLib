def call(Map config = [:] ){
  def request = libraryResource "org/heroku/bar.json"
  echo request.foo
  sh "echo pipeline created by ${config.name}"
}
