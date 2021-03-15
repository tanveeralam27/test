import java.util.Scanner;
public class Exp {
	public static void main(String args[]) {
		System.out.print("enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Exp expa = new Exp();
		expa.func(n);
		
		
	}

void func(int n){
	if(n==0){
		System.out.println(n);
	}
	else{
		System.out.println(n);
		n=n-1;
		func(n);
	}


}
}

