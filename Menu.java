import java.util.Scanner;

public class Menu {

    public static String symbol;
    public static int line; 

    public static void PrintPyramid(){
        Scanner sc=new Scanner(System.in);
        Menu m = new Menu();
        System.out.println("Entrer le Symbol");
        m.symbol=sc.nextLine();
        System.out.println("=================================");
        System.out.println("Entrer le Nombre des line Entre 8 à 35 ");
        m.line=sc.nextInt();
        
        while(m.line<8 || m.line>35){
            System.out.println("Entrer Un Nombre dans l'interval de 8 à 35 ");
            m.line=sc.nextInt();
            
        }
        sc.close();
        Logic.logic();     
    }

    public static void PrintPyv2(){

    }
}