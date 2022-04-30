package ejercicio3;

/**
 *
 * @author Lusvin
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int pesoCamion1 = 0;
        int pesoCamion2 = 0;
        
//        int numVacas1 = 8;
//        int numVacas2 = 10;
        
        int pesoVaca1[] = new int[]{223,243,100,200,200,155,300,150};
        int lecheVaca1[] =new int[]{30,34,28,45,31,50,29,1};
        
        
        
        int pesoVaca2[] = new int[]{340,355,223,243,130,240,260,155,302,130};
        int lecheVaca2[] = new int[]{45,50,34,39,29,40,30,52,31,1};
        
        int totalLeche = 0;
        int totalLeche2 = 0;
        
        
        //para las vacas del grupo numero 1
        for (int i = 0; i < pesoVaca1.length; i++) {
            for (int j = 0; j < pesoVaca1.length-1; j++) {
                if (pesoVaca1[j]>pesoVaca1[j+1]) {
                    int temp = pesoVaca1[j];
                    pesoVaca1[j] = pesoVaca1[j+1];
                    pesoVaca1[j+1]= temp;
                    
                    int lechita = lecheVaca1[j];
                    lecheVaca1[j]= lecheVaca1[j+1];
                    lecheVaca1[j+1]=lechita;
     
                }
               
            }
        }
        
        for (int i = 0; i < pesoVaca1.length; i++) {
            System.out.println("Peso Vaca : "+pesoVaca1[i]+"\t leche: "+ lecheVaca1[i]);
        }
        System.out.println("------------Vacas seleccionadas para exportación en camion 1:---------");
        int pos = pesoVaca1.length-1;
        while (pesoCamion1<1000){
           
                System.out.println("Peso Vaca : "+pesoVaca1[pos]+"\t leche: "+ lecheVaca1[pos]);
                
                pos--;
                pesoCamion1 = pesoCamion1+pesoVaca1[pos];
                totalLeche = totalLeche+lecheVaca1[pos];           
        }
        
        System.out.println("\t \t \t Total de litros es:  "+ totalLeche);
        System.out.println("____________________________________________________________________________________________________");
       
        

//para las vacas del grupo numero 2
        for (int i = 0; i < pesoVaca2.length; i++) {
            for (int j = 0; j < pesoVaca2.length-1; j++) {
                if (pesoVaca2[j]>pesoVaca2[j+1]) {
                    int temp = pesoVaca2[j];
                    pesoVaca2[j] = pesoVaca2[j+1];
                    pesoVaca2[j+1]= temp;
                    
                    int lechita = lecheVaca2[j];
                    lecheVaca2[j]= lecheVaca2[j+1];
                    lecheVaca2[j+1]=lechita;
     
                }
               
            }
        }
        
        for (int i = 0; i < pesoVaca2.length; i++) {
            System.out.println("Peso Vaca : "+pesoVaca2[i]+"\t leche: "+ lecheVaca2[i]);
        }
        System.out.println("------------Vacas seleccionadas para exportación en camion 2:---------");
        int pos2 = pesoVaca2.length-1;
        while (pesoCamion2<2000){
           
                System.out.println("Peso Vaca : "+pesoVaca2[pos2]+"\t leche: "+ lecheVaca2[pos2]);
                
                pos2--;
                pesoCamion2 = pesoCamion2+pesoVaca2[pos2];
                totalLeche2 = totalLeche+lecheVaca2[pos2];           
        }
        
        System.out.println("\t \t \t Total de litros es:  "+ totalLeche2);
        
        
        
        
        
        
        
        
        
   
        
        
    }
    
}
