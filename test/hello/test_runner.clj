(ns hello.test-runner
  (:use midje.repl))

(defn -main []
  (load-facts))
