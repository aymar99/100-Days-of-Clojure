;; https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---gcd
;; Strugging my best to keep up the streak

(defn gcd [a b] (if (not= b 0) (gcd b (mod a b)) (+ 0 a)))