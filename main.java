import java.util.Scanner;

public class main{
	public static void main(String[] args){
		String nama;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama anda: ");
		nama =  input.nextLine();
		
		System.out.println("Daftar harga");
		System.out.println("======================");
		System.out.println("Merk G");
		System.out.println("-Tipe Meja(M)= Rp 95.000");
		System.out.println("-Tipe Meja(K)= Rp125.000");
		System.out.println("-Tipe Meja(L)= Rp450.000");
		System.out.println("======================");
		System.out.println("Merk O");
		System.out.println("-Tipe Meja(M)= Rp115.000");
		System.out.println("-Tipe Meja(K)= Rp135.000");
		System.out.println("-Tipe Meja(L)= Rp550.000");
		
		System.out.print("Masukkan merk: ");
		char m = input.next().charAt(0);
		System.out.print("Masukkan tipe: ");
		char t = input.next().charAt(0);
		System.out.print("Masukkan jumlah: ");
		byte j = input.nextByte();
		
		
		switch(m){
			case 'G': MerkG G = new MerkG();
					  G.setMerk(m);
					  G.setTipe(t);
					  G.setJumlah(j);
					  G.Harga();
					  G.TotalHarga();
					  System.out.print("Bayar: ");
					  int bayar1 = input.nextInt();
					  G.setBayar(bayar1);
					  G.kembalian();
					  break;
			case 'O': MerkO O = new MerkO();
					  O.setMerk(m);
					  O.setTipe(t);
					  O.setJumlah(j);
					  O.Harga();
					  O.TotalHarga();
					  System.out.print("Bayar: ");
					  int bayar2 = input.nextInt();
					  O.setBayar(bayar2);
					  O.kembalian();
					  break;
			default: System.out.println("Merk salah"); System.exit(0);
		}
	}
}