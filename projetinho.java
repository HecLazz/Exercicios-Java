/* 
Hector Lazzari 
Projeto 1
Lista de Exercícios JAVA Básico.
28-06-2023
*/
public class projetinho{
    public static void main(String[] args){

        // Questão 1
        int idadeEmAnos = 10;
        int idadeEmMeses = 5;
        int idadeEmDias = 15;

        int somaDosAnos = idadeEmAnos * 365;
        int somaDosMeses = idadeEmMeses * 30;
        float somaTotalDaIdadeEmDIas = somaDosAnos + somaDosMeses + idadeEmDias;

        System.out.println(idadeEmAnos+" anos, "+idadeEmMeses+" meses, "+idadeEmDias+" dias = "+somaTotalDaIdadeEmDIas+" dias.");

        // Questão 2
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

        //Questão 3
        System.out.println("\r\nO valor do saldo é R$4.515,80. Terá um reajuste de 1%.");
        double salario = 4515.00;
        double porcentagemSalario = salario * 1/100;
        double reajusteSalarial = salario + porcentagemSalario;

        System.out.println("Após o reajuste o salário atual é de: "+reajusteSalarial);
    }
}
