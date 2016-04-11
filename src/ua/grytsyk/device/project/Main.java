/*
 *Main
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
public class Main {
    private int totalRam; 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device device=new Device("NameDevice",100);
		PC pc=new PC("NamePC",500);
		pc.setRam(1000);
		Device tv=new TV("NameTV",500);
		Device player=new Player("Name1",0);
		PC laptop=new Laptop("NameLaptop");
		
		System.out.println(device);
		System.out.println(pc);
		System.out.println(tv);
		System.out.println(player);
		
		device.setName("Name1");
		laptop.setPower(355).setRam(44);
		
		Device.showTotalPower();
		Main m=new Main();
		
        System.out.println(m.ramCount(device,pc,tv,player,laptop));
        System.out.println(pc.myCompare(tv));
		}

	public int ramCount(Device...devices){
		for(Device d: devices) {
			if(d instanceof PC) {
				totalRam+=((PC)d).getRam();
			}
		}
		return totalRam;
	}
	

}
