(defn printHello [] (str "Hello World"))

(defn return_hello [n] (for [i (range n)] (printHello)))

(defn hello_world_n_times [n] (doseq [item (return_hello n)](println item)))


(def n (Integer/parseInt (read-line)))
(hello_world_n_times n)