;
; This program is free software. It comes without any warranty, to
; the extent permitted by applicable law. You can redistribute it
; and/or modify it under the terms of the Do What The Fuck You Want
; To Public License, Version 2, as published by Sam Hocevar. See
; http://www.wtfpl.net/ for more details.
;

(ns com.github.sebhoss.math
  "JDK-based implementation of misc. math functions"
  (:require [com.github.sebhoss.math-protocols :refer :all]))

(extend-type Number
  Rounding
    (floor [x] (Math/floor x))
    (ceil [x] (Math/ceil x))
    (round [x] (Math/round (double x))))
