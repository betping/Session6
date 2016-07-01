
public class Implementation {

    void swirl(boolean clockwise) {
        System.out.println("Liquid Swirling");
    }
}

// In Source Packet in file inherit/ex5/Tea.java
class Tea extends Liquid {

    void swirl(boolean clockwise) {
        System.out.println("Tea Swirling");
    }

    void readFuture() {
        System.out.println("Reading the future...");
    }
}

// In Source Packet in file inherit/ex5/Coffee.java
class Coffee extends Liquid {

    void swirl(boolean clockwise) {
        System.out.println("Coffee Swirling");
    }
}

// In Source Packet in file inherit/ex5/Milk.java
class Milk extends Liquid {

    void swirl(boolean clockwise) {
        System.out.println("Milk Swirling");
    }

	public static void gurgle() {
		// TODO Auto-generated method stub
		
	}
}
