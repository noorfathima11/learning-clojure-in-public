(ns playground.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

Long/MAX_VALUE
Integer/MAX_VALUE
Short/MAX_VALUE
Byte/MAX_VALUE

(inc (bigint Long/MAX_VALUE))

(type 5N)

(type (int 0))
(type (short 0))
(type (byte 0))
(type 1.23)
(type (float 1.23))
0.9999999999999999999999
(type 1/3)

(<= 1 2 3)
(<= 1 3 2)

(re-find #"cat" "mystic cat mouse")
(re-find #"cat" "only dogs here")

(rest (re-matches #"(.+):(.+)" "mouse:treat"))

(rest [1]) ;returns logical true
(next [1]) ;returns logical false

([:a :b :c] 1)

(= '(1 2 3) [1 2 3])

#{:a :b :c}

(let [burrito #(list "beans" % "cheese")]
  (burrito "carnitas"))

'inc
(resolve 'inc)
(eval 'inc)

(defn vargs
  [x y & more-args]
  {:x x
   :y y
   :more more-args})

(vargs 1 2)
(vargs 1 2 3 4 5)

(fn? type)
(doc type) 
(meta #'type)
(source type)

;;;;;;;;;;;;;;;;End of day 2;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
