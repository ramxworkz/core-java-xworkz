class MncCompany {

     static String[] CompanyName ={"Microsoft","Apple","LIT","deloitte","Coca Cola","TCS","Accenture","IBM","Capgemini","Adidas", };

     public static void main(String Company[]){
         System.out.println("Main started");
            getCompanyName();
         System.out.println("Main ended");
     }

     public static void getCompanyName(){
         System.out.println("calling getCompanyName method");
         System.out.println("List of CompanyName:");

         for(int index=0;index<CompanyName.length;index++){
          System.out.println(CompanyName[index]);      
         System.out.println("end of getCompanyName method");
         }
         return ;
     }
  
 }