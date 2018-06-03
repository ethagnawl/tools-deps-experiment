(ns hello.test
  (:use midje.sweet)
  (:require [hello :as hello]))

(facts "hello facts"

  (facts "inc-last-odd facts"
    (fact "inc last odd int"
          (let [expected [1 2 4]
                actual (hello/inc-last-odd [1 2 3])]
          expected => actual))
    (fact "noop if there are no odds"
          (let [expected [2 4]
                actual (hello/inc-last-odd [2 4])]
          expected => actual)))

  (facts "maybe-square-last-even-int facts"
    (fact "square last even int"
          (let [expected 4
                actual (hello/maybe-square-last-even-int [1 2])]
          expected => actual))
    (fact "fail early and return nil when last int isn't even"
          (let [expected nil
                actual (hello/maybe-square-last-even-int [1])]
          expected => actual))))

