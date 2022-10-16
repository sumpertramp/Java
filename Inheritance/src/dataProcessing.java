public class dataProcessing extends officer{
    private String task;

    public dataProcessing(String nameSurname, String phoneNumber, String email, String part, String shift){
        super(nameSurname, phoneNumber, email, part, shift);
        this.task = task;
    }

    public String getTask(){
        return task;
    }

    public void setTask(String task){
        this.task = task;
    }

    public void setupNetwork(){
        System.out.println(this.getNameSurname() + " has set up the network.");
    }

}
