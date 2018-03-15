class dcmnt{
	public static void public static void main(String[] args) {
		File f= new File("C://");
		String[] files=f.list();
		for(int i=0;i< files.length; i++){
			System.out.println(files[i]);
		}
	}
} 