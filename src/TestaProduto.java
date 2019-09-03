public class TestaProduto {
    public static void main(String[] args){
        Produto p1 = new Produto();
        p1.preço = 100;
        
        p1.aumenta25();
        System.out.println(p1.preço);
        
        p1.diminuir10();
        System.out.println(p1.preço);
    }
}
