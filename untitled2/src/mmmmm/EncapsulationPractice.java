package mmmmm;

public class EncapsulationPractice {


   public EncapsulationPractice(){}

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    private int password;

    public EncapsulationPractice(String username, int password) {
        this.username = username;
        this.password = password;
    }


    public void apps(String username,int password){
        System.out.println("apps using by user");
    }


}
