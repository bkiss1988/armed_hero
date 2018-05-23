name := "armed_hero"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= {
  Seq(
    "org.scalatest"       %% "scalatest"              % "3.0.1",
    "org.hamcrest"        %  "hamcrest-all"           % "1.3"            % "test"
  )
}