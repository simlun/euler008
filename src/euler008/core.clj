(ns euler008.core
  (:gen-class))

(defn- greatest [a b]
  (if (> a b)
    a
    b))

(defn find-greatest-5product [numbers]
  (defn recursion [current-numbers current-greatest]
    (let [number-count (count current-numbers)
          done (< number-count 5)
          five-consecutive-numbers (take 5 current-numbers)
          product (reduce * five-consecutive-numbers)
          next-numbers (rest current-numbers)
          next-greatest (greatest product current-greatest)]
      (if done
        current-greatest
        (recursion next-numbers next-greatest))))
  (recursion numbers 0))

(defn string-to-integer-list [input]
  (map #(read-string (str %)) input))

(defn find-greatest-5product-from-string [input]
  (find-greatest-5product (string-to-integer-list input)))

(defn -main [& args]
  (println (find-greatest-5product-from-string (read-line))))

