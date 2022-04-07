package io.fylabs.object.heranca;

import io.fylabs.object.encapsulamento.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PessoaJuridica  extends Pessoa {

    private List<Pessoa> socios;

    public List<Pessoa> getSocios() {
        return socios;
    }

    public void setSocio(List<Pessoa> socios) {
        this.socios = socios;
    }

    public void addSocio(Pessoa socio){
        if(Objects.isNull(socios)){
            socios = new ArrayList<>();
        }

        socios.add(socio);
    }

    @Override
    public boolean validarDocumento() {
        return getDocumento().length() == 5;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + getNome() + '\'' +
                "socios='" + socios+ '\'' +
                ", cnpj='" + getDocumento() + '\'' +
                '}';
    }
}