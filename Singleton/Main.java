class Example {
	private String content;
	private static Example example;

	private Example() {}

	public static Example getExample() {
		if (example == null) {
			example = new Example();
		}
		return example;
	}

	public String  getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}

public class Main {
	public static void main(String[] args) {
		Example ex1 = Example.getExample();
		ex1.setContent("Hello World");

		Example ex2 = Example.getExample();
		String content = ex2.getContent();
		System.out.println(content);

	}
}
