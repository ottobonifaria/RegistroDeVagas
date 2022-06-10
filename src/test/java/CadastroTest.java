import modelo.Candidato;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.Cadastro;

public class CadastroTest {
    Candidato candidato = new Candidato("João", 25,5, "Java", true);
    @Test
    public void tempoExperienciaAtendeAVaga(){

        Assertions.assertTrue(Cadastro.validaCandidatoNaVaga(candidato), String.valueOf(true));

    }
    @Test
    public void tecnologiaObrigatoria(){

        Assertions.assertTrue(Cadastro.validaCandidatoNaVaga(candidato), String.valueOf(true));

    }
    @Test
    public void terMaisDe18Anos(){

        Assertions.assertTrue(Cadastro.validaCandidatoNaVaga(candidato), String.valueOf(true));

    }
}
