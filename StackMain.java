import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack15_Pakaian stk = new Stack_Pakaian(5);
        
        int pilihan;

        do {
            System.out.println("\nPilih Operasi:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. GetMax");
            System.out.println("6. Exit");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println();
                    System.out.print("Jenis\t: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna\t: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk\t: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran\t: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga\t: ");
                    double harga = sc.nextDouble();

                    Pakaian15 p = new Pakaian(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    stk.getMax();
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}