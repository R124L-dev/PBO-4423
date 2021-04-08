import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
class siswa {
    private String nim;
    private String nama;
    private int teori;
    private int praktek;
    public siswa(String nim, String nama, int teori, int praktek) {
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

public class NilaiSiswa extends JFrame {
    public NilaiSiswa() {
        setTitle("Daftar Nilai Siswa");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        userInterfaceGUI();
        setVisible(true);
    }

    private void userInterfaceGUI() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{
            "NIM", "NAMA", "TEORI", "PRAKTEK"
        });
        JTable tabel = new JTable(model);

        Scanner sc = new Scanner(System.in);
        ArrayList<siswa> tabsiswa = new ArrayList<>();
        System.out.print("Masukkan Jumlah Data\t: ");
        int i = sc.nextInt();
        for (int counter = 0; counter < i; counter++){
            System.out.print("NIM\t:");
            String nim = sc.next();
            System.out.print("Nama\t:");
            String nama = sc.next();
            System.out.print("Teori\t:");
            int teori = sc.nextInt();
            System.out.print("Praktek\t:");
            int praktek = sc.nextInt();
            System.out.println("--------------------------");
            siswa s = new siswa(nim, nama, teori, praktek);
            tabsiswa.add(s);
        }
        for(siswa s:tabsiswa){
            Object[] dataRow = new Object[4];
            dataRow[0] = s.getNim();
            dataRow[1] = s.getNama();
            dataRow[2] = s.getTeori();
            dataRow[3] = s.getPraktek();
            model.addRow(dataRow);
        };
        JScrollPane scroll = new JScrollPane();
        scroll.setViewportView(tabel);
        
        getContentPane().add(scroll);
    }
    public static void main(String[] args) {
        NilaiSiswa obj = new NilaiSiswa();
    }
}
