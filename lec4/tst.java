//when static keyword is used, we do not need to create the object, just call it by classname


class xyz{
	int a=10;
	static int b=8;
}

class test{
	public static void main(String[] args) {
		xyz obj = new xyz();
		System.out.println(xyz.b);
		System.out.println(obj.a);
	}
}
