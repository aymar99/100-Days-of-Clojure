; https://www.hackerrank.com/challenges/pascals-triangle



(defn fact[n](if (< n 2) 1 (* n (fact (- n 1)))))

(defn get_val[n r](/ (fact n) (* (fact r) (fact (- n r)))))

(defn get_pascal_list[n](for [i (range n)](for [j (range (+ i 1))] (get_val i j))))

(doseq [item (get_pascal_list (Integer/parseInt (read-line)))](apply println item))
