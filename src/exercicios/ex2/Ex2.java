package exercicios.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    private ArrayList<Produto> getProdutos(){
        ArrayList<Produto> estoque = new ArrayList<>();
        estoque.add(new Produto("Monitor", 800.0));
        estoque.add(new Produto("Computador",2500.0));
        estoque.add(new Produto("Mouse",52.90));
        estoque.add(new Produto("Teclado",179.90));
        return estoque;
    }

    public void compras(){
        ArrayList<Produto> estoque = getProdutos();
        Scanner in = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Vamos às compras!");
        System.out.println("1 -> "+estoque.get(0).getNome());
        System.out.println("2 -> "+estoque.get(1).getNome());
        System.out.println("3 -> "+estoque.get(2).getNome());
        System.out.println("4 -> "+estoque.get(3).getNome());
        System.out.println("Escolha uma opção: ");
        opcao = in.nextInt();
        Produto prod = estoque.get(opcao-1);
        System.out.println("Informe a quantidade: ");
        int qtd = in.nextInt();
        double valor = prod.getPreco()*qtd;
        double total = 0;
        if(qtd <=10){
            total = valor;
        }else if(qtd > 10 && qtd <= 20){
            total = valor - (valor*0.1);
        }else if(qtd > 20 && qtd <=50){
            total = valor -(valor*0.2);
        }else{
            total = valor -(valor*0.25);
        }
        System.out.println("Produto: "+prod.getNome()+"\nTotal a pagar: R$"+total);
        System.out.println("\nObrigado por comprar conosco!");
    }
}
