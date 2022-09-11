;; https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem?isFullScreen=true

(defn remove_odd_positions [lst] (doseq [item (for [i (filter odd? (range (count lst)))] (get (vec lst) i))] (println item)))