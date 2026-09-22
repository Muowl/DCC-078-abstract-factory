package padroes.abstractfactory;

public class ReceitaTeleconsulta implements Receita {

    @Override
    public String gerar() {
        return "Receita de teleconsulta";
    }
}
