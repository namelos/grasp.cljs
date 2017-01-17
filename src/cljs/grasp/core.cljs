(ns grasp.core)

(enable-console-print!)

(def query js/document.getElementById)

(aset (query "app") "innerHTML" "Hello")
