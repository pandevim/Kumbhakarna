(defproject clojure-getting-started "1.0.0-SNAPSHOT"
  :description "Backend Service to Download Certificates"
  :url "http://ca4-certificate.herokuapp.com"
  :license {:name "Eclipse Public License v1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [environ "1.0.0"]
                 [org.clojure/java.jdbc "0.3.5"]
                 [org.postgresql/postgresql "9.4-1201-jdbc4"]]
  :min-lein-version "2.7.2"
  :plugins [[lein-environ "1.1.0"]
            [lein-ring "0.12.5"]]
  :ring {:handler clojure-getting-started.web/app}
  :uberjar-name "clojure-getting-started-standalone.jar"
  :profiles {:production {:env {:production true}}})
