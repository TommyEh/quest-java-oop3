public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!flying) {
            flying = true;
            System.out.println(getName() + " takes off in the sky.");
        }
    }

    @Override
    public int ascend(int meters) {
        if (flying) {
            altitude += meters;
            System.out.println(getName() + " flies upward, altitude: " + altitude);
        }
        return altitude;
    }

    @Override
    public int descend(int meters) {
        if (flying) {
            altitude = Math.max(altitude - meters, 0);
            System.out.println(getName() + " flies downward, altitude: " + altitude);
        }
        return altitude;
    }

    @Override
    public void land() {
        if (altitude > 1) {
            System.out.println(getName() + " is too high, it can't land.");
        } else {
            flying = false;
            System.out.println(getName() + " lands on the ground.");
        }
    }
}
