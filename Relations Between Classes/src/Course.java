public class Course {
    private String courseName;
    private String code;
    private Instructor instructor;

    public Course(String courseName, String code){
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String code(){
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instructor getInstructor(){
       return instructor;
    }

    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }

    public double calcAverage(Student[] students) {

        Student st4 = new Student("Sümeyye","Derelli","145","DD",85);

        double average = 0;
        for(Student student : students){
            average += student.getNote();
        }
        return average / students.length;

        //Bir sınıf başka bir sınıftan üretilmiş nesneleri kullanıyorsa o sınıfa bağımlıdır.
        //Burada course sınıfı student sınıfına bağlıdır.
    }
}
