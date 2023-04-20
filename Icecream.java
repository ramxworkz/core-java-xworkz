class  Icecream {

     static String[] Brands ={"Amul","Kwality Walls","Baskin Robbins","Havmor","Dinshaws","Strawbery","Vinnela","Chocobar","Cone","Mother Dairy","Vadilal","Creambell","Top'N Town","Butter Scotch","Kulfi", };

     public static void main(String mxplayer[]){
         System.out.println("Main started");
            getBrands();
         System.out.println("Main ended");
     }

     public static void getBrands(){
         System.out.println("calling getBrands method");
         System.out.println("List of Brands:");

         for(int index=0;index<Brands.length;index++){
          System.out.println(Brands[index]);      
         System.out.println("end of getBrands method");
         }
         return ;
     }
  
 }