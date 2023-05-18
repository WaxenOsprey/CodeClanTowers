public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4),
    CONFERENCE1(100),
    CONFERENCE2(500);

    private final int capacity;

    RoomType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
}
