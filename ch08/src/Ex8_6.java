class Ex8_6 {
	public static void main(String args[]) {
		try {
//			Exception e = new ArithmeticException("고의로 발생.");
//			throw e;	 // 예외를 발생
		  throw new RuntimeException("고의로 발생");

		} catch (Exception e)	{
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("정상 종료.");
	}
}