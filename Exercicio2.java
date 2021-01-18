import java.util.Scanner;

public class Exercicio2 {
	
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int idadeDias = leitor.nextInt();
        int anos = idadeDias / 365;
        int meses = (idadeDias - (anos * 365)) / 30;
        int dias = idadeDias - ((meses * 30) + (anos * 365));
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
	
}