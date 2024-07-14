plugins {
    id("java")
    application
}

group = "org.graphys"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // web stack
    // to do

    // operator stack
    implementation(libs.josdk) {
        exclude(group = "io.fabric8", module = "kubernetes-httpclient-okhttp")
    }
    implementation(libs.fabric8.crd.generator)

    // log stack
    implementation(libs.log4j.slf4j.impl)


    // test stack
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}