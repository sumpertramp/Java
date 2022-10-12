public class Book {
    private String name;
    private int pageNumber;

    public Book(String name, int pageNumber){
        this.name = name;
        if(pageNumber < 0){
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }
    //pageNumber'ı ekrana yazdırmak için method oluşturuyoruz.

    public int getPageNumber(){
        return this.pageNumber;
    }

    //pageNumber'ı mainden değiştirebilmek için
    public void setPageNumber(int pageNumber){
        if(pageNumber < 0){
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }

    //name için encapsulation yapalım.

    //public String showName(){
    //    return this.name;
    //}

    //Yukarıdaki kod bloğu yerine get methodunu kullanalım.

    public String getName(){
        return this.name = name;
    }

    //public void changeName(String name){
    //this.name = name;
    //}

    //Yukarıdaki kod bloğu yerine Set methodunu kullanalım.

    public void setName(String abc){
        this.name = name;
    }

    //Set ve Get methodlarını pageNumber değişkeni için de uyguadık.
}
