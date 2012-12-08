(ns euler008.core)

(defn- greatest [a b]
  (if (> a b)
    a
    b))

(defn find-greatest-5product [numbers]
  (defn- recursion [numbers current-max]
    (let [next-numbers (rest numbers)
          number-count (count numbers)
          five-numbers (take 5 numbers)
          done (< number-count 5)
          product (reduce * five-numbers)
          greatest (greatest product current-max)]
      (if done
        current-max
        (recursion next-numbers greatest))))
  (recursion numbers 0))

(defn string-to-integer-list [input]
  (map #(read-string (str %)) input))

(defn find-greatest-5product-from-string [input]
  (find-greatest-5product (string-to-integer-list input)))

(defn -main [& args]
  (println (find-greatest-5product-from-string (read-line))))

