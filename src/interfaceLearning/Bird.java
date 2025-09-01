package interfaceLearning;

public interface Bird {
    void canFly();
    int getMinimumFlightHeight();
    // Minimum height is same for all Birds, but still both classes need to
    // override it manually. For overcome this issue default method is introduced.
    default int maximumFlyHeight(){
        return 500;
        // not required to override.
    };
    static boolean canBreathe(){
        return true;
        // can not be overridden by classes, just use
        // can be excess by interface name.
    }

}
