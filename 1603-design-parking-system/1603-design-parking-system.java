class ParkingSystem {
    private int[] slots;

    public ParkingSystem(int big, int medium, int small) {
        slots = new int[] { 0, big, medium, small };
    }
    
    public boolean addCar(int carType) {
        if (carType < 1 || carType > 3) {
            return false;
        }
        if (slots[carType] > 0) {
            slots[carType]--;
            return true;
        }
        return false;
    }
}