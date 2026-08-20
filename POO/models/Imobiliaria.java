public class Imobiliaria {
    private Pessoa proprietario;
    private Endereco endereco;
    private Imoveis[] imoveis;

    public Pessoa getProprietario() {
        return proprietario;
    }
    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Imoveis[] getImoveis() {
        return imoveis;
    }
    public void setImoveis(Imoveis[] imoveis) {
        this.imoveis = imoveis;
    }
}
