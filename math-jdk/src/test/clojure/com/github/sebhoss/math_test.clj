;
; This program is free software. It comes without any warranty, to
; the extent permitted by applicable law. You can redistribute it
; and/or modify it under the terms of the Do What The Fuck You Want
; To Public License, Version 2, as published by Sam Hocevar. See
; http://www.wtfpl.net/ for more details.
;

(ns com.github.sebhoss.math-test
  (:require [com.github.sebhoss.math-protocols :refer :all]
            [com.github.sebhoss.math :refer :all]
            [clojure.test :refer :all]))

(deftest round-test
  (testing "with positive numbers"
    (is (= 1 (round 1.2))))
  (testing "with negative numbers"
    (is (= -1 (round -1.2))))
  (testing "with zero"
    (is (= 0 (round 0.0)))))
