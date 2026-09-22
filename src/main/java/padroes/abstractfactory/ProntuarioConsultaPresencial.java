package padroes.abstractfactory;

public class ProntuarioConsultaPresencial implements Prontuario {

    @Override
    public String gerar() {
        return "Prontuário de consulta presencial";
    }
}
