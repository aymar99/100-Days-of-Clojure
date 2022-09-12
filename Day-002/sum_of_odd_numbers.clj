https://www.hackerrank.com/challenges/fp-sum-of-odd-elements

(defn sum_odd[lst](reduce + (vec (filter odd? lst))))