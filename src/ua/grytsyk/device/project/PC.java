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

public class PC extends Device {
	protected int ram;
	final int min=10;
	final int max=1000;

	public PC(String name, int power) {

		super(name, power);
		System.out.println("Min ram is "+min+"and max ram is "+max);

		// TODO Auto-generated constructor stub
	}

	public PC(String name) {
		super(name);
		System.out.println("Min ram is "+min+"and max ram is "+max);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PC setPower(int power) {
		// TODO Auto-generated method stub
		return (PC) super.setPower(power);
	}

	public void setRam(int ram) {
		if (isRamOk(ram)) {
			this.ram = ram;
		} else System.out.println("Incorrect ram");
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

	private boolean isRamOk (int ram) {
		if (ram<min||ram>max) return false;
		return true;

	}

}
