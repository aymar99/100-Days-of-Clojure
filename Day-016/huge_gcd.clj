;; https://www.hackerrank.com/challenges/huge-gcd-fp

(def lst1 (list
(apply * (map #(Integer/parseInt %) (clojure.string/split (read-line) #
)))
(apply * (map #(Integer/parseInt %) (clojure.string/split (read-line) #
)))
(apply * (map #(Integer/parseInt %) (clojure.string/split (read-line) #
)))
(apply * (map #(Integer/parseInt %) (clojure.string/split (read-line) #
)))
))

(defn gcd [a b] (if (not= b 0) (gcd b (mod a b)) (+ 0 a)))

(println lst1)
