(defproject erasure "2.0"
  :description "A Whitespace compiler in Clojure"
  :url "https://github.com/jmesyou/erasure"
  :license {:name "MIT Public License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.match "0.3.0-alpha5"]
                 [org.clojure/tools.cli "0.3.5"]
                 [instaparse "1.4.9"]
                 ]
  :aot  [erasure.core]
  :main erasure.core
  :java-source-paths ["src/" "test/"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
