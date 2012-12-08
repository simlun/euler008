(ns euler008.core-test
  (:use euler008.core)
  (:use midje.sweet))

(fact "midje seems to work"
  (+ 1 2) => 3)

(fact
  (mjao "12345") => 120
  (provided
    (find-greatest-product '(1 2 3 4 5)) => 120))

(fact
  (mjao "23456") => 720
  (provided
    (find-greatest-product '(2 3 4 5 6)) => 720))

(fact
   (to-integer-list "12345") => '(1 2 3 4 5))