public class Patient {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;


      Patient(String name, String email ){
        this.name = name;
        this.email = email;
    }

    public void setWeight(double weight) {
          this.weight = weight;
    }

    public String getWeight() {
          return this.weight + "Kg";
    }


}
