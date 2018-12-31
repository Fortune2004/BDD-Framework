package classNobject;

public class TestHouse {

    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.numberOfBedroom();
        String houseName = myHouse.getHouseName();
        System.out.println(houseName);

        House myTypeHouse = new House();
        myTypeHouse.numberOfBedroom();

        Office myOffice = new Office();
        myOffice.displayOfficeAddress();
        myOffice.displayOfficeRooms();
        }
    }

