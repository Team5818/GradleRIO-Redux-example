plugins {
    id("org.rivierarobotics.gradlerioredux") version "0.7.6"
}

gradleRioRedux {
    robotClass = "org.rivierarobotics.robot.Robot"
    teamNumber = 5818
}

repositories {
    jcenter()
}