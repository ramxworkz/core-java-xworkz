class StaticVariable{
       static String personName       = "Ram";
       static int    age              = 30; 
       static long   phoneNumber      = 8735462734L;
       static char   gender           = 'M';
       static long   aadharNumber     = 356980282133L;

   public static void main(String person[]){

         personName   = "Ram";
         age          = 30;
         phoneNumber  = 8735462734L;
         gender       = 'M';
         aadharNumber = 356980282133L;

        System.out.println("Person Name is "+personName);
        System.out.println("Person Age is "+age);
        System.out.println("Person Phonenumber is "+phoneNumber);
        System.out.println("Person Gender is "+gender);
        System.out.println("Person Aadharnumber is "+aadharNumber); 
 

     }

 }
