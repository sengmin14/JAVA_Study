class Ex9_14 {
	public static void main(String[] args) {
		
		Ex9_14 T = new Ex9_14();
		
		@SuppressWarnings("removal")
		Integer i  = new Integer(100);
		@SuppressWarnings("removal")
		Integer i2 = new Integer(100);

//		System.out.println("i==i2 ? "+(i==i2));
//		System.out.println("i.equals(i2) ? "+i.equals(i2));
//		System.out.println("i.compareTo(i2)="+i.compareTo(i2));
//		System.out.println("i.toString()="+i.toString());
//
//		System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
//		System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
//		System.out.println("SIZE="+Integer.SIZE+" bits");
//		System.out.println("BYTES="+Integer.BYTES+" bytes");
//		System.out.println("TYPE="+Integer.TYPE);
		
		T.change(i);
		
		System.out.println(i);
		
	}
	
	public void change(Integer c) {
		c = 200;
		
	}
}