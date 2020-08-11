rootProject.name = "GradleRIO-Redux-example"

includeBuild("../GradleRIO-Redux") {
    dependencySubstitution {
        substitute(module("gradle.plugin.org.rivierarobotics:GradleRIO-Redux")).with(project(":"))
    }
}
