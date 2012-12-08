(ns euler008.core)

(defn to-integer-list [input]
  (map #(read-string (str %)) input))

(defn find-greatest-product [])

(defn mjao [input]
  (find-greatest-product (to-integer-list input))
  )
