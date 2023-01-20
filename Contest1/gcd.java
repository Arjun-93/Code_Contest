public class gcd {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int gc = find_GCD(a, b);
        int lcm = find_LCM(a, b);
        System.out.println("HCF of a and b is: "+gc);
        System.out.println("LCM of a and b is: "+lcm);
    }

    public static int find_GCD(int a, int b){
        if (b == 0)
          return a;
        return find_GCD(b, a % b);
      }
  
      public static int find_LCM(int a, int b){
          // LCM(a,b) = a*b/(gcd(a,b))
          int lcm = (a*b)/find_GCD(a, b);
          return lcm;
      }
}
