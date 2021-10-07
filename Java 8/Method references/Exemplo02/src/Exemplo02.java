import java.util.ArrayList;
import java.util.List;


class Produto {

    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

class Impressora{

    public static void imprime(Produto p){
        System.out.println(p.getNome() + " = " + p.getPreco());
    }

}

public class Exemplo02 {

    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("TV 42", 2000.00));
        lista.add(new Produto("Geladeira 470L", 3200.00));
        lista.add(new Produto("Fogão 4 bocas", 900.00));
        lista.add(new Produto("Videogame", 1999.00));
        lista.add(new Produto("Microondas", 550.00));

        //lambda expression com argumento
        System.out.println("lambda expression com argumento");
        lista.forEach((produto) -> System.out.println(produto.getNome() + " = " + produto.getPreco()));
        System.out.println("\n");

        lista.sort((produto1, produto2) -> produto1.getPreco().compareTo(produto2.getPreco())); //ordenando do menor para o maior

        System.out.println("utilizando vários métodos dentro da lambda");
        lista.forEach((produto) -> { //utilizando vários métodos dentro da lambda
                    System.out.println(produto.getNome());
                    System.out.println(produto.getPreco());
                }
        );
        System.out.println("\n");

        // Method references
        System.out.println("Method references");
        lista.forEach(Impressora::imprime);

    }
}
