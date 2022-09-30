public class Logic {

        public static void logic(){
        for(int k=1; k<=Menu.line ; k++){
            for(int i=1; i<=Menu.line-k;i++){
                System.out.print(" ");
            }
            for(int j=0;j<2*k-1 ; j++){
                System.out.printf("%s",Menu.symbol);
            }
            System.out.println("");
        }
    }

        public static void logicTwo(){
            for(int k=1; k<=Menu.line ; k++){
                for(int i=1; i<=Menu.line-k;i++){
                    System.out.print(" ");
                }
                for(int j=0;j<2*k-1 ; j++){
                    System.out.printf("%s",Menu.symbol);
                }
                System.out.println("");
            }
        }
}
