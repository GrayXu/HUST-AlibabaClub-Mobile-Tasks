public class Main {  
    public static void main(String[] args) {  
        int a = 1, b = 1, c = 0;  
        System.out.print(a + "\n" + b + "\n");  
        for (int i = 1; i <= 23; i++) {  
            c = a + b;  
            a = b;  
            b = c;  
            System.out.print(c + "\n");  
            
        }  
    }  
  
}  