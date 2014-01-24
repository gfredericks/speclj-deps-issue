(ns bad-deps.core-test
  (:require [clojure.test :refer :all]
            [bad-deps.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (nil? (-main)))))
