package br.com.acme.solid.interfacesegregation;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Funcionario recepcionista = new Recepcionista();
        Funcionario vendedorExterno = new VendedorExterno();
        List<Funcionario> funcionarios = List.of(recepcionista, vendedorExterno);
        for(Funcionario funcionario: funcionarios){
            funcionario.salario();
        }
        VendedorExterno vendedorExterno1 = new VendedorExterno();
        Comissionavel vendedor = new Vendedor();
        List<Comissionavel> vendedores = List.of(vendedorExterno1, vendedor);
        for(Comissionavel comissionado : vendedores  ){
            comissionado.gerarComissao();

        }


    }
}
