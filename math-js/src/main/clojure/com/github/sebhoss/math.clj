;
; This program is free software. It comes without any warranty, to
; the extent permitted by applicable law. You can redistribute it
; and/or modify it under the terms of the Do What The Fuck You Want
; To Public License, Version 2, as published by Sam Hocevar. See
; http://www.wtfpl.net/ for more details.
;

(ns com.github.sebhoss.math
  "JavaScript-based implementation of misc. math functions"
  (:require [com.github.sebhoss.math-protocols :refer :all]))

(extend-type Number
  ABS
    (abs [x] (js/Math.abs x))
  Rounding
    (floor [x] (js/Math.floor x))
    (ceil [x] (js/Math.ceil x))
    (round [x] (js/Math.round x))
  Exponent
    (exp [exponent] (js/Math.exp exponent))
    (pow [base exponent] (js/Math.pow base exponent))
  Trigonometric
    (sin [x] (js/Math.sin x))
    (cos [x] (js/Math.cos x))
    (tan [x] (js/Math.tan x))
    (asin [x] (js/Math.asin x))
    (acos [x] (js/Math.acos x))
    (atan [x] (js/Math.atan x)))
