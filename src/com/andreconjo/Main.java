package com.andreconjo;

import com.andreconjo.impostos.Imposto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Double valorProduto = 0.0;
	    ImpostoEnum impostoEnum;

        System.out.println("Digite o valor do produto: ");
        valorProduto = sc.nextDouble();

        System.out.println("Digite qual imposto deseja aplicar:");
        System.out.println("1 - ICMS");
        System.out.println("2 - IPI");

        impostoEnum = ImpostoEnum.values()[sc.nextInt() - 1];

        Imposto imposto = impostoEnum.obtemImposto();
        Double valorDoProdutoComImposto = imposto.calcular(valorProduto);

        System.out.println("Produto com valor final: " + valorDoProdutoComImposto);

    }
}
