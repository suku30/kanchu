package datatypes.primitive.program;

public class AllDataTypes {
	private void sub() {
	int a=10;
	int b=20;
	int c=a+b;
	int d=5;
	int e=c+d;
	int f=5;
	int g=e-f;
	int h=5;
	int i=g/h;
	int j=5;
	int k=j*i;
	char l='z';
	long m=1000000000;
	short n=10000;
	double o=100000.00;
	float p=52.2f;
	double q=m+n+o+p;
	String name="kanchana";
	System.out.println("the value of a,b,c,d,e,f,g,h,k is" +k);
	System.out.println(l);
	System.out.println(name+ " "+ l);
	System.out.println("the value of m,n,o,p is"+q);
	}
	public static void main(String[] args) {
		AllDataTypes s=new AllDataTypes();
		s.sub();
	}

}
