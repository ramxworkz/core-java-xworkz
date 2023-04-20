class  College {

     static String[] DepartmentName ={"CSE","ECE","EEE","MECH","CIVIL","IT","AERONATICAL","Bsci","Mis","CIS","IDS","ECON","IS","A&MIS","", };

     public static void main(String mxplayer[]){
         System.out.println("Main started");
            getDepartmentName();
         System.out.println("Main ended");
     }

     public static void getDepartmentName(){
         System.out.println("calling getDepartmentName method");
         System.out.println("List of DepartmentName:");

         for(int index=0;index<DepartmentName.length;index++){
          System.out.println(DepartmentName[index]);      
         System.out.println("end of getDepartmentName method");
         }
         return ;
     }
  
 }