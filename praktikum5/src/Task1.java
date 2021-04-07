/**
 * Task1
 */
public class Task1 {

    public static void daftarNilai(int [][] nilai) {
        for (int k = 0; k < nilai.length; k++) {
            System.out.print("Nilai mahasiswa ke-");
            System.out.print(k+1);
            System.out.print('\t');
            for (int k2 = 0; k2 < nilai[k].length; k2++) {
                System.out.print(nilai[k][k2]);
                System.out.print('\t');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] nilai ={ 
            {70, 80, 83},
            {90, 77, 95},
            {88, 100, 85},
        } ;
        daftarNilai(nilai);
    }
}