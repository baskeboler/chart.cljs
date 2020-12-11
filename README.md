# chart.cljs
[![Clojars Project](https://img.shields.io/clojars/v/baskeboler/chart-cljs.svg)](https://clojars.org/baskeboler/chart-cljs)

Reagent component for  [Chart.js](https://www.chartjs.org/)

## usage

```cljs

(defn sales-chart-data []
   {:type                "line"
    :responsive          true
    :options             {:title {:display true
                                  :text    "Pepsi vs Coke Sales"}}
    :maintainAspectRatio false
    :data                {:labels   ["Jan" "Feb" "Mar" "Apr" "May" "Jun" "Jul" "Aug" "Sep" "Oct" "Nov" "Dec"]
                          :datasets [{:data            (repeatedly 12 #(rand-int 500))
                                      :label           "Pepsi"
                                      :backgroundColor "#FF0000"}
                                     {:data            (repeatedly 12 #(rand-int 500))
                                      :label           "Coca-Cola"
                                      :backgroundColor "#00FF00"}]}})
(defn sales-chart []
  [chart/chart-component (sales-chart-data)])

```


See [Chart.js docs](https://www.chartjs.org/docs/latest/) for more details on the chart options passed to the component.

