job('seed-external-job') {
  scm {
      git('https://github.com/AkshayDurgade/Jenkins.git')
  }
  steps {
    dsl {
      external('seed-hello-world-external/hello_world_external.groovy')
    }
  }
}