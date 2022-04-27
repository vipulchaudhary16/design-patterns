package Behavioral.iterator;

public class Demo {
	
   public static void main(String[] args) {

      NameCollection namesRepository = new NameCollection();

      for(Iterator iter = namesRepository.getIterator() ; iter.hasNext();){
         String name = (String) iter.next();
         System.out.println("Data : " + name);
         Hack.hack();
      }
   }
}