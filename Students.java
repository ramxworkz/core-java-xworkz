class Students{
 public static void main(String[] agrs){   
  String[] pName ={"Ram","Kumar","Raj","Vicky","Raja","Karan","Siva","Bala","Kali",};
   
      for(int index=0;1<pName.length;index++){
        System.out.println(pName[index]);
      if(pName[index].equals("Siva")&pName[index].equals("Bala")){
        System.out.println("name is found "+pName[index]);
        break;
      }
      else{
        System.out.println("name is not found");    
      }
    }
  }    

}