package padroes.abstractfactory;

public interface FabricaDocumentosMedicos {

    Prontuario criarProntuario();

    Receita criarReceita();
}
