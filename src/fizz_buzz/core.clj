(ns fizz-buzz.core
  (:gen-class))

(defn is-fizz [num]
  (= 0 (mod num 3))
  )

(defn is-buzz [num]
  (= 0 (mod num 5))
  )

(defn is-fizz-buzz [num]
  (and (is-fizz num) (is-buzz num))
  )

(defn print-num [num]
  (if (= true (is-fizz-buzz num))
    "FizzBuzz"
    (if (= true (is-fizz num))
      "Fizz"
      (if (= true (is-buzz num))
        "Buzz"
        (str num))))
  )

(defn print-all []
  (println "in func")
  (doseq [n (range 1 20)]
    (println (print-num n))
))

(defn -main [& args]
  (println "hello world")
  (print-all)
  )
