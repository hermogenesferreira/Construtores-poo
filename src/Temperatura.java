public class Temperatura {
    double converterParaCelsius(double valor){
        System.out.println((valor-32)/1.8); 
        return valor;
     }
    double converterParaFarenheit(double valor){
        System.out.println((valor*1.8)+32);
        return valor;
    }
}
