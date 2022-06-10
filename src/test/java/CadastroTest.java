import modelo.Candidato;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.Cadastro;

public class CadastroTest {
    Candidato candidato1 = new Candidato("João", 25,5, "Java", true);
    Candidato candidato2 = new Candidato("José", 32,1, "Java", true);
    Candidato candidato3 = new Candidato("Marcia", 25,5, "C#", true);
    Candidato candidato4 = new Candidato("Jorge", 18,5, "Java", true);
    @Test
    public void tempoExperienciaAtendeAVaga(){

        Assertions.assertEquals(Cadastro.validaCandidatoNaVaga(candidato1), "Aprovado");

    }
    @Test
    public void tempoExperienciaNaoAtendeAVaga(){

        Assertions.assertEquals(Cadastro.validaCandidatoNaVaga(candidato2), "Reprovado");

    }
    @Test
    public void tecnologiaObrigatoria(){

        Assertions.assertEquals(Cadastro.validaCandidatoNaVaga(candidato1), "Aprovado");

    }
    @Test
    public void naoTemTecnologiaObrigatoria(){

        Assertions.assertEquals(Cadastro.validaCandidatoNaVaga(candidato3), "Reprovado");

    }
    @Test
    public void terMaisDe18Anos(){

        Assertions.assertEquals(Cadastro.validaCandidatoNaVaga(candidato1), "Aprovado");

    }
    @Test
    public void NaotemMaisDe18Anos(){

        Assertions.assertEquals(Cadastro.validaCandidatoNaVaga(candidato4), "Reprovado");

    }
}
