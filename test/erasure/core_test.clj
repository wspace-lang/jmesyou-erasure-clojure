(ns erasure.core-test
  (:require [clojure.test :refer :all]
            [erasure.core :refer :all]))

(deftest hello-world-test
  (testing "Program should output: `hello world`"
    (-main "resources/helloworld.ws")))

(deftest count-to-ten-test
  (testing "Program should output: 1 to 10`"
    (-main "resources/count.c")))
