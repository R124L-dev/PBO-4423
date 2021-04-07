import java.util.ArrayList;
class siswa {
    private String nim;
    private String nama;
    private int teori;
    private int praktek;
    public void setSiswa(String nim, String nama, int teori, int praktek){
        this.nim = nim;
        this.nama = nama;
        this.teori = teori;
        this.praktek = praktek;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setTeori(int teori) {
        this.teori = teori;
    }
    public void setPraktek(int praktek) {
        this.praktek = praktek;
    }
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public int getTeori() {
        return teori;
    }
    public int getPraktek() {
        return praktek;
    }
}

public class NilaiSiswa {

    public static void main(String[] args) {
        siswa siswa = new siswa();
        ArrayList<siswa> tabsiswa = new ArrayList<siswa>();
        siswa.setSiswa("A11.2019.12070", "Rizal Fadlullah", 100, 100);
        tabsiswa.add(siswa);
        siswa.setSiswa("A11.2019.12453", "Ridwan", 90, 77);
        tabsiswa.add(siswa);
        siswa.setSiswa("A11.2019.12234", "Naufal", 80, 95);
        tabsiswa.add(siswa);
        siswa.setSiswa("A11.2019.12564", "Jatayu", 85, 88);
        tabsiswa.add(siswa);
        System.out.println();
        for (int counter =0; counter < tabsiswa.size(); counter++) {
            System.out.println("NIM\t:"+tabsiswa.get(counter).getNim());
            System.out.println("Nama\t:"+tabsiswa.get(counter).getNama());
            System.out.println("Teori\t:"+tabsiswa.get(counter).getTeori());
            System.out.println("Praktek\t:"+tabsiswa.get(counter).getPraktek());
            System.out.println("----------------------------------------------");
        }
      
    }
}
