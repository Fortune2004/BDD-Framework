package Constructor;

public class House {

   public int houseNumber;
    public String houseName;

    public House(String houseName) {
        this.houseName = houseName;
        System.out.println(houseName);
    }


    public String getHouseName(){
        return houseName;
    }

    public void numberOfBedroom(){
        System.out.println("There are 3 bedrooms in the house");
    }
}

