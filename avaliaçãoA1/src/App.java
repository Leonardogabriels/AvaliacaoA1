import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("informe a placa do veículo: ");
        String placa = teclado.nextLine();
        System.out.println();

        System.out.print("informe o valor do litro de combustível: ");
        double valorLitro = teclado.nextDouble();
        System.out.println();

        System.out.print("informe a quantidade de quilometros rodados a 60KM/H: ");
        double quantidade60 = teclado.nextDouble();
        System.out.println();

        System.out.print("informe a quantidade de quilometros rodados a 80KM/H: ");
        double quantidade80 = teclado.nextDouble();
        System.out.println();

        System.out.print("informe a quantidade de quilometros rodados a 100KM/H: ");
        double quantidade100 = teclado.nextDouble();
        System.out.println();

        System.out.print("informe a quantidade de quilometros rodados a 120KM/H: ");
        double quantidade120 = teclado.nextDouble();
        System.out.println();
   
        System.out.print("informe a quantidade de quilometros rodados a 140KM/H: ");
        double quantidade140 = teclado.nextDouble();
        System.out.println();
        teclado.close();

        double litros60km = quantidade60/ 30.7;
        double litros80km = quantidade80 / 26.8;
        double litros100km = quantidade100 / 22.4;
        double litros120km = quantidade120 / 18.1;
        double litros140km = quantidade140 / 14.5;
        double combustivelTotal = litros60km + litros80km + litros100km + litros120km + litros140km;
        double mediaPonderada = (quantidade60 * 60) + (quantidade80 * 80) + (quantidade100 * 100) + (quantidade120 * 120) + (quantidade140 * 140) / (quantidade60 + quantidade80 + quantidade100 + quantidade120 + quantidade140);
        double custoViagem = combustivelTotal * valorLitro;
        
        System.out.println("placa do veículo : " + placa);
        System.out.println("consumo total de combustível" + combustivelTotal + " Litros");
        System.out.println("consumo total desta viagem R$: " + custoViagem);
        System.out.println("velocidade média ponderada: " + mediaPonderada + " KM/H");
        

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }

}
