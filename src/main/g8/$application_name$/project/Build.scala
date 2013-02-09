import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "$application_name$"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      jdbc
    )

    val main = play.Project(appName, appVersion, appDependencies)

}
