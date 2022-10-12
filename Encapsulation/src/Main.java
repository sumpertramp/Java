public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 150);
        Book lordOfTheRings = new Book("The Lord Of The Rings", -100);

        //pageNumber'ı private yaptığımızda ekrana bastıramadığımızı gördük.
        //Artık pageNumber'a buradan ulaşamayız.

        //System.out.println(lordOfTheRings.pageNumber);

        //System.out.println(lordOfTheRings.showPageNumber());
        //changePageNumber methodumuzla pageNumber'ı değiştiriyoruz.

        //lordOfTheRings.changePageNumber(-1000);
        //pageNumber'ı negatif bir sayı giremiyoruz. Bu sırada bir
        //koruma kalkanı ve filtreleme yapmış olduk.
        //Aslında encapsulation uygulamış olduk.
        //Nesne yönelimli programında nesneler üzerinde bir koruma kalkanı sağlamış olduk.
        //Nesneler üzerinde verileri anlamlandırmamızı sağladı.
        //Aynı koruma kalkanını name için de yapalım.

        //System.out.println(lordOfTheRings.name);
        //Görüldüğü gibi yukarıdki şekilde yazdıramıyoruz artık.

        //System.out.println(lordOfTheRings.showName());

        //Get methodları private değişkenleri getirmek için
        //Set methodları private değişkenlerde değişiklik yapmak için kullanılır.

        System.out.println(lordOfTheRings.getName());
        lordOfTheRings.setPageNumber(1000);
        System.out.println(lordOfTheRings.getPageNumber());


    }
}