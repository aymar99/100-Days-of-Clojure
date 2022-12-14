;; https://www.hackerrank.com/challenges/eval-ex

(def n (Integer/parseInt (clojure.string/trim (read-line))))

(defn fact [n] (if (< n 2) 1 (* (fact (- n 1)) n)))
(doseq [n-itr (range n)]
    (def x (Double/parseDouble (clojure.string/trim (read-line))))
    (println (format "%.4f" (apply + (for [i (range 10)] (/ (Math/pow x i) (fact i) )))))
)

