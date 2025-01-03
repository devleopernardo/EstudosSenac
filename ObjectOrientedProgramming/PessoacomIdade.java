public class PessoacomIdade {

    private String nome;
    private int idade;

    // construtor
    public PessoacomIdade(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    // Metodo Setter (para definir e modificar o atributo)

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        if (idade >= 100) {

            System.out.println("Voce tem muito o que contar!");
        } else {

            System.out.println("Voce ainda pode viver muito!");
        }
    }

    // Metodo Getter mostrar

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Metodo main
    public static void main(String[] args) {
        // instanciando Objeto

        PessoacomIdade asiatica = new PessoacomIdade("leo", 54);
        asiatica.setNome("Totoro");
        asiatica.setIdade(110);

        System.out.println("O Nome do Chines: " + asiatica.getNome() + " and age of " + asiatica.getIdade());

    }
}