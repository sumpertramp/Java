public class securityGuard extends officer {
    private String document;

    public securityGuard(String nameSurname, String phoneNumber, String email, String part, String shift, String document){
        super(nameSurname, phoneNumber, email, part, shift);
        this.document = document;
    }

    public String getDocument(){
        return document;
    }

    public void setDocument(String document){
        this.document = document;
    }

    public void watch(){
        System.out.println(this.getNameSurname() + " is keeping watch.");
    }
}
