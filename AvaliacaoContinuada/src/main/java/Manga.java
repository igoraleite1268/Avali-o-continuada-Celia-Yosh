public abstract class Manga {

    private String nome, autor;


    public Manga(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    public abstract Double CalcPreco();


    @Override
    public String toString() {
        return "nome '" + nome + '\'' +
                ", autor '" + autor + '\'' +
                '}';
    }
}
