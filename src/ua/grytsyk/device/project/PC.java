/*
 *PC
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
public class PC extends Device {
	protected int ram;

	public PC(String name, int power) {
		super(name, power);

		// TODO Auto-generated constructor stub
	}

	public PC(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/*
	 * @see ua.grytsyk.device.project.Device#setPower(int)
	 */
	@Override
	public PC setPower(int power) {
		// TODO Auto-generated method stub
		return (PC) super.setPower(power);
	}

	public void setRam(int ram) {
		this.ram = ram;
		// return this;
	}

	public int getRam() {
		return ram;
	}

	@Override
	public int myCompare(Device other) {
		if (!(other instanceof PC))
			return super.myCompare(other);
		PC otherPc = (PC) other;
		if (otherPc.ram == ram)
			return 0;
		if (ram < otherPc.ram) {
			return -1;
		} else
			return 1;
	}

}
