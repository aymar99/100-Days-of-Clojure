; https://www.hackerrank.com/challengeslambda-march-compute-the-perimeter-of-a-polygon
;

(def mylst (map #(apply list %) (map #(clojure.string/split % #
) (for [i (range (Integer/parseInt (read-line)))] (read-line)))))

(defn findDist[x1 y1 x2 y2](Math/sqrt (+ (Math/pow (- x2 x1) 2) (Math/pow (- y2 y1) 2))))

(print (+ (reduce + (for [i (range (- (count mylst) 1))] (findDist (Integer/parseInt (nth (nth mylst i) 0)) (Integer/parseInt (nth (nth mylst i) 1)) (Integer/parseInt (nth (nth mylst (+ i 1)) 0)) (Integer/parseInt (nth (nth mylst (+ i 1)) 1)) ))
) (findDist (Integer/parseInt (nth (nth mylst 0) 0)) (Integer/parseInt (nth (nth mylst 0) 1)) (Integer/parseInt (nth (nth mylst (- (count mylst) 1)) 0)) (Integer/parseInt (nth (nth mylst (- (count mylst) 1)) 1)) )))
