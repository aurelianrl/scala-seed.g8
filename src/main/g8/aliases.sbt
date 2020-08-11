import Util._

addCommandAlias("l", "projects")
addCommandAlias("ll", "projects")
addCommandAlias("ls", "projects")
addCommandAlias("cd", "project")
addCommandAlias("root", "cd $name;format="norm"$")
addCommandAlias("c", "compile")
addCommandAlias("ca", "test:compile")
addCommandAlias("t", "test")
addCommandAlias("r", "run")
addCommandAlias(
  "up2date",
  "reload plugins; dependencyUpdates; reload return; dependencyUpdates"
)

onLoadMessage +=
  s"""|
      |───────────────────────────────
      |    List of defined \${styled("aliases")}
      |────────────┬──────────────────
      |\${styled("l")} | \${styled("ll")} | \${styled("ls")} │ projects
      |\${styled("cd")}          │ project
      |\${styled("root")}        │ cd $name;format="norm"$
      |\${styled("c")}           │ compile
      |\${styled("ca")}          │ compile all
      |\${styled("t")}           │ test
      |\${styled("r")}           │ run
      |\${styled("up2date")}     │ dependencyUpdates
      |────────────┴──────────────────""".stripMargin
