public class questao2{
   public static void main(String[] args){

        System.out.println("\r\nMédia aritmética: Ma1 = {8, 9, 7}, Ma2 ={4, 5, 6}.");
        System.out.println("Cálculo da média: somar os números e dividir pela quantidade de número na lista.");

        int primeiraLista = 8 + 9 + 7;
        float primeiraMedia = primeiraLista / 3;
        System.out.println("A média de Ma1 = {8, 9, 7} é: "+primeiraMedia);

        int segundaLista = 4 + 5 + 6;
        float segundaMedia = segundaLista / 3;
        System.out.println("A média de Ma2 = {4, 5, 6} é: "+segundaMedia);

        float somaDasDuasMedias = primeiraMedia + segundaMedia;
        System.out.println("A soma das duas médias: "+somaDasDuasMedias);

        float mediaDasDuasMedias = somaDasDuasMedias / 2;
        System.out.println("A média das médias: "+mediaDasDuasMedias);
