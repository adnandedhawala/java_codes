class xyz {
 double sum(double a,double b){
	return a+b;
	}
}

class test{
	public static void main (String args[]){
	
		xyz obj = new xyz();
		double s= obj.sum(0.5,22);
		System.out.println(s);
	}
}
