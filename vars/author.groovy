def call(Map config = [:] ){
  def json = libraryResource "org/heroku/bar.json"
  def scriptTetx = libraryResource "org/scripts/hello.json"
  echo json
  writeFile file:"hello", text:scriptTetx
  sh "chmod a+x ./hello"
  sh "echo pipeline created by ${config.name}"
}
