; https://www.hackerrank.com/challenges/common-divisors

(defn gcd [a b] (if (not= b 0) (gcd b (mod a b)) (+ 0 a)))
(defn common_div [n](for [i (range 1 (+ (int (Math/sqrt n)) 1))](if (= (mod n i) 0) (if (= i (/ n i)) 1 2) 0)))
(defn somef[](for [i (range (Integer/parseInt (read-line)))]
(apply + (common_div (apply gcd (map #(Integer/parseInt %) (apply list (clojure.string/split (read-line) #" "))))))))
(doseq [item (somef)] (println item) )