import com.typesafe.sbt.SbtStartScript

name := "lift-quickstart-heroku"
 
seq(webSettings: _*)

// If using JRebel
//jettyScanDirs := Nil

seq(SbtStartScript.startScriptForClassesSettings: _*)

resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

resolvers += "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots"

resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots"

libraryDependencies ++= {
  val liftVersion = "2.5-M3" // Put the current/latest lift version here
  Seq(
    "org.eclipse.jetty" % "jetty-server" % "9.0.0.M0" % "compile->default",
    "org.eclipse.jetty" % "jetty-servlet" % "9.0.0.M0" % "compile->default",
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default"
  )
}

// Customize any further dependencies as desired
libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "9.0.0.M0" % "container", // For Jetty 9
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container,compile" artifacts Artifact("javax.servlet", "jar", "jar"),
  "org.scala-tools.testing" % "specs_2.9.0" % "1.6.8" % "test", // For specs.org tests
  "junit" % "junit" % "4.8" % "test->default", // For JUnit 4 testing
  "javax.servlet" % "servlet-api" % "2.5" % "provided->default",
  "ch.qos.logback" % "logback-classic" % "0.9.26" % "compile->default" // Logging
)
