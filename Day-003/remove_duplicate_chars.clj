;; https://www.hackerrank.com/challenges/remove-duplicates

(println (clojure.string/join (vec (distinct (clojure.string/split (read-line) #"")))))