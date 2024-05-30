package br.com.acme.solid.interfacesegregation;

import java.math.BigDecimal;

public class VendedorExterno implements Funcionario, Comissionavel{
    @Override
    public BigDecimal salario() {
        return null;
    }

    @Override
    public BigDecimal gerarComissao() {
        return salario().multiply(new BigDecimal("0.01"));
    }
}
