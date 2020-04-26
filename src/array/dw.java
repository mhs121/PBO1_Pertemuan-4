package array;

public class dw {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi Gelas sekarang : "+isiGelas+"ml");
        System.out.println("isi Glesa Ketika Penuh :"+isiGelas+"ml");

        do {
            isiGelas++;
            System.out.println("Sedang mengisi gelas..");
            System.out.println("Isi Gelas Sekarang :"+isiGelas+"ml");
        }while (isiGelas != penuh);
        System.out.println("Finale : Isi Gelas Sekarang :"+isiGelas+"ml");
    }
}
