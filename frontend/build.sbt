import sbt._
import Process._
import Keys._

import com.github.tsandall.Plugin

lazy val frontend = (project in file("."))
  .settings(Plugin.defaultSettings: _*)
  .settings(name := "frontend")
  // new File(".").getAbsolutePath returns "/foo/bar/baz/."
  .dependsOn(uri("file://" + new File(".").getAbsolutePath + "./backend"))
