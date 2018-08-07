
public class Computer {

	String brandname;
	CPU cpu;
	Keyboard key;

	// For DI with constructor
	// Computer(CPU cpu, Keyboard key)
	// {
	// this.cpu = cpu;
	// this.key = key;
	// }
	// <constructor-arg ref="cpu1"></constructor-arg> ---> use this in beans.xml
	// when using constructor
	// <constructor-arg ref="key"></constructor-arg>
	//	Note: For constructor level, we need to remove the getters and setters for CPU, key.

	public String getBrandname() {
		return brandname;
	}

	public CPU getCpu() {
		return cpu;
	}

	public Keyboard getKey() {
		return key;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public void setKey(Keyboard key) {
		this.key = key;
	}

//	public void setCPU(CPU cpu, Keyboard key) {
//		this.cpu = cpu;
//		this.key = key;
//	}
}
