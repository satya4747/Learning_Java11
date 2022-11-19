package java11.training.exception;

public class Printer implements AutoCloseable{
	
	public void open() {
		System.out.println("Printer.open()");
	}
	public void close() {
		System.out.println("Printer.close()");
	}
	public void scanningAndPrinting() {
		System.out.println("Printer.scanningAndPrinting()");
		throw new IllegalArgumentException();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Printer.finalize()");
	}

}
