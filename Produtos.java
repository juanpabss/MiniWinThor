public class Produtos {
    private int codigo;
    private String descricao;
    private double precoDaCompra;
    private double precoDaVenda;
    private boolean status;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoDaCompra() {
        return precoDaCompra;
    }

    public void setPrecoDaCompra(double precoDaCompra) {
        this.precoDaCompra = precoDaCompra;
    }

    public double getPrecoDaVenda() {
        return precoDaVenda;
    }

    public void setPrecoDaVenda(double precoDaVenda) {
        this.precoDaVenda = precoDaVenda;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
