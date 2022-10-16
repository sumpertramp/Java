public class Patika {
    public static void main(String[] args) {
        Working w1 = new Working ("Mustafa Çetindağ", "05074621522", "info@patika.dev");
        academician a1 = new academician("Patika Dev", "25412365212", "patika@dev", "CENG", "Associate Professor");
        Working w2 = new officer("Ali Veli", "201352522", "a@patika.dev","Data Processing","09:30 - 17:00"); //Farklı sınıf isimleri isimleri kullanılarak üretildi.
        instructor i1 = new instructor("Mahmut Çetindağ","0","mahmut@patika.dev","CENG","Associate Professor","5");
        dataProcessing d1 = new dataProcessing("Halil", "0213", "halil@patika.dev", "Data Processing", "09:30 - 17:00");
        securityGuard s1 = new securityGuard("Sümeyye", "542", "sümeyye@gmail.com", "Security", "08:00 - 16:00", "Available");

        w1.enter();
        a1.exit();
        a1.attendClass();
        w2.enter();
        w2.refectory();
        i1.enter();
        i1.exit();
        i1.attendClass();
        i1.refectory();
        d1.setupNetwork();
        s1.watch();

    }
}
