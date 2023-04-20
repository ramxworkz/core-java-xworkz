class Speaker{
        static boolean isConnected;
        static String name      ="Boat";
        static double prize     =3000.00;
        static int maximumVolume=8;
        static int minimumVolume;
        static int currentVolume;

    public static void main(String speaker[]){
       System.out.println("The Main Started");
       boolean connected = onOrOff();
       System.out.println("Speaker is Connected "+connected);
       boolean connected1 = onOrOff();
       System.out.println("Speaker is Connected "+connected);
       System.out.println("The Main Ended");
      }    
    public static boolean onOrOff(){
       System.out.println("onOrOff method started");
    //Condition statements
    //false == false
       if(isConnected == false)
       {
          isConnected = true;
          System.out.println("Speaker is turned onn...");
       }
       else if(isConnected = true)
        {
          isConnected = false;
          System.out.println("Speaker is turned off...");
        }              
        
        System.out.println("onOrOff method end");
        return isConnected;

      }
    
  }