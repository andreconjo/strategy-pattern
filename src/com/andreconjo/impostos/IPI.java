package com.andreconjo.impostos;

public class IPI implements Imposto {

    @Override
    public double calcular(Double valorProduto) {
        return valorProduto + (valorProduto * 0.10);
    }
}
