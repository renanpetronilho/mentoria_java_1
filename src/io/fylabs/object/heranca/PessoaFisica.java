package io.fylabs.object.heranca;

import io.fylabs.object.encapsulamento.Pessoa;

public class PessoaFisica extends Pessoa {

    private String nomeMae;

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }


    @Override
    public boolean validarDocumento() {
        return getDocumento().length() == 4;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + getNome() + '\'' +
                "nomeMae='" + nomeMae + '\'' +
                ", cpf='" + getDocumento() + '\'' +
                '}';
    }
}