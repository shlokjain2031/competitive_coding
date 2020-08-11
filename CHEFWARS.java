import java.util.Scanner; 

class CHEFWARS {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int t = myObj.nextInt();

    for(int i=0;i<t;i++) {
      int health = myObj.nextInt(); // 10
      int power = myObj.nextInt(); // 4
      int calc = power; // calc = 4
      while(power != 0) {
        power = power/2; // power = 2, 1, 0
        calc += power; // calc = 6, 7, 7
      }
    
      if(calc>=health) {
        System.out.println(1);
      }
      else {
        System.out.println(0);
      }
    }
  }
}