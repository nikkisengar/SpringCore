package com.nt.beans;

/*Implementation class for the interface Engine and making 
 * it final class to avoid any modification in this class
 * and to implement the Strategy Design Pattern
*/
public final class DieselEngine implements Engine {

	@Override
	public void start() {
		System.out.println("DieselEngine :: Started...");
	}

	@Override
	public void stop() {
		System.out.println("DieselEngine :: Stoped...");
	}

}
