(ns fizz-buzz.core-test
  (:require [clojure.test :refer :all]
            [fizz-buzz.core :refer :all]))

(deftest test-fizz
  (is (= false (is-fizz 2)))
  (is (= true (is-fizz 3)))
  )

(deftest test-buzz
  (is (= true (is-buzz 5)))
  (is (= false (is-buzz 3)))
  )

(deftest test-fizz-buzz
  (is (= true (is-fizz-buzz 15)))
  )

(deftest test-print-num
  (is (= "1" (print-num 1)))
  (is (= "2" (print-num 2)))
  (is (= "Fizz" (print-num 3)))
  (is (= "Buzz" (print-num 5)))
  (is (= "7" (print-num 7)))
  (is (= "FizzBuzz" (print-num 15)))
  )

(deftest test-all
  (print-all))