public class Aluno {
    String nome;
    String cpf;
    Data dataDeNascimento;
   
    String imprimir(){
       
        String imprimir = nome + "\n" + cpf + "\n" + dataDeNascimento;
        return imprimir;
    }
}