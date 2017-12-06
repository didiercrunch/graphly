(defproject graphly "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-RC1"]
                 [clj-http "3.7.0"]
                 [hiccup "1.0.5"]]
  :main ^:skip-aot graphly.core
  :plugins [[lein-jupyter "0.1.10"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
