/* 
Hector Lazzari 
Projeto 1
Lista de Exercícios JAVA Básico.
28-06-2023
*/
public class questao1{
    public static void main(String[] args){

        int idadeEmAnos = 10;
        int idadeEmMeses = 5;
        int idadeEmDias = 15;

        int somaDosAnos = idadeEmAnos * 365;
        int somaDosMeses = idadeEmMeses * 30;
        float somaTotalDaIdadeEmDIas = somaDosAnos + somaDosMeses + idadeEmDias;

        System.out.println(idadeEmAnos+" anos, "+idadeEmMeses+" meses, "+idadeEmDias+" dias = "+somaTotalDaIdadeEmDIas+" dias.");

        //Questão 3
        System.out.println("\r\nO valor do saldo é R$4.515,80. Terá um reajuste de 1%.");
        double salario = 4515.00;
        double porcentagemSalario = salario * 1/100;
        double reajusteSalarial = salario + porcentagemSalario;

        System.out.println("Após o reajuste o salário atual é de: "+reajusteSalarial);
    }
}
