(ns euler008.core-test
  (:use euler008.core)
  (:use midje.sweet))

(fact "midje seems to work"
  (+ 1 2) => 3)


(fact
  (find-greatest-5product-from-string "12345") => 120
  (provided
    (string-to-integer-list "12345") => '(1 2 3 4 5)
    (find-greatest-5product '(1 2 3 4 5)) => 120))

(fact
  (find-greatest-5product-from-string "23456") => 720
  (provided
    (string-to-integer-list "23456") => '(2 3 4 5 6)
    (find-greatest-5product '(2 3 4 5 6)) => 720))


(fact
   (string-to-integer-list "12345") => '(1 2 3 4 5))


(fact
  (find-greatest-5product '(1 2 3 4 5)) => 120
  (find-greatest-5product '(2 3 4 5 6)) => 720)

(fact
  (find-greatest-5product '(1 2 3 4 5 6)) => 720)

(fact
  (find-greatest-5product '(1 2 3 4 5 6 7)) => 2520
  (find-greatest-5product '(1 2 3 4 5 6 1)) => 720)

