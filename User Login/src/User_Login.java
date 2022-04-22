import java.util.Scanner;

public class User_Login {
    public static void main(String[] args) {

        String userName, password, newPassword;
        int resetPassword;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı adınız:");
        userName = inp.nextLine();
        System.out.println("Şifreniz:");
        password = inp.nextLine();

        //Stringlerde if kalıbında eşitlik için equals kullanılır. == kullanılamaz.
        if ((userName.equals("Patika")) && (password.equals("patika123"))){

            System.out.println("Başarıyla giriş yaptınız.");

        }else if((!userName.equals("Patika")) && (password.equals("patika123"))){

            System.out.println("Kullanıcı adınız yanlış.");

        }else if((userName.equals("Patika")) && (!password.equals("patika123"))){

            System.out.println("Hatalı şifre!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            System.out.println("1=Evet.\n2=Hayır.");
            resetPassword = inp.nextInt();
            switch (resetPassword){
                case 1 :
                    System.out.print("Yeni Şifreniz : " + inp.nextLine());
                    newPassword = inp.nextLine();
                    if (newPassword.equals ("patika123")) {
                        System.out.println("Eski şifrenizin aynısını girdiniz. Lütfen farklı bir şifre oluşturun.");
                        break;
                    }else {
                        System.out.println("Şifreniz başarıyla değiştirildi.");
                        break;
                    }
                case 2 :
                    System.out.println("Şifre sıfırlanmadı.");
                    break;
            }
        }else {
            System.out.println("Bilgilerinizi kontrol ediniz !");
        }

    }
}
