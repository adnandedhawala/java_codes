
interface math{
	int sum(int a,int b);
	int mul(int c,int d);
}
class intfce implements math{
	public int sum(int a, int b){
		return a+b;
	}
	public int mul(int c,int d){
		return c*d;
	}
}

class test{
	public static void main(String[] args) {
	intfce o= new intfce();
	int t= o.sum(2,6);
	int u=o.mul(9,6);
	System.out.println(t);
	System.out.println(u);
	}
}