; https://www.hackerrank.com/challenges/string-mingling

(defn string_mingler[string1 string2](clojure.string/join " (for [i (range (count string1))](str (get string1 i) (get string2 i)))))

(print (string_mingler (read-line) (read-line)))
