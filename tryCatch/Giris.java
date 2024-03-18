package tryCatch;
// bu konuda hata aldıgımız kod blogunu es gecmeyi ogrendik
public class Giris {
    public static void main(String[] args) {
        int [] sayi= new int[5];
        System.out.println("merhaba");
        try {
            // bu kısma hatayı yaz
            System.out.println(sayi[6]);
        }catch (Exception e){
            System.out.println("Hata: "+ e.getMessage());// ya da sadece e de yazabilirsin.
        }
        System.out.println("calısıyor mu");
    }
}
