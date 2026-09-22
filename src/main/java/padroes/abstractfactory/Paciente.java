package padroes.abstractfactory;

public class Paciente {

    private final Prontuario prontuario;
    private final Receita receita;

    public Paciente(FabricaDocumentosMedicos fabrica) {
        this.prontuario = fabrica.criarProntuario();
        this.receita = fabrica.criarReceita();
    }

    public String obterProntuario() {
        return this.prontuario.gerar();
    }

    public String obterReceita() {
        return this.receita.gerar();
    }
}
