public class questao3{
  public static void main(String[] args){
        System.out.println("\r\nO valor do saldo é R$4.515,80. Terá um reajuste de 1%.");
        double salario = 4515.00;
        double porcentagemSalario = salario * 1/100;
        double reajusteSalarial = salario + porcentagemSalario;

        System.out.println("Após o reajuste o salário atual é de: "+reajusteSalarial);
  }
}
