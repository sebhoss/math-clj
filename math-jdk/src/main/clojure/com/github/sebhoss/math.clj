;
; This program is free software. It comes without any warranty, to
; the extent permitted by applicable law. You can redistribute it
; and/or modify it under the terms of the Do What The Fuck You Want
; To Public License, Version 2, as published by Sam Hocevar. See
; http://www.wtfpl.net/ for more details.
;

(ns com.github.sebhoss.math
  "JDK-based implementation of misc. math functions

   References:
    * http://docs.oracle.com/javase/7/docs/api/java/lang/Math.html"
  (:require [com.github.sebhoss.math-protocols :refer :all]))

(def ^:const e
  "e is the double value that is closer than any other to e, the base of the natural logarithms."
  (Math/E))

(def ^:const pi
  "pi is the double value that is closer than any other to pi, the ratio of the circumference of a circle to its
   diameter."
  (Math/PI))

(extend-protocol ABS
  Number
    (abs [x] (if (neg? x) (- x) x)))

(extend-protocol Rounding
  Number
    (floor [x] (Math/floor x))
    (ceil [x] (Math/ceil x))
    (round [x] (Math/round (double x))))

(extend-protocol Sign
  Number
    (sgn [x]
      (cond
        (neg? x) "-"
        (pos? x) "+"
        :else ""))
    (signum [x]
      (Math/signum (double x)))
    (sgn-eq? [x y]
      (= (sgn x) (sgn y)))
    (sgn-different? [x y]
      (not (sgn-eq? x y))))

(extend-protocol Logarithm
  Number
    (ln [x] (Math/log x))
    (log10 [x] (Math/log10 x)))

(extend-protocol Exponent
  Number
    (exp [exponent] (Math/exp exponent))
    (pow [base exponent] (Math/pow base exponent)))

(extend-protocol Root
  Number
    (root [degree radicand] (Math/pow radicand (/ 1.0 degree)))
    (sqrt [radicand] (Math/sqrt radicand)))

(extend-protocol Trigonometric
  Number
    (sin [x] (Math/sin x))
    (cos [x] (Math/cos x))
    (tan [x] (Math/tan x))
    (asin [x] (Math/asin x))
    (acos [x] (Math/acos x))
    (atan [x] (Math/atan x)))

(extend-protocol Hyperbolic
  Number
    (sinh [x] (Math/sinh x))
    (cosh [x] (Math/cosh x))
    (tanh [x] (Math/tanh x)))