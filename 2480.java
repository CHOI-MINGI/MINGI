import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int d1,d2,d3;
        int value = 0;
        Scanner s = new Scanner(System.in);
        d1 = s.nextInt();
        d2 = s.nextInt();
        d3 = s.nextInt();
        
            if (d1 == d2 && d2 == d3) {
                value = 10000 + (d1*1000); 
            }
            else if (d1 == d2 || d1 == d3 || d2 == d3) {
                value = 1000 + ((d1==d2) ? d1 : (d2==d3) ? d2:d3)*100;
            }
            

            else value = Math.max(d1,Math.max(d2,d3))*100;
            
            System.out.print(value);
            }
        }
        