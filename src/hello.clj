(ns hello
  (:require [com.rpl.specter :as specter]))

(defn inc-last-odd [xs]
  (specter/transform [(specter/filterer odd?) specter/LAST] inc xs))

(defn -main []
  (println (str "The inc-last-odd is " (inc-last-odd [1 2 3]))))
