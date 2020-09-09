public class weebton extends Manga{

    private Integer QtdPagina;
    private Double valorPPagina;

    public weebton(String nome, String autor, Integer qtdPagina, Double valorPPagina) {
        super(nome, autor);
        QtdPagina = qtdPagina;
        this.valorPPagina = valorPPagina;
    }

    @Override
    public Double CalcPreco() {
        return valorPPagina * QtdPagina;
    }

    @Override
    public String toString() {
        return "weebton{" +
                "Quantidade de Paginas " + QtdPagina +
                ", valor Por Pagina " + valorPPagina +
                ", valor da weebton" + CalcPreco() +
                '}' + super.toString();
    }
}
