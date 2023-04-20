class  TouristPlace {

     static String[] PlaceName ={"Ooty","Goa","Taj Mahal","Mysore Palace","Kodaikanal","Madikeri","Puducherry","Jaipur","Udaipur","Mumbai","Sri Harmandir Sahib","Wayanad","Alappuzha","Varanasi","Eiffel Tower", };

     public static void main(String mxplayer[]){
         System.out.println("Main started");
            getPlaceName();
         System.out.println("Main ended");
     }

     public static void getPlaceName(){
         System.out.println("calling getPlaceName method");
         System.out.println("List of PlaceName:");

         for(int index=0;index<PlaceName.length;index++){
          System.out.println(PlaceName[index]);      
         System.out.println("end of getPlaceName method");
         }
         return ;
     }
  
 }