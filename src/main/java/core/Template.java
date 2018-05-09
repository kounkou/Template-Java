import java.util.Date;

public class Template {
   public Template(String name) {
      _name = name;
   }

   public String sayHello() {

      int [][][] nums = new int [10][10][10];
      nums[0][1][0] = 1;
      System.out.println("num[0][1][0] : " + nums[0][1][0]);
      Date now = new Date();
      System.out.println("Hello        : " + now);

      return "Hello, " + _name + "!";
   }

   private String _name;
}
