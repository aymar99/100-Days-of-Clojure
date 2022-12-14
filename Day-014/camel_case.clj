; https://www.hackerrank.com/challenges/camelcase
(defn intVal [bool](if (= bool false) 0 1))

(defn camelcase [s]
     (+ (apply + (map #(intVal %)(for [i (range (count s))](Character/isUpperCase (get s i))))) 1)
)
