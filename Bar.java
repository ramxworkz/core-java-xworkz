class Bar {

     static String[] alcohol = {"Royal stage","Black label","Black&White","100 piper's","Tuborg","Kingfisher","Xo","Magic Momemnt","Bacadi","Votka","Monitor","Old Monk","Black Dog","Bira","Bro code", };

       public static void main(String bar[]){

         System.out.println("List of brands available :");

         System.out.println("1:" + alcohol[0] + "\n" + "2:" + alcohol[1] + "\n" + "3:" + alcohol[2] + "\n" + "4:" + alcohol[3] + "\n" + "5:" + alcohol[4] + "\n" + "6:" + alcohol[5] + "\n" + "7:" + alcohol[6] + "\n" + "8:" + alcohol[7] + "\n" + "9:" + alcohol[8] + "\n" + "10:" + alcohol[9] + "\n");
 
        System.out.println("List of brands available :");

        for( int index=0; index<alcohol.length;index++){

        System.out.println(alcohol[index]);

        }           

     }


}