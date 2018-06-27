package com.nt.beans;

/*Implementation class of the interface Engine and
 * making it as final class to avoid any modification 
 * and to implement the Strategy Design Pattern
*/
public final class PetrolEngine implements Engine {

	@Override
	public void start() {
		System.out.println("PetrolEngine :: Started...");

	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine :: Stoped...");

	}

}
