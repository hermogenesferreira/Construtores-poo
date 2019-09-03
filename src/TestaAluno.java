public class TestaAluno {
   
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.nome = "Teste";
        a1.cpf = "000";
       
        Data d1 = new Data();
        d1.dia = 28;
        d1.mes = 8;
        d1.ano = 2019;
       
        a1.dataDeNascimento = d1;
        
        System.out.println(a1.imprimir());
    }
}
