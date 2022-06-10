package service;

import modelo.Candidato;
import modelo.Vaga;

public class Cadastro {

    public static String validaCandidatoNaVaga(Candidato candidato) {

        Vaga vaga = new Vaga("Programador","Programador Java", "São Paulo", 5,
                "Java", "SQL",true, "Assitencia medica");

        if( candidato.getTempoExp() >= vaga.getTempoExperiencia()
                && candidato.getTecnologias().equals(vaga.getTecnologiaObrigatorias())
                && candidato.getIdade() > 18){
            return "Aprovado";
        }else {
            return "Reprovado";
        }
    }
}
