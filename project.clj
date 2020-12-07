(defproject baskeboler/chart-cljs "1.0.0"
  :description "cljs wrapper for chart.js"
  :url "https://github.com/baskeboler/chart-cljs"

  ;; this is optional, add what you want or remove it
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies
  ;; always use "provided" for Clojure(Script)
  [[org.clojure/clojurescript "1.10.520" :scope "provided"]
   [reagent "1.0.0-rc1"]]

  :source-paths ["src/main"]
  :repositories
  {"clojars" {:url "https://clojars.org/repo"
              :sign-releases false}})
 
