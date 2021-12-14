public class Q2 {

	public static void main(String[] args) {
		Car car = new Car();
		car.accelerate(40);
		car.reduce_speed(5,false);
		car.reduce_speed(-5,false);
		car.accelerate(66);
		car.accelerate(5);
		car.reduce_speed(6, false);
		System.out.println(car);
	}

}

class Car {
	private double speed;
	private int num_seats;
	private boolean airbags;
	public static final int MAX_SPEED = 100;
	private int num_gears;
	private boolean isMoving;
	
	public Car() {
		num_seats=4;
		speed=0;
		airbags = true;
		num_gears=7;
		isMoving = false;
	}
	
	public void accelerate(int x) {
		if(speed+x > MAX_SPEED) {
			speed = 0;
			isMoving=false;
			System.out.println("CRASH");
		}
		else {
			speed += x;
			isMoving=true;
			if(speed <= 0) {
				speed = 0;
				isMoving=false;
			}
		}
	}
	public void accelerate(float x) {
		if(speed+x > MAX_SPEED) {
			speed = 0;
			isMoving=false;
			System.out.println("CRASH");
		}
		else {
			speed += x;
			isMoving=true;
			if(speed <= 0) {
				speed = 0;
				isMoving=false;
			}
		}
	}
	
	public void reduce_speed(double x, boolean emergency) {
		
		if(emergency) {
			speed = 0;
			isMoving=false;
			return;
		}
		if(x < 0) {
			System.out.println("Speed can't be reduced by a negative value");
			return;
		}
		speed -= x;
		if(speed <= 0) {
			speed = 0;
			isMoving=false;
		}
	}
	
	@Override
	public String toString() {
		String str = "speed: "+speed+"\nnum_seats: "+num_seats+"\nairbags: "+airbags+"\nMAX_SPEED: "+MAX_SPEED;
		str += "\nnum_gears: "+num_gears+"\nisMoving: "+isMoving;
		return str;
	}
}
