package padroes.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PacienteTest {

    @Test
    void deveGerarProntuarioDeConsultaPresencial() {
        FabricaDocumentosMedicos fabrica = new FabricaConsultaPresencial();
        Paciente paciente = new Paciente(fabrica);

        assertEquals("Prontuário de consulta presencial", paciente.obterProntuario());
    }

    @Test
    void deveGerarReceitaDeConsultaPresencial() {
        FabricaDocumentosMedicos fabrica = new FabricaConsultaPresencial();
        Paciente paciente = new Paciente(fabrica);

        assertEquals("Receita de consulta presencial", paciente.obterReceita());
    }

    @Test
    void deveGerarProntuarioDeTeleconsulta() {
        FabricaDocumentosMedicos fabrica = new FabricaTeleconsulta();
        Paciente paciente = new Paciente(fabrica);

        assertEquals("Prontuário de teleconsulta", paciente.obterProntuario());
    }

    @Test
    void deveGerarReceitaDeTeleconsulta() {
        FabricaDocumentosMedicos fabrica = new FabricaTeleconsulta();
        Paciente paciente = new Paciente(fabrica);

        assertEquals("Receita de teleconsulta", paciente.obterReceita());
    }
}
