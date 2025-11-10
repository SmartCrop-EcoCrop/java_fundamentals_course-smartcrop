public class Leccion6 {
    public static int factorial(int n){
        int guard = 1;
        for(int i = 0; i<n; i++){
            guard *=(n-i);
            
        }
        
        return guard;
        
    }
  public static void main(String args[]) {
     int n = 3;
     int resultado = factorial(n);
     int s = 5;
     int resultado2 = factorial(s);
    System.out.println("El pacorial de " + n + " Es: " + resultado);
     System.out.println("El pacorial de " + s + " Es: " + resultado2);
  }
}
