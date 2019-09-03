public class Pessoa {
    String nome;
    int idade;
    
    void fazAniversario(){
        int aniversario = this.idade+1;
        this.idade = aniversario;
    }
    
    void imprimir(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
    }

}
