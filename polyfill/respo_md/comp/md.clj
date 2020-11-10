
(ns respo-md.comp.md)

(defmacro h3 [props & children]
  `(respo.core/create-element :h3 ~props ~@children))

(defmacro h4 [props & children]
  `(respo.core/create-element :h4 ~props ~@children))
