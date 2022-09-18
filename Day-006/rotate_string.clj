;; https://www.hackerrank.com/challenges/rotate-string/

(defn rotate[st](for [i (range (count st))] (str (subs st (+ i 1) (count st)) (subs st 0 (+ i 1)))))

(defn get-lst[] (for [i (range (Integer/parseInt (read-line)))](clojure.string/join " " (rotate (read-line)))))

(doseq [item (get-lst)](println item))
 
 