package soalPertama;
public class Nomor1 {
    public static void main(String[] args) throws Exception {
        
        //
		//Output : 10 9 8 7 6 5 4 3 2 1
		
		for(int i = 10; i>0; i--) {
			System.out.print(i + " ");
		}
		
		//Output : 1 3 5 7 9 11 13 15 17 19
		System.out.println();
		for(int i = 1; i<20; i++) {
			if(i%2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//Output : 2 4 6 8 10 12 14 16 18
		
		for(int i = 1; i<20; i++) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//Output : 1 -2 3 -4 5 -6 7 -8 9 -10
		
		for(int i = 1; i<11; i++) {
			int j = i;
			if(i%2 == 0) {
				j = i*(-1); 
			}
			System.out.print(j + " ");
			}
		
		
		System.out.println();
		//Output : 11 2 13 4 15 6 17 8 19 10
		
		for(int i = 1; i<11; i++) {
			int j = i;
			if(i%2 != 0) {
				j = i+10;
			}
			System.out.print(j + " ");
		}
		
		System.out.println();
		//Output : 1 10 2 9 3 8 4 7 5 6
		
		int k = 1;
		int l = 10;
		for(int i = 1; i<11; i++) {
				if(i%2 == 0) {
					System.out.print(l-- + " ");
				}
				else if(i%2 != 0) {
					System.out.print(k++ + " ");
				}
			
		}
		
		System.out.println();
		//Output : 00000111112222223333344444
		int n = 0; 
		for(int i = 0; i<=25; i++) {
			if(i>=0 && i<=4) {
				n = 0;
			}
			else if(i>=5 && i<=9) {
				n = 1;
			}
			else if(i>=10 && i<=14) {
				n = 2;
			}
			else if(i>=15 && i<=19) {
				n = 3;
			}
			else if(i>=20 && i<=25) {
				n = 4;
			}
			System.out.print(n);
		}
		

    }
}
