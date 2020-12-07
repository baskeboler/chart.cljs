(ns chart-cljs.core
  (:require [reagent.core :as reagent]
            ["chart.js"]))

(defn- show-chart-fn [canvas-id chart-data]
  (fn []
    (let [ctx        (.. js/document
                         (getElementById canvas-id)
                         (getContext "2d"))]
          
      (js/Chart. ctx (clj->js chart-data)))))

(defn ^:export chart-component [chart-data]
  (let [canvas-id  (str (gensym))
        show-chart (show-chart-fn canvas-id chart-data)]
    (reagent/create-class
     {:component-did-mount #(show-chart)
      :display-name        (str "chart-cljs-component-" canvas-id)
      :reagent-render      (fn []
                             [:canvas {:id canvas-id}])})))
