class Hospital {

     static String[] DoctorsName ={"Ramkumar","Shaj","Subramani","Dinesh","Ajai","Viswanathan","Pradesh","Karthik","Manoj","Ranjith","Harish","Narashiman","Bala","Sanjai","Darwin", };

     public static void main(String doctor[]){
         System.out.println("Main started");
            getDoctorsName();
         System.out.println("Main ended");
     }

     public static void getDoctorsName(){
         System.out.println("calling getDoctorsName method");
         System.out.println("List of DoctorsName:");

         for(int index=0;index<DoctorsName.length;index++){
          System.out.println(DoctorsName[index]);      
         System.out.println("end of getDoctorsName method");
         }
         return ;
     }
  
 }