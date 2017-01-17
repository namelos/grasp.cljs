(ns grasp.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [grasp.core-test]
   [grasp.common-test]))

(enable-console-print!)

(doo-tests 'grasp.core-test
           'grasp.common-test)
