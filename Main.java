import java.util.Scanner;
public class Main{
    public void main(String[] agrs)
{
    Calculator cal= new Calculator();
    
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number: ");
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c;
    
    System.out.print("enter the character: + - * / %");
    char operater = sc.next().charAt(0);
    
    switch(operater){
        case '+':
            c=cal.addition(a, b);
            System.out.print("" + c);
            break;
            
        case '-':
            System.out.print("" + c);
            break;
        
        case '*':
            System.out.print("" +c);
            break;
            
        case '/':
            System.out.print("" +c);
            break;
            
        case '%':
            System.out.print("" +c);
            break;
        
        default :
        System.out.print("enter legal character");
        break;
          
    }
    
        
    
}
    
}

