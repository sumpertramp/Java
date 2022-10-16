public class instructor extends academician {
    private String doorNumber;
    public instructor(String nameSurname, String phoneNumber, String email, String department, String degree,String doorNumber){
        super(nameSurname, phoneNumber, email, department, degree);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber(){
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber){
        this.doorNumber = doorNumber;
    }


}
