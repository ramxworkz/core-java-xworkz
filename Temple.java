class  Temple {

     static String[] GodsName ={"Lord Shiva","Ganapathy","Murugan","Lord Vishnu","Parvathi","Lakshmi","Sarasvathi","Hanuman","Krishna","Ramar","Sai Baba","Amman","Munishwaran","Karupparayan","Maariyamman", };

     public static void main(String mxplayer[]){
         System.out.println("Main started");
            getGodsName();
         System.out.println("Main ended");
     }

     public static void getGodsName(){
         System.out.println("calling getGodsName method");
         System.out.println("List of GodsName:");

         for(int index=0;index<GodsName.length;index++){
          System.out.println(GodsName[index]);      
         System.out.println("end of getGodsName method");
         }
         return ;
     }
  
 }