.DEFAULT_GOAL := run

.PHONY: run
run: 
		clj -m hello

.PHONY: test
test:
		clj -A:test -m hello.test-runner
