(defproject bad-deps "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.3.0-beta2"]]
  :plugins [[migratus-lein "0.1.0"]]
  :profiles
  {:dev {:plugins [[speclj "2.9.0"]]}
   :speclj {:test-paths ["spec"]}}
  :main bad-deps.core)
