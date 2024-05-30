package br.com.acme.solid.interfacesegregation;

import java.math.BigDecimal;

public class Vendedor implements Funcionario, Comissionavel{
    @Override
    public BigDecimal salario() {
        System.out.println("Caldulando salario do vendedor");
        return null;
    }
    @Override
    public BigDecimal gerarComissao() {
        return salario().multiply(new BigDecimal("0.03"));

    }
}
