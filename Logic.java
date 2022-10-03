import java.util.ArrayList;

public class Logic {

        public static void logic(){
        // for(int k=1; k<=Menu.line ; k++){
        //     for(int i=1; i<=Menu.line-k;i++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<2*k-1 ; j++){
        //         System.out.printf("%s",Menu.symbol);
        //     }
        //     System.out.println("");
        // }

            // ===========================================// 

        ArrayList<String> arr = new ArrayList<String>();
            String spaces = "";
            String symbl="";

        for(int k=1; k<=Menu.line ; k++){
            for(int i=1;i<=Menu.line-k;i++){
                spaces+=" ";
            }
            for(int j=0;j<2*k-1;j++){
                symbl+=Menu.symbol.charAt(0);
            }
            arr.add(spaces.concat(symbl));
            
            spaces="";
            symbl="";
        }
        arr.forEach( (n) -> { System.out.println(n); } );
             
    }


    
        public static void logicTwo(){
            
        }
}
