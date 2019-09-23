public class TestaAluno {
   
    public static void main(String[] args){
        Aluno a1 = new Aluno("Teste", "000.000.000-00");
     
        Data d1 = new Data(28,8,2019);
        
        a1.setData(d1);
        
        System.out.println(a1.getImprimir());
    }
}
