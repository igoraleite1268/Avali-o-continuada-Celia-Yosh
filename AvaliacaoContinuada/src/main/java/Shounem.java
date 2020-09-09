    public class Shounem extends Manga {

    private Integer QtdVendido;
    private Double ValorPCat;

        public Shounem(String nome, String autor, Integer qtdVendido, Double valorPCat) {
            super(nome, autor);
            QtdVendido = qtdVendido;
            ValorPCat = valorPCat;
        }

        @Override
        public Double CalcPreco() {
            return ValorPCat * QtdVendido;
        }


        @Override
        public String toString() {
            return "Shounem{" +
                    "quantidade Vendido no mes" + QtdVendido +
                    ", Valor por capitulo" + ValorPCat +
                    ", capital gerado por mes" + CalcPreco() +
                    '}' + super.toString();
        }
    }
