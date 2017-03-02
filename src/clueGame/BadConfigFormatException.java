
public class BadConfigFormatException extends Exception {
	private String badFile;
	public BadConfigFormatException(String badFile) throws Throwable {
		super();
		this.badFile = badFile;
		System.out.println("Bad File");
	}
}
