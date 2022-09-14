;; https://www.hackerrank.com/challenges/string-o-permute

(defn get_permute [lst] (clojure.string/join "" (map #(get lst %)(vec (for [item (range (count lst))] (if (even? item) (+ item 1) (- item 1)))))))


(doseq [item (map #(get_permute (clojure.string/split % #""))(for [i  (range (Integer/parseInt (read-line)))] (read-line)))] (println item))