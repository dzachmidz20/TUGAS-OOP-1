import java.util.Scanner;

public class gajixoop {
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
                return;
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
                return;
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
                return;
        }

        System.out.println("===================================");
        System.out.println("Nama \t\t:" + nama);
        System.out.println("Alamat \t\t:" + alamat);
        System.out.println("Departemen \t:" + departemen);
        System.out.println("Pengalaman \t:"+ pengalaman);
        System.out.println("Skill \t\t:" + skill);
        System.out.println("Gaji \t\t:" + gajiDasar);
        System.out.println("===================================");
    }
}
