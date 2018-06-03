(ns hello
  (:require [clojure.algo.monads :as monad]
            [com.rpl.specter :as specter]))

(defn inc-last-odd [xs]
  "Increment last odd number. Otherwise, noop if none exist."
  (specter/transform [(specter/filterer odd?) specter/LAST] inc xs))

(defn maybe-square-last-even-int [xs]
  "Square last int if even. Otherwise, fail early and return nil."
  (monad/domonad monad/maybe-m
    [last-even (-> xs
                 reverse
                 first
                 (#(if (even? %) % nil)))]
    (* last-even last-even)))

(defn -main []
  (let [inc-last-odd-input [1 2 3]
        inc-last-odd-result (inc-last-odd inc-last-odd-input)
        square-last-even-input [1 2]
        square-last-even-result (maybe-square-last-even-int square-last-even-input)]
    (println (str "The result of calling inc-last-odd with " inc-last-odd-input " is " inc-last-odd-result))
    (println (str "The result of calling maybe-square-last-even-int with " square-last-even-input " is " square-last-even-result))))
