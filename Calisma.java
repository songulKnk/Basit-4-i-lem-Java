import java.util.Scanner;
public class Calisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		int islem =0, sayi1,sayi2;
		
		
		do {
			
			System.out.print("\nHesaplanacak i�lemi girin(��k�� i�in -1 yaz�n) : " +"\n");
			
			sayi1=input.nextInt();
			
			if(sayi1!=-1)
			{
				
				String islemYap= input.next();
				
				sayi2=input.nextInt();
				
			
			switch(islemYap) {
			
		     case "+" : 
				islem=sayi1+sayi2;
				break;
			 case "-" : 
				 islem=sayi1-sayi2;
				break;
			 case "*" : 
				 islem=sayi1*sayi2;
				break;
			 case "/" : 
				 islem=sayi1/sayi2;
				break;
			 case "%" : 
				 islem=sayi1%sayi2;
				break;
			
				
		}	
			
			System.out.println("\n��lem sonucu: " + sayi1 + islemYap + sayi2 + "=" + islem);
			
			}
			
		}
			
		
		while(  sayi1!= -1);
		System.out.println("G�le g�le..");
		
}
}