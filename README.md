# What?
This is a proof-of-concept which explores how you might start a greenfield
project using [Clojure 1.9's tools.deps and CLI](https://clojure.org/guides/deps_and_cli).

The program doesn't do anything useful, but exists to show how you'd use
tools.deps (see deps.edn) to track third-party dependencies from Maven and
GitHub.

# How?
This proof-of-concept uses:
- tools.deps to manage dependencies
- Clojure's CLI to run the program, tests, etc.
- Make to provide an ergonomic wrapper around the CLI

# Why?
I was inspired by David Nolen's talk, _Embracing Simpler Tools_, at Clojure/NYC
on 5/23/2018. I'm not sure if the talk was recorded or the slides will be made
available, but I will add links if either/both are.
