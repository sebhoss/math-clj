;   This program is free software. It comes without any warranty, to the extent permitted by applicable law.
;   You can redistribute it and/or modify it under the terms of the Do What The Fuck You Want To Public
;   License, Version 2, as published by Sam Hocevar. See http://www.wtfpl.net/ for more details.

(ns com.github.sebhoss.predicate
  "Common predicates for everyday commodities"
  (:require [com.github.sebhoss.math :refer :all]))

(def not-nil? (comp not nil?))

(defn ≈
  "(≈ x y epsilon) returns true if the difference between x and y is less than epsilon"
  ([x y]
    {:pre [(number? x)
           (number? y)]}
    (≈ x y 1))
  ([x y epsilon]
    {:pre [(number? x)
           (number? y)
           (number? epsilon)]}
    (< (abs (- x y)) epsilon)))

(defn ≈0
  "(≈0 x epsilon) returns true if x is within epsilon of zero"
  ([x]
    {:pre [(number? x)]}
    (≈0 x 1))
  ([x epsilon]
    {:pre [(number? x)
           (number? epsilon)]}
    (≈ x 0 epsilon)))