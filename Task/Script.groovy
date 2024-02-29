def gettags = ("git ls-remote -t -h https://github.com/dtank150/Jenkins-Task.git").execute()
return gettags.text.readLines().collect { 
  it.split()[1].replaceAll('refs/heads/', '').replaceAll('refs/tags/', '').replaceAll("\\^\\{\\}", '')
}
