;; https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---fibonacci-numbers/problem?h_r=profile

(defn fibonacci [n] (if (< n 2) (* 1 n) (+ (fibonacci (- n 1)) (fibonacci (- n 2)))))

(println (fibonacci (- (Integer/parseInt (read-line)) 1)))