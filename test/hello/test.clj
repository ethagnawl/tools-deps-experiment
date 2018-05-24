(ns hello.test
  (:require [clojure.test :as test]))

(defn -main []
  (test/is (= 4 (+ 2 2)))
  (test/is (= 5 (+ 2 2))))
