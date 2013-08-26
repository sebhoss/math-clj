;
; This program is free software. It comes without any warranty, to
; the extent permitted by applicable law. You can redistribute it
; and/or modify it under the terms of the Do What The Fuck You Want
; To Public License, Version 2, as published by Sam Hocevar. See
; http://www.wtfpl.net/ for more details.
;

(ns com.github.sebhoss.math-protocols
  "Protocols for match functions")

(defprotocol MEAN
  (mean [x & more] "(mean x & more) is the mean of x and more"))

(defprotocol ABS
  (abs [x] "(abs x) is the absolute value of x"))

(defprotocol COMPARISON
  (min [x y] "(min x y) returns the smaller of x and y")
  (max [x y] "(max x y) returns the greater of x and y"))

(defprotocol Rounding
  (floor [x] "(floor x) is x rounded down")
  (ceil [x] "(ceil x) is x rounded up")
  (round [x] "(round x) is x rounded to the nearest integer"))

(defprotocol Sign
  (sgn [x] "(sgn x) returns '+' for positive, '-' for negative numbers and an empty string for zero")
  (signum [x] "(signum x) returns 1 for positive, -1 for negative numbers and 0 for zero")
  (sgn-eq? [x y] "(sgn-eq? x y) returns true if both x and y share the same sign")
  (sgn-different? [x y] "(sgn-different? x y) returns true if x and y do not share the same sign"))

(defprotocol Logarithm
  (ln [x] "(ln x) is the natural (base e) logarithm of x")
  (log10 [x] "(log10 x) is the base 10 logarithm of x"))

(defprotocol Exponent
  (exp [exponent] "(exp exponent) is Euler's number e raised to the power of exponent")
  (pow [base exponent] "(pow base exponent) is base raised to the power of exponent"))

(defprotocol Root
  (root [degree radicand] "(root degree radicand) is the degree-th root of radicand")
  (sqrt [radicand] "(sqrt radicand) is square root of radicand"))

(defprotocol Trigonometric
  (sin [x] "(sin x) is the trigonometric sine of x")
  (cos [x] "(cos x) is the trigonometric cosine of x")
  (tan [x] "(tan x) is the trigonometric tangent of x")
  (asin [x] "(asin x) is the arc sine of x")
  (acos [x] "(acos x) is the arc cosine of x")
  (atan [x] "(atan x) is the arc tangent of x"))

(defprotocol Hyperbolic
  (sinh [x] "(sinh x) is the hyperbolic sine of x")
  (cosh [x] "(cosh x) is the hyperbolic cosine of x")
  (tanh [x] "(tanh x) is the hyperbolic tangent of x"))
