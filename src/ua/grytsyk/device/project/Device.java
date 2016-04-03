/*
 *Device
 *
 *Ver.
 *
 *Apr 3, 2016
 *
 *© I.Gritsyk 2016. 
 */
package ua.grytsyk.device.project;

/**
 * @author I.Gritsyk
 *
 */
public class Device {
	protected String name;
	protected int power;
	static int totalPower=0;

	public Device(String name, int power) {
		super();
		this.name = name;
		this.power = power;
		totalPower+=power;
	}

	public Device(String name) {
		super();
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public Device setPower(int power) {
		this.power = power;
		totalPower+=power;
		return this;
	}
    public static void showTotalPower(){
    	System.out.println(totalPower);
    }
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int myCompare(Device other){
		if(power==other.power) return 0;
		if(power>other.power) {
			return 1;
		} else return -1;
	}
	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Device [name=" + name + ", power=" + power + "]";
	}
	
	
}
