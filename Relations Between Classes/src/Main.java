//OOP'de üç çeşit sınıflar arası ilişki mevcut.
//1 - Dependensy(Bağımlılık)
//2 - Composition (Birleştirme)
//3 - Inheritance (Kalıtım)
//Bu örnekte dependensy(bağımlılık ilkesi işlenecektir.)

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Mustafa","Çetindağ","123","AA",85);
        Student st2 = new Student("Patika","Dev","2321","BB",85);
        Student st3 = new Student("Kodluyoruz", "Java102","12312","CC",85);

        Instructor teacher = new Instructor("Mahmut","Çetindağ","CENG");
        //st2.setNote(100);
        //System.out.println(st2.getNote());

        Course mat = new Course("MAT101","MAT");
        Student[] stu = {st1,st2,st3};
        //System.out.println("Ortalama: " + mat.calcAverage(stu));

        System.out.println(teacher.getName()); //Bu işleme composition ya da aggretation denilmektedir.
        //Burada farklı iki sınıftan üretilen nesneleri birleştirme yapmış olduk.

        //Inheritance(Kalıtım) bir sınıfın bir snıfa ait olması bir sonraki
        //derste işlenecektir.
    }
}