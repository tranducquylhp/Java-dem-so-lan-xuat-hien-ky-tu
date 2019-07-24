import java.io.IOException;
import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = scanner.nextLine();

        System.out.println("Nhap ky tu muon kiem tra: ");
        char x = (char) System.in.read();
        int count = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == x){
                count++;
            }
        }

        System.out.println("So lan xuat hien ky tu "+x+" la: "+count+" lan");
    }
}
