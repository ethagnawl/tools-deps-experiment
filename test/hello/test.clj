(ns hello.test
  (:use midje.sweet)
  (:require [hello :as hello]))

(facts "facts"
  (fact "fact"
        (let [expected [1 2 4]
              actual (hello/inc-last-odd [1 2 3])]
        expected => actual)))
