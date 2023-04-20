class CreditCard  {

     static String[] CardNames ={"HDFC","State Bank","Axis","Canara ","IDFC","ICICI","American Express","Bank Of Baroda","AU Small Finance","Central Bank","Indusind Bank","RBL","YES Bank","Standard Chartered","HSBC", };

     public static void main(String mxplayer[]){
         System.out.println("Main started");
            getCardNames();
         System.out.println("Main ended");
     }

     public static void getCardNames(){
         System.out.println("calling getCardNames method");
         System.out.println("List of CardNames:");

         for(int index=0;index<CardNames.length;index++){
          System.out.println(CardNames[index]);      
         System.out.println("end of getCardNames method");
         }
         return ;
     }
  
 }