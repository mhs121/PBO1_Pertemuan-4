package array;

public class repeat {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi Gelas sekarang : "+isiGelas+"ml");
        System.out.println("isi Glesa Ketika Penuh :"+isiGelas+"ml");

        while (isiGelas != penuh){
            isiGelas++;
            System.out.println("Sedang mengisi gelas..");
            System.out.println("isi gelas Sekarang :"+isiGelas+"ml");
        }

        System.out.println("Finale: Isi  Gelas sekarang :"+isiGelas+"ml");
    }
}
