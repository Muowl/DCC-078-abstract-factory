package padroes.abstractfactory;

public class FabricaTeleconsulta implements FabricaDocumentosMedicos {

    @Override
    public Prontuario criarProntuario() {
        return new ProntuarioTeleconsulta();
    }

    @Override
    public Receita criarReceita() {
        return new ReceitaTeleconsulta();
    }
}
