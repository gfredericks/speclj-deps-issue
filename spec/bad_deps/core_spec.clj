(ns bad-deps.core-spec
  (:require [bad-deps.core :refer :all]
            [speclj.core :refer :all]))

(describe "FOO"
          (it "prints the version of java.jdbc"
              (should (nil? (-main)))))


(run-specs)
