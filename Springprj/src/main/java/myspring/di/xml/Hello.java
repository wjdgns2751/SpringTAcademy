package myspring.di.xml;


//DI 애플리케이션 작성 

public class Hello {
	
	private String name;
	private Printer printer;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public String sayHello() {
		return "hello"+name;
	}
	
	public void print() {
		this.printer.print(sayHello());
	}
	
}
