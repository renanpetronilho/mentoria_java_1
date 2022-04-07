package io.fylabs.object.main;

import io.fylabs.object.encapsulamento.Pessoa;
import io.fylabs.object.heranca.PessoaFisica;
import io.fylabs.object.heranca.PessoaJuridica;

public class MainHeranca {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setDocumento("1234");
        pessoaFisica.setNome("Renan");
        pessoaFisica.setNomeMae("Cleni");

        System.out.println("validar doc pf: "+ pessoaFisica.validarDocumento());


        System.out.println("================");

        System.out.println(pessoaFisica);


        System.out.println("================");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setDocumento("123456");
        pessoaJuridica.setNome("Coca Cola");
        System.out.println(pessoaJuridica);

        System.out.println("validar doc pj: "+pessoaJuridica.validarDocumento());

        System.out.println("================");


        PessoaJuridica empresaX = new PessoaJuridica();
        empresaX.setDocumento("123456");
        empresaX.setNome("Empresa X");
        empresaX.addSocio(pessoaFisica);
        empresaX.addSocio(pessoaJuridica);
        System.out.println(empresaX);


        Pessoa pessoa = pessoaJuridica;

        System.out.println("validar doc: "+pessoa.validarDocumento());


    }
}
