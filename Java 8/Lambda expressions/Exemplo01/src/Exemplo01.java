public class Exemplo01 {

    interface Figura{

        void desenha();
    }

    public static void main(String[] args){

        Figura fig1 = new Figura() { // Exemplo sem o uso de lambda expressions
            @Override
            public void desenha() {
                System.out.println("Desenha a figura 1");
            }
        };

        fig1.desenha();

        Figura fig2 = (() -> System.out.println("Desenha a figura 2"));
        fig2.desenha();
    }
}
