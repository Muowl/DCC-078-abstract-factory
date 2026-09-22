package padroes.abstractfactory;

public class ProntuarioTeleconsulta implements Prontuario {

    @Override
    public String gerar() {
        return "Prontuário de teleconsulta";
    }
}
