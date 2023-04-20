class Pub {

     static String[] PubName ={"Crave Ale Brewery","Purv Disha","One rising in the east","Sun ","A lady lost","Billy goat tavern","Refined Mixers","Vineyard Harvest","Morning Ale","Night Rock","Tipsy Sand Bar","Blarney Cove","Irish Beatnik","Night Natives","Hotspot Winery", };

     public static void main(String Pub[]){
         System.out.println("Main started");
            getPubName();
         System.out.println("Main ended");
     }

     public static void getPubName(){
         System.out.println("calling getPubName method");
         System.out.println("List of PubName:");

         for(int index=0;index<PubName.length;index++){
          System.out.println(PubName[index]);      
         System.out.println("end of getPubName method");
         }
         return ;
     }
  
 }