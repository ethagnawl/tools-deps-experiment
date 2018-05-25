# What?
This is a proof-of-concept which explores how you might start a greenfield
project using [Clojure 1.9's tools.deps and CLI](https://clojure.org/guides/deps_and_cli).

The program doesn't do anything useful, but exists just to show how you might
use tools.deps (see deps.edn) to track third-party dependencies from Maven and
a local jar. (I tried to install both Midje and Specter from GitHub, using the
Git coordinate option, but couldn't get it to work.)

# How?
This proof-of-concept uses:
- tools.deps to track dependencies
- Clojure's CLI to run the program, tests, etc. (The CLI will install
dependencies when necessary)
- GNU make to provide an ergonomic wrapper around the CLI

To run the example:
- [install Clojure](https://clojure.org/guides/getting_started) and make sure the `clj` binary is available in your
terminal session
- run `make` or `make test`

# Why?
I was inspired to put this experiment together after seeing David Nolen's talk,
_Embracing Simpler Tools_, at Clojure/NYC on 5/23/2018. I'm not sure if the
talk was recorded or the slides will be made available, but I will add links if
either/both are.

# Conclusions
This approach is certainly much simpler than some of the alternative tooling
options. When I was able to get dependency management working (via Maven and
local jars), it was a simple, pleasant experience. However, I stumbled when
trying to use Git coordinates and I'm still not sure if the problem was with my
config, the libraries I was trying to pull in or a bug in tools.deps.

The micro-library approach to build scripts/tooling does call to mind the old
NIH criticisms of the Lisp ecosystem. For instance, there is a lot of value in
being able to add one line to your project.clj file in order to add a plugin
that handles X. It prevents you from having to write error-prone scripts which
have nothing to do with your problem domain.

I haven't tried using a dedicated build dependency in a build script but it
should _just work_.  (I'll see about adding an example which does this). It'll
be interesting to see if the community embraces tools.deps and starts building
a curated repository of build libraries a la Docker Hub or the Chef Supermarket.
