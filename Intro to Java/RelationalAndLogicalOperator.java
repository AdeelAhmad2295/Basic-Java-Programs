public class RelationalAndLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=10;
//		Relational Operators
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>c);
		System.out.println(a==c);
		System.out.println(a!=b);
//		Logical Operators
		System.out.println(a<b && a==c);
		System.out.println(a>b || a!=c);
		System.out.println(!(a>=b));
	}

}
