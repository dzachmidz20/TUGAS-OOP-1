import java.util.Scanner;

public class gajioop {
    private String nama;
    private String alamat;
    private String pengalaman;
    private String skill;
    private String departemen;

    public gajioop (String nama, String alamat, String pengalaman, String skill, String departemen) {
        this.nama = nama;
        this.alamat = alamat;
        this.pengalaman = pengalaman;
        this.skill = skill;
        this.departemen = departemen;
    }

    public int hitungGaji() {
        int gajiDasar = 0;
        switch (departemen) {
            case "IT":
                gajiDasar = 8000000;
                break;
            case "HRD":
                gajiDasar = 5000000;
                break;
            case "Finance":
                gajiDasar = 4000000;
                break;
            default:
                System.out.println("Departemen tidak valid");
                break;
        }
        switch (pengalaman) {
            case "pemula":
                gajiDasar += 500000;
                break;
            case "menengah":
                gajiDasar += 1000000;
                break;
            case "expert":
                gajiDasar += 2000000;
                break;
            default:
                System.out.println("Tingkat pengalaman tidak valid");
                break;
        }
        switch (skill) {
            case "web":
                gajiDasar += 1000000;
                break;
            case "mobile":
                gajiDasar += 2000000;
                break;
            case "desktop":
                gajiDasar += 2500000;
                break;
            default:
                System.out.println("Skill tidak valid");
                break;
        }
        return gajiDasar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama pegawai: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan alamat pegawai: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan tingkat pengalaman pegawai (pemula/menengah/expert): ");
        String pengalaman = scanner.nextLine();
        System.out.print("Masukkan skill pegawai (web/mobile/desktop): ");
        String skill = scanner.nextLine();
        System.out.print("Masukkan departemen pegawai (IT/HRD/Finance): ");
        String departemen = scanner.nextLine();
        
        gajioop pegawai = new gajioop(nama, alamat, pengalaman, skill, departemen);
        System.out.println("===================================");
        System.out.println("Nama \t\t:" + nama);
        System.out.println("Alamat \t\t:" + alamat);
        System.out.println("Departemen \t:" + departemen);
        System.out.println("Pengalaman \t:"+ pengalaman);
        System.out.println("Skill \t\t:" + skill);
        System.out.println("Gaji \t\t:" + pegawai.hitungGaji());
        System.out.println("===================================");
    }
}


