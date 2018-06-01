# What?
This is a proof-of-concept which explores how you might start a greenfield
project using [Clojure 1.9's tools.deps and CLI](https://clojure.org/guides/deps_and_cli).

# How?
This proof-of-concept uses:
- tools.deps to track dependencies (third-party libraries _and_ Clojure itself)
from Maven and a local JAR
- Clojure's CLI to run the program, tests, etc. (The CLI will also install
dependencies when necessary.)
- GNU make to provide an ergonomic wrapper around the Clojure CLI

To run the example:
- [install Clojure](https://clojure.org/guides/getting_started) and make sure the `clj` binary is available in your
terminal session
- clone the repository
- navigate to the repository root
- run `make` or `make test`

# Why?
I was inspired to put this experiment together after seeing David Nolen's talk,
_Embracing Simpler Tools_, at Clojure/NYC on 5/23/2018. I'm not sure if the
talk was recorded or the slides will be made available, but I will add links if
either/both are.

# Conclusions
This _Simpler Tools_ approach is certainly much, ahem, _simpler_ than the
alternative tooling options. When I was able to get dependency management
working (via Maven and local jars), it was a seamless, pleasant experience.
~~However, I stumbled when trying to use Git coordinates and I'm still not sure
if the problem was with my config, the libraries I was trying to pull in or a
bug in tools.deps.~~ Thanks to [/u/alexdmiller](https://old.reddit.com/user/alexdmiller) for explaining that the
issue I was seeing with Git coordinates is because:
> git and local deps only support Maven pom.xml and deps.edn, not project.clj.
> Prob will be fixed eventually.

In his talk, David suggests using existing, tried-and-true tools as the glue
for build tooling/CLI wrappers and I agree that this is a viable path forward.
David mentioned Bash scripts, I use make in this example and there are an
endless amount of workable alternatives. Perhaps the ability to easily leverage
existing tools, like Ant, will make Clojure _even more_ enticing to Java
programmers looking to transition. I know very well how frustrating it can be
to have to learn an entirely new build/tooling ecosystem in order to even get
started learning a new programming language.

The micro-library approach to build tooling does call to mind the old NIH
criticisms of the Lisp ecosystem, though. For instance, there _is_ a lot of
value in being able to add one line to your project.clj file in order to add a
plugin that handles builds/deployments/test runs/etc. It prevents application
developers from having to write/maintain brittle, buggy scripts which have
nothing to do with their problem domain.

It'll be interesting to see what the community does with the power and
flexibility provided by tools.deps and the Clojure CLI. I'm already envisioning
a curated repository of build libraries, a la Docker Hub or the Chef
Supermarket in order to address the issues raised in the previous paragraph.

# Resources
- [Deps and CLI Guide](https://clojure.org/guides/deps_and_cli)
- [Deps and CLI Reference](https://clojure.org/reference/deps_and_cli)
- [JUXT application template](https://github.com/juxt/edge) (Thanks to vemv on HN for drawing my attention to this project)
