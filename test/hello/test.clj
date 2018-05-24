(ns hello.test
  (:use midje.sweet))

; (midje.util.ecosystem/set-leiningen-paths! {:test-paths ["test"], :source-paths ["src"]})

(defn -main []
  (facts "facts"
         (fact "fact"
               0 => 1)))
