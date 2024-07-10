import java.io.*;

class Ex8_10 {
	public static void main(String[] args) {
		try {
			File f = createFile("");
			System.out.println( f.getName()+"파일 생성");
		} catch (Exception e) {
			System.out.println(e.getMessage()+" 다시 입력");
		}
	}

	static File createFile(String fileName) throws Exception {
		if (fileName==null || fileName.equals(""))
			throw new Exception("파일 이름이 이상");
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}
}