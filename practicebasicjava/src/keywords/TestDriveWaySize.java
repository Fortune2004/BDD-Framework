package keywords;

public class TestDriveWaySize {

    public static void main(String[] args) {
        DriveWay tofael = new DriveWay();
        tofael.setDriveWaySize(9);
        System.out.println(tofael.getDriveWaySize());


        DriveWay arif = new DriveWay();
        arif.setDriveWaySize(10);
        System.out.println(arif.getDriveWaySize());


        System.out.println("Tofael's driveway size: "+tofael.getDriveWaySize());

        System.out.println("Arif's driveway size: "+arif.getDriveWaySize());
        DriveWay.buildDriveWay();
    }
}
