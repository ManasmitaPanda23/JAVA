package Assignment;

public class Prime {

	int i=2;
	int j;

	void calculate() {
		for ( j = 2; j <= 100; j++) {
			i=2;
			while(i<j) {
				if(j%i==0)
		              break;  
				else
					i++;
			}
			if (j==i)
				System.out.println("Prime=" + j);
			else
				System.out.println("Not Prime=" + j);

		}
	}

}
