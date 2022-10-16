public class officer extends Working {
    private String part;
    private String shift;

    public officer(String nameSurname, String phoneNumber, String email, String part, String shift){
        super(nameSurname, phoneNumber, email);
        this.part = part;
        this.shift =shift;
    }

    public String getPart(){
        return part;
    }

    public String getShift(){
        return shift;
    }

    public void setPart(String part){
        this.part = part;
    }

    public void setShift(String shift){
        this.shift = shift;
    }


}
