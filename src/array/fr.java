package array;

public class fr {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi Gelas sekarang : "+isiGelas+"ml");
        System.out.println("isi Glesa Ketika Penuh :"+isiGelas+"ml");

        for (isiGelas = 0; isiGelas<=penuh; isiGelas++){
            System.out.println("Sedang mengisi Gelas");
            System.out.println("Isi Gelas Sekarang :"+isiGelas+"ml");
        }
        System.out.println("final : Isi Gelas Sekarang : "+isiGelas+"ml");
    }
}
