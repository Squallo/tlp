package lezione11;

public class TestWithException {
 
   public static void main(String[] args) {
      try {
        for (int i= 0; i < 10; i++) {
           System.out.println("Argomento i-esimo(" + i + "): " + args[ i ]);
        }
      }
      catch(ArrayIndexOutOfBoundsException e ) {
         System.out.println("Si e' verificata l'eccezione");
      }
   }

}