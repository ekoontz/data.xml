(defproject org.clojure/data.xml "0-UE-DEVELOPMENT"
  :source-paths ["src/main/clojure" "src/main/clojurescript"]
  :test-paths ["src/test/clojure" "src/test/clojurescript"]
  :resource-paths ["src/main/resources" "src/test/resources" "target/gen-resources"]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.773"]
                 [cider/piggieback "0.5.1"]
                 [org.clojure/tools.nrepl "0.2.13"]
                 [org.clojure/test.check "1.1.0"]
                 [figwheel-sidecar "0.5.20"]
                 [binaryage/devtools "1.0.2"]
                 [com.fasterxml.woodstox/woodstox-core "6.2.1"]]
  :profiles {:dev {:dependencies [[cider/piggieback "0.5.1"]]
                   :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]}}})

