public class Aluno {
    private String nome;
    private String cpf;
    private Data dataDeNascimento;
   
    public String getImprimir(){
       
        String imprimir = nome + "\n" + cpf + "\n" + dataDeNascimento;
        return imprimir;
    }
}