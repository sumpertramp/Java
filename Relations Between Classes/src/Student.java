public class Student {
    private String name;
    private String surname;
    private String IDno;
    private String address;
    private int note;

    public Student(String name, String surname, String IDno, String address, int note){
        this.name = name;
        this.surname = surname;
        this.IDno = IDno;
        this.address = address;

        this.note = note;
        if(note > 100 || note < 0){
            this.note = 0;
        }
    }

    public String getName(){
        return this.name;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname( String surname){
        this.surname = surname;
    }

    public String getIDno(){
        return this.IDno;
    }

    public void setIDno(String IDno){
        this.IDno = IDno;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNote(){
        return this.note;
    }

    public void setNote(int note){
        this.note = note;
    }

    //Oluşturulan tüm öğrencilerin not ortalamasını
    //hesaplayan bir method yazalım:

}
