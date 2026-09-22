package padroes.abstractfactory;

public class FabricaConsultaPresencial implements FabricaDocumentosMedicos {

    @Override
    public Prontuario criarProntuario() {
        return new ProntuarioConsultaPresencial();
    }

    @Override
    public Receita criarReceita() {
        return new ReceitaConsultaPresencial();
    }
}
