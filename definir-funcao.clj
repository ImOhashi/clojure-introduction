(defn imprime-mensagem []
  (println "Bem vindo(a) ao estoque"))

(imprime-mensagem)

(defn valor-descontado 
  "Retorna o valor descontado"
  [valor-bruto]
  (* valor-bruto 0.9))

(valor-descontado 1000)

(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (* valor-bruto (- 1 0.10)))

(valor-descontado 1000)