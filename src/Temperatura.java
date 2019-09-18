public class Temperatura {
    public double setConverterParaCelsius(double valor){
        System.out.println((valor-32)/1.8); 
        return valor;
     }
    public double setConverterParaFarenheit(double valor){
        System.out.println((valor*1.8)+32);
        return valor;
    }
}
