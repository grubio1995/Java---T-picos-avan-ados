interface Figura2d {
    void desenha(Double largura, Double altura);
}

class Retangulo {
    public void desenhaRetangulo(Double largura, Double altura) {
        System.out.println("Desenha retângulo de Largura: " + largura + " e Altura: " + altura);
    }
}


public class Exemplo01 {

    public static void main(String[] args) {

        // Lambda expression
      Figura2d fig1 = (largura, altura) -> System.out.println("Desenha figura de Largura: " + largura + " e Altura: " + altura);
      fig1.desenha(8.0d,1.5d);

      //Objeto específico
      Retangulo ret = new Retangulo();
      //Method Reference
      Figura2d fig2 = ret :: desenhaRetangulo;
      fig2.desenha(10.5 ,7.0);
    }
}
