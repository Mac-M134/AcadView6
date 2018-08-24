class Vehicle{
	public static void main(String args[]){
		VehicleM t2=new TwoW();
		VehicleM f4=new FourW();
		t2.start();
		t2.stop();
		f4.start();
		f4.stop();
	}
}
abstract class VehicleM{
	public abstract void start();
	public void stop(){
		System.out.println("Vehicle Is Stopped");
	}

}
class TwoW extends VehicleM{
	public void start(){
		System.out.print("Two Wheeler is Started \n");
	}
	
}
class FourW extends VehicleM{
	public void start(){
		System.out.println("Four Wheeler Started");
	}
}




