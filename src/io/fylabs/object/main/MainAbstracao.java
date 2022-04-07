package io.fylabs.object.main;

import io.fylabs.object.abstracao.PessoaTeste;

public class MainAbstracao {

    public static void main(String[] args) {

        PessoaTeste pessoa = new PessoaTeste();

        pessoa.documento = "1234";
        pessoa.nome = "renan";

        System.out.println(pessoa.nome);

        System.out.println("--");

        System.out.println(pessoa.mostrarNome());
    }
}
