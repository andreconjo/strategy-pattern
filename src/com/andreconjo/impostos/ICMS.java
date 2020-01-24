package com.andreconjo.impostos;

public class ICMS implements Imposto {
    @Override
    public double calcular(Double valorProduto) {
        return valorProduto + (valorProduto * 0.3);
    }
}
