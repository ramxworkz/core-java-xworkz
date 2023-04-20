class AirCooler{
        static boolean isConnected;
        static String name      ="";
        static double prize     =4700.00;
        static int maximumVolume=15;
        static int minimumVolume;
        static int currentVolume;

    public static void main(String ac[]){
       System.out.println("The Main Started");
        onOrOff();
        increaseVolume();
        increaseVolume();
        increaseVolume();
        increaseVolume();
        increaseVolume();
        onOrOff();
        increaseVolume();
       System.out.println("The Main Ended");
      }    
    public static boolean onOrOff(){
       System.out.println("onOrOff method started");
    //Condition statements
    //false == false
       if(isConnected == false)
       {
          isConnected = true;
          System.out.println("AirCooler is turned onn...");
       }
       else if(isConnected = true)
        {
          isConnected = false;
          System.out.println("AirCooler is turned off...");
        }              
        
        System.out.println("onOrOff method end");
        return isConnected;
	} 
     public static int increaseVolume(){
         System.out.println("increaseVolume method started");
        if(isConnected == true);
        {
          if(currentVolume<maxVolume){
            System.out.println("Current Volume is less than Maximum....proceed");
            currentVolume = currentVolume + 1;
            System.out.println("Current Volume is"+ currentVolume);           
           }
           else if
              {
              System.out.println("Max Volume reached....");
              }
           }
           else
              {
              System.out.println("first tirned on AirCooler");
              }
           System.out.println("increaseVolume method ended");
           return currentVolume;  
	 }     		 