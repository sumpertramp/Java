public class Working {
    private String nameSurname;
    private String phoneNumber;
    private String email;

    public Working(){} //Method overloading işlemi yapıldı. Kalıtım yaparken artık hata almıyoruz.

    public Working(String nameSurname, String phoneNumber, String email){
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNameSurname(){
        return nameSurname;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setNameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email){
        this.email = email;
    }


    public void enter(){
        System.out.println(this.nameSurname + " entered the university.");
    }

    public void exit(){
        System.out.println(this.nameSurname + " left the university.");
    }

    public void refectory(){
        System.out.println(this.nameSurname + " entered the refectory.");
    }
}

//NOT! Javada multiinheritance (çoklu kalıtım) yok!
