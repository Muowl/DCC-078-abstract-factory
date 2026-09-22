package padroes.abstractfactory;

public class ReceitaConsultaPresencial implements Receita {

    @Override
    public String gerar() {
        return "Receita de consulta presencial";
    }
}
