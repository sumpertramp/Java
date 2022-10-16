public class academician extends Working{

    private String department;
    private String degree;
    public academician(String nameSurname, String phoneNumber, String email, String department, String degree){
        super(nameSurname, phoneNumber, email);
        this.department = department;
        this.degree = degree;
    }

    public String getDepartment(){
        return department;
    }

    public String getDegree(){
        return degree;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDegree(String degree){
        this.degree = degree;
    }

    public void attendClass(){
        System.out.println(this.getNameSurname() + " attended class." );
    } //Encapsulation
}
