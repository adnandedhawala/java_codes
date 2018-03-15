class xyz{
 int i=10;
 void test(){
  System.out.println("Test of kid");
 }
}

class pqr extends xyz{
 void test(){
	System.out.println("Test of the fomo");
	}
}

class test{
 public static void main (String args[]){
	pqr obj= new pqr();
	System.out.println(obj.i);
	obj.test();
	}
}
