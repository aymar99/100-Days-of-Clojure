;; https://www.hackerrank.com/challenges/fp-filter-array/problem

(defn filter_list [delim lst] (doseq [item (filter #(< % delim) lst)] (println item)))