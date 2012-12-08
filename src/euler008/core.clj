(ns euler008.core)

(defn to-integer-list [input]
  (map #(read-string (str %)) input))

(defn- inner2 [five-factors greatest-product]
  (let [product (reduce * five-factors)]
    (if (> product greatest-product) product greatest-product)))

(defn- inner [numbers greatest-product]
  (let [next-numbers (rest numbers)
        five-factors (take 5 numbers)]
    (cond 
      (< (count numbers) 5) greatest-product
      :else (inner next-numbers (inner2 five-factors greatest-product)))))

(defn find-greatest-5product [numbers]
  (inner numbers 0))

(defn mjao [input]
  (find-greatest-5product (to-integer-list input)))

(defn -main [& args]
  (println (mjao (read-line))))

