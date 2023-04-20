class Supermarket {

     static String[] shampoo = {"Sunsilk","Dove","Clinic plush","Oclear","Karthiga","Clear","Meera","Head&Sholder","treesem","Chik","Garnier","Denver","Amway","Axe","Dabur", };

     static String[] chocolate = {"Cadbury ","Dairy milk","Nestle","Amul","Parle","Mars","Ferrero","Lotus","Campo","Kit Kat","Barbar","Munch","Milky bar","5star","Parel", };

     static String[] perfume = {"Signature","Axe","Fragrance","Embark","Forest Essentials","Sugandh","Aamod Luxury","Good Earth","Ajmal","Kanelle Jain","Maison de","Naso Profumi","Bombay Perfumery","All Good","Olfa Originals", };

     static String[] soaps = {"Mysore Sandal","Pears","Dove","Hamam","Medimix","Lifeboy","Cinthol","Dettol","Santor","Park Avenue","Lux","Myntra","Fiama","Bathing Bar","Yardly", };

     static String[] groceries = {"Toor dal","Round urad","Yellow moong","Chana dal","Split urad","Rajma","Peas","White chana","Green","Peanuts","GFried","Pottukadalai","Horsegram","Flax seeds","Pattani", };


     static String[] faceCream = {"Himalaya","Biotique","L'Oreal","Nivea","Kama Ayurveda","Innisfree","Aloe Soothing","Bobbi Brown","Lakme","Lotus Herbals","Pond's","Minimalist","Olay total","Glow","Garniger", };

       public static void main(String Supermarket[]){

        System.out.println("Size of Shampoo "+shampoo.length);

        for( int index=0; index<shampoo.length;index++){
        System.out.println(shampoo[index]);
        }

        System.out.println("Size of Chocolate "+chocolate.length);

        for( int index=0; index<chocolate.length;index++){
        System.out.println(chocolate[index]);
        }
 
        System.out.println("Size of Perfume "+perfume.length);

        for( int index=0; index<perfume.length;index++){
        System.out.println(perfume[index]);
        }

        System.out.println("Size of Soaps "+soaps.length);

        for( int index=0; index<soaps.length;index++){
        System.out.println(soaps[index]);
        }

        System.out.println("Size of Groceries "+groceries.length);

        for( int index=0; index<groceries.length;index++){
        System.out.println(groceries[index]);
        }

       System.out.println("Size of Facecream "+faceCream.length);

        for( int index=0; index<faceCream.length;index++){
        System.out.println(faceCream[index]);
        }         
     }

   }