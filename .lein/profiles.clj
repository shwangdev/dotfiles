{:user {:dependencies [[org.clojars.gjahad/debug-repl "0.3.3"]
                       [im.chit/vinyasa "0.1.8"]
                       [difform "1.1.2"]]
        :injections [(require 'vinyasa.inject)
                     (require 'vinyasa.pull)
                     (require 'alex-and-georges.debug-repl)
                     (require 'com.georgejahad.difform)
                     (vinyasa.inject/inject
                      'clojure.core
                      '[[vinyasa.pull pull]
                        [alex-and-georges.debug-repl debug-repl]
                        [com.georgejahad.difform difform]])]
        :test-refresh {:notify-command ["tmux" "display-message"]
                       :notify-on-success true}
        :plugins [[lein-pprint "1.1.1"]
                  [quickie "0.2.5"]
                  [cider/cider-nrepl "0.7.0-SNAPSHOT"]
                  [com.jakemccrary/lein-test-refresh "0.5.0"]]}}
