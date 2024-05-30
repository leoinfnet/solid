package br.com.acme.solid.interfacesegregation;

import java.math.BigDecimal;

public class Recepcionista implements Funcionario{
    @Override
    public BigDecimal salario() {
        System.out.println("Calculando salario da recepcionista");
        return null;
    }

}
