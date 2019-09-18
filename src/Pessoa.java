public class Pessoa {
    private String nome;
    private int idade;
    
    public void getFazAniversario(){
        int aniversario = this.idade+1;
        this.idade = aniversario;
    }
    
    public void getImprimir(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
    }

}
