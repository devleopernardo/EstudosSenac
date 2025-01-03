public class Atleta {
    String nome;
    int idade;

    public Atleta(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public static void main(String[] args) {
        Atleta nadador = new Atleta("Leo",26);
    System.out.println("Nome: " + nadador.getNome());
    System.out.println("Idade: " + nadador.getIdade());
}
}
    

