(ns hello
  (:require [com.rpl.specter :as specter]))

(defn inc-last-odd [xs]
  (specter/transform [(specter/filterer odd?) specter/LAST] inc xs))

(defn -main []
  (let [input [1 2 3]
        result (inc-last-odd input)]
    (println (str "The result of calling inc-last-odd with " input " is " result))))
