(ns bad-deps.core)

(defn -main
  []
  (println "JAVA JDBC VERSION INFO")
  (-> (clojure.java.io/resource "META-INF/maven/org.clojure/java.jdbc/pom.properties")
      (slurp)
      (clojure.string/split #"\n")
      (nth 2)
      (println)))
