;;  https://www.hackerrank.com/challenges/mini-max-sum


(def arr (vec (map #(Integer/parseInt %) (clojure.string/split (clojure.string/trimr (read-line)) #
))))

(def sorted-arr (vec (sort arr)))
(print (apply + (subvec sorted-arr 0 (- (count sorted-arr) 1))) (apply + (subvec sorted-arr 1 (count sorted-arr))))
