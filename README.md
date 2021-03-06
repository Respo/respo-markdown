
Respo Markdown
----

Render Markdown subset to Respo DSL.

Demo http://repo.respo-mvc.org/respo-markdown/

Supported features:

* Code block
* Headers, h1, h2, h3, h4
* Quoteblock
* Unordered list
* Inline code
* Url
* Inline link
* Image link

### Usage

[![Clojars Project](https://img.shields.io/clojars/v/respo/markdown.svg)](https://clojars.org/respo/markdown)

```clojure
[respo/markdown "0.2.4"]
```

```clojure
(respo-md.comp.md/comp-md-block "a\n" {})
; returns DSL
(respo-md.comp.md/comp-md "text inline")
; render inline DOM elements
```

For options `{}`, `highlight.js` is suggested:

```clojure
{:highlight (fn [code lang]
   (let [result (.highlight hljs lang code)]
     (comment .log js/console "Result" result code lang js/hljs)
     (.-value result)))
 :style {}
 :css ".md-p {}"
 :class-name "demo"}
```

Write your own CSS to style the HTML:

```css
.md-block {}

.md-span {}

.md-p {
  margin: 16px 0;
}

.md-code-block {
  color: white;
  background-color: hsl(300, 80%, 20%);
  padding: 8px;
  display: block;
  line-height: 1.5em;
}
```

### Develop

Workflow https://github.com/mvc-works/calcit-workflow

### License

MIT
