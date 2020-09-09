public class Novel extends Manga{

    private Double valorNovel;

    public Novel(String nome, String autor, Double valorNovel) {
        super(nome, autor);
        this.valorNovel = valorNovel;
    }

    @Override
    public Double CalcPreco() {
        return valorNovel;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "valor da Novel" + valorNovel +
                '}' + super.toString();
    }
}
