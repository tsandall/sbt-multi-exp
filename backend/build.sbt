import sbt._
import Process._
import Keys._

import com.github.tsandall.Plugin

lazy val backend = (project in file(".")).
  settings(Plugin.defaultSettings: _*).
  settings(
    name := "backend"
  )
