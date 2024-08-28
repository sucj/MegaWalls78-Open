plugins {
  `java-library`
  id("io.papermc.paperweight.userdev").version("1.7.2")
}

group = "icu.suc.megawalls78.open"
version = "0.0.1"

java {
  toolchain.languageVersion = JavaLanguageVersion.of(21)
}

paperweight.reobfArtifactConfiguration = io.papermc.paperweight.userdev.ReobfArtifactConfiguration.MOJANG_PRODUCTION

repositories {
  mavenLocal()
  maven("https://repo.papermc.io/repository/maven-public/")
  maven("https://oss.sonatype.org/content/groups/public/")
  mavenCentral()
}

dependencies {
  paperweight.paperDevBundle("1.21.1-R0.1-SNAPSHOT")
}

tasks {
  compileJava {
    options.release = 21
  }
  javadoc {
    options.encoding = Charsets.UTF_8.name()
  }
}
