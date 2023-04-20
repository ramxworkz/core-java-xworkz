class Netflix {

     static String[] kannadaMovies ={"Kali","Manithan","Pagal","Nila","Bet","Alien","Tusan","Gumiyo","Long Of Ballad","My Style","Uman","Narato","Baruki","KGF","A", };

     static String[] tamilMovies = {"Maaveeran","Mersal","Basha","Bahubali","Veeram","I","Ethir Neechal","MaanKarate","Remo","3","Kanthara","Muni","Kuruvi","Naan E","Iyan", };

   public static void main(String mxplayer[]){
      System.out.println("Main started");
          getKannadaMovies();
          getTamilMovies();
      System.out.println("Main ended");
   }

   public static void getKannadaMovies(){
      System.out.println("calling getkannadaMovies method");
       System.out.println("List of kannadaMovies:");

      for(int index=0;index<kannadaMovies.length;index++){
       System.out.println(kannadaMovies[index]);      
      System.out.println("end of getkannadaMovies method");
      }
      return ;
   }
   public static void getTamilMovies(){
     System.out.println("calling gettamilMovies");
       System.out.println("List of tamilMovies:");
     for(int index=0;index<tamilMovies.length;index++){
       System.out.println(tamilMovies[index]);
     System.out.println("end of gettamilMovies method");
     }
      return ;
   }
}