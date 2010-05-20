package lezione11;

 
public class Rethrowing {
 
  public static void f() throws Exception {
    System.out.println("originating the exception in f()");
    throw new Exception("thrown from f()");
  }
  public static void g() throws Throwable {
    try {
      f();
    } catch(Exception e) {
      System.err.println("Inside g(),e.printStackTrace()");
      e.printStackTrace();
      throw e;
    }
  }
  public static void main(String[] args) throws Throwable {
    try {
      g();
      System.out.println("Sono dopo g()");
    } catch(Exception e) {
      System.err.println(
        "Caught in main, e.printStackTrace()");
      e.printStackTrace();
    }
   
  }
}  
