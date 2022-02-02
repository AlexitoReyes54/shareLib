def call(Map config = [:] ){
  def json = libraryResource "org/heroku/bar.json"
  def scriptTetx = libraryResource "org/scripts/hello.sh"
  echo json
  writeFile file:"hello", text:scriptTetx
  sh "chmod a+x ./hello"
  sh "./hello"
  sh "echo pipeline created by ${config.name}"
}
