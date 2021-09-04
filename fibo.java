package Day1;

public class fibo {

	public static void main(String[] args) {
	int m=0,n=1,sum;
	System.out.println(m);
	for(int i=2; i<=8; i++) {
	sum= m+n;
	System.out.println(sum);
	
	m=n;
	n=sum;
	
	}
	}
}

