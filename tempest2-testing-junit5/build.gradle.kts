plugins {
  kotlin("jvm")
  `java-library`
}

dependencies {
  api(project(":tempest2-testing"))
  api(Dependencies.junitApi)
  implementation(project(":tempest2-testing-internal"))
  implementation(Dependencies.kotlinStdLib)
  implementation(Dependencies.guava)
  implementation(Dependencies.kotlinReflection)

  testImplementation(project(":samples:urlshortener2"))
  testImplementation(project(":tempest2-testing-jvm"))
  testImplementation(Dependencies.assertj)
  testImplementation(Dependencies.junitEngine)
}
