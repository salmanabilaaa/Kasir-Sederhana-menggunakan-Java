package BismillahLancar;
import java.util.Scanner;
public class appWarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //data barang yang dijual 
        cMenu Mn1 = new cMenu("Nasi Rawon",22000); double pmskn1 = 0;
        cMenu Mn2 = new cMenu("Nasi Cumi",18000); double pmskn2 = 0;
        cMenu Mn3 = new cMenu("Nasi Krengsengan",20000); double pmskn3 = 0;
        cMenu Mn4 = new cMenu("Nasi Pecel",12000); double pmskn4;
        cMenu Mn5 = new cMenu("Nasi Lodeh",13000); double pmskn5;
        cMenu Mn6 = new cMenu("Es Teh",4000); double pmskn6;
        cMenu Mn7 = new cMenu("Kopi Susu",5000); double pmskn7;
        cMenu Mn8 = new cMenu("Air Mineral",3500); double pmskn8;
        cMenu Mn9 = new cMenu("Susu Soda",6000);double pmskn9;
        
        //data member toko
        int id1 = 10, pwd1 = 111; double pemasukanMb1=0;String mb1="Tasya";
        int id2 = 11, pwd2 = 222; double pemasukanMb2=0;String mb2="Widya";
        int id3 = 12, pwd3 = 333; double pemasukanMb3=0;String mb3="Salma";
        int id, pin;double member1,member2,member3;
        
        //daftar antrian transaksi yg masuk ke toko
        cDaftarTransaksi jual = new cDaftarTransaksi();
        int pilih=0, pilih2=0, pilih3=0, pilih4=0;
        int kode=100, jumlah;
        
        do{
            System.out.println("\n======================================================");
            System.out.println("                  SELAMAT DATANG                        ");
            System.out.println("              WARUNG SAHABAT JEMBER                 ");
            System.out.println("======================================================");
            System.out.println("\nMENU UTAMA");
            System.out.println("1. Pembeli");
            System.out.println("2. Member");
            System.out.println("3. Admin");
            System.out.println("4. Pemilik");
            System.out.println("5. Exit");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    //pembeli
                    kode++;
                    cDaftarTransaksi beli = new cDaftarTransaksi();
                    System.out.print("Masukkan Nama = ");
                    String nama= sc.next();
                    do{
                        System.out.println("====== AKUN PEMBELI ======");
                        System.out.println("1.Tambah");
                        System.out.println("2.Hapus");
                        System.out.println("3.Lihat");
                        System.out.println("4.Kembali");
                        System.out.print("Pilih = ");
                        pilih2=sc.nextInt();
                        switch(pilih2){
                            case 1:
                                cTransaksi br=null;
                                System.out.println("Daftar Menu: ");
                                System.out.println("1. Nasi Rawon");
                                System.out.println("2. Nasi Cumi");
                                System.out.println("3. Nasi Krengsengan");
                                System.out.println("4. Nasi Pecel");
                                System.out.println("5. Nasi Lodeh");
                                System.out.println("6. Es Teh");
                                System.out.println("7. Kopi Susu");
                                System.out.println("8. Air Mineral");
                                System.out.println("9. Susu Soda");
                                System.out.print("Pilih = ");
                                pilih3 = sc.nextInt();
                                System.out.print("Jumlah = ");
                                jumlah=sc.nextInt();
                                if(pilih3 == 1){
                                    br = new cTransaksi(String.valueOf(kode),nama,Mn1,jumlah,0);
                                }
                                else if(pilih3 == 2){
                                    br = new cTransaksi(String.valueOf(kode),nama,Mn2,jumlah,0);
                                }
                                else if(pilih3 == 3){
                                    br = new cTransaksi(String.valueOf(kode),nama,Mn3,jumlah,0);
                                }
                                else if (pilih3==4){
                                    br = new cTransaksi(String.valueOf(kode),nama,Mn4,jumlah,0);
                                }
                                else if (pilih3==5){
                                    br = new cTransaksi(String.valueOf(kode),nama,Mn5,jumlah,0);
                                }
                                else if(pilih3 == 6){
                                    br = new cTransaksi(String.valueOf(kode),nama,Mn6,jumlah,0);
                                }
                                else if (pilih3==7){
                                    br = new cTransaksi(String.valueOf(kode),nama,Mn7,jumlah,0);
                                }
                                else if (pilih3==8){
                                    br = new cTransaksi(String.valueOf(kode),nama,Mn8,jumlah,0);
                                }
                                else if(pilih3 == 9){
                                    br = new cTransaksi(String.valueOf(kode),nama,Mn9,jumlah,0);
                                }
                                beli.tambahTransaksi(br);
                                break;
                            case 2:
                                //hapus transaksi
                                beli.lihatTransaksi();
                                System.out.print("Hapus Nomor = ");
                                int hapus = sc.nextInt();
                                beli.hapusTransaksi(hapus);
                                break;
                            case 3:
                                beli.lihatTransaksi();
                                break;
                            case 4:
                                //selesai. sambungkan transaksi pembeli
                                //ke antrian transaksi toko
                                jual.sambungTransaksi(beli.getFront(), beli.getRear());
                                System.out.println("Kembali ke menu utama...");
                                break;
                        }
                    }while(pilih2!=4);
                    break;
                case 2:
                    //anggota
                    boolean valid=false;
                    do{
                        System.out.print("ID  = ");
                        id=sc.nextInt();
                        System.out.print("PIN = ");
                        pin=sc.nextInt();
                        if(id==id1 && pin==pwd1)
                            valid=true;
                        else if(id==id2 && pin==pwd2)
                            valid=true;
                        else if(id==id3 && pin==pwd3)
                            valid=true;
                        if(valid==false)
                            System.out.println("ID/PIN salah!");
                        else break;
                    }while(valid==false);
                    if(valid==true){
                        System.out.println("Selamat datang...");
                        kode++;
                        beli = new cDaftarTransaksi();
                        do{
                            System.out.println("====== AKUN MEMBER ====== ");
                            System.out.println("1.Tambah");
                            System.out.println("2.Hapus");
                            System.out.println("3.Lihat");
                            System.out.println("4.Ubah Password");
                            System.out.println("5.Kembali");
                            System.out.print("Pilih = ");
                            pilih2=sc.nextInt();
                            switch(pilih2){
                                case 1:
                                    cTransaksi br=null;
                                    System.out.println("Daftar Menu: ");
                                    System.out.println("1. Nasi Rawon");
                                    System.out.println("2. Nasi Cumi");
                                    System.out.println("3. Nasi Krengsengan");
                                    System.out.println("4. Nasi Pecel");
                                    System.out.println("5. Nasi Lodeh");
                                    System.out.println("6. Es Teh");
                                    System.out.println("7. Kopi Susu");
                                    System.out.println("8. Air Mineral");
                                    System.out.println("9. Susu Soda");
                                    System.out.print("Pilih = ");
                                    pilih3 = sc.nextInt();
                                    System.out.print("Jumlah = ");
                                    jumlah=sc.nextInt();
                                    if(pilih3 == 1){
                                    br = new cTransaksi(String.valueOf(kode),String.valueOf(id),Mn1,jumlah,0);
                                    }
                                    else if(pilih3 == 2){
                                        br = new cTransaksi(String.valueOf(kode),String.valueOf(id),Mn2,jumlah,0);
                                    }
                                    else if(pilih3 == 3){
                                        br = new cTransaksi(String.valueOf(kode),String.valueOf(id),Mn3,jumlah,0);
                                    }
                                    else if (pilih3==4){
                                        br = new cTransaksi(String.valueOf(kode),String.valueOf(id),Mn4,jumlah,0);
                                    }
                                    else if (pilih3==5){
                                        br = new cTransaksi(String.valueOf(kode),String.valueOf(id),Mn5,jumlah,0);
                                    }
                                    else if(pilih3 == 6){
                                        br = new cTransaksi(String.valueOf(kode),String.valueOf(id),Mn6,jumlah,0);
                                    }
                                    else if (pilih3==7){
                                        br = new cTransaksi(String.valueOf(kode),String.valueOf(id),Mn7,jumlah,0);
                                    }
                                    else if (pilih3==8){
                                        br = new cTransaksi(String.valueOf(kode),String.valueOf(id),Mn8,jumlah,0);
                                    }
                                    else if(pilih3 == 9){
                                        br = new cTransaksi(String.valueOf(kode),String.valueOf(id),Mn9,jumlah,0);
                                    }
                                    beli.tambahTransaksi(br);
                                    break;
                                case 2:
                                    //hapus transaksi
                                    beli.lihatTransaksi();
                                    System.out.print("Hapus Nomor = ");
                                    int hapus = sc.nextInt();
                                    beli.hapusTransaksi(hapus);
                                    break;
                                case 3:
                                    //menampilkan daftar belanja dan diskon
                                    beli.lihatTransaksiMember();
                                    break;
                                case 4:
                                    //ubah password member cuy
                                    boolean validps = false;
                                    System.out.println("=Ubah Password=");
                                    System.out.print("Pin Lama : ");
                                    int pins = sc.nextInt();
                                    int pinbr = 0;
                                    if(pins==pwd1){
                                        validps = true;
                                    }else if (pins == pwd2){
                                        validps=true;
                                    }else if (pins == pwd3){
                                        validps=true;
                                    }
                                    if (validps==true){
                                        System.out.print("Password Baru = ");
                                        pinbr = sc.nextInt();
                                    }
                                    if (id==id1 && validps == true){
                                        pwd1=pinbr;System.out.println("Password berhasil diubah");
                                    }else if (id==id2 && validps == true){
                                        pwd2=pinbr;System.out.println("Password berhasil diubah");
                                    }else if (id==id3 && validps == true){
                                        pwd3=pinbr;System.out.println("Password berhasil diubah");
                                    }
                                    if (validps==false){
                                        System.out.println("Password invalid");
                                    }
                                    else{
                                        break;
                                    }
                                    break;
                                case 5:
                                    //selesai. sambungkan transaksi pembeli
                                    //ke antrian transaksi toko
                                    jual.sambungTransaksi(beli.getFront(), beli.getRear());
                                    System.out.println("Kembali ke menu utama...");
                                    break;
                            }
                        }while(pilih2!=5);
                    }
                    break;
                case 3:
                    //admin
                    int pilihad,passad,login=3;
                    jual.lihatTransaksi();
                    //memproses setiap transaksi yg belum diproses
                    cTransaksi t=jual.getFront();
                    do{
                        System.out.println("======= AKUN ADMIN ======");
                        System.out.println("1. Login");
                        System.out.println("2. Daftar Transaksi");
                        System.out.println("3. Selesai");
                        System.out.print("Pilih : ");
                        pilihad = sc.nextInt();
                        switch(pilihad){
                        case 1 :
                            do{
                                System.out.print("Password : ");
                                passad = sc.nextInt();
                                if(passad==222){
                                    do{
                                        if(t.getStatus()==0){
                                            System.out.println("\nKode    : "+t.getKode());
                                            System.out.println("Pembeli : "+t.getPembeli());
                                            System.out.println("Menu    : "+t.getMenu().getNama());
                                            System.out.println("Jumlah  : "+t.getJumlah());
                                            System.out.println("\nDiproses?");//GAK YAKIN
                                            System.out.println("1.Ya");//diproses
                                            System.out.println("2.Tidak");//selesai
                                            
                                            System.out.print("Pilih = ");
                                            int aksi = sc.nextInt();
                                            double sv1=0,sv2=0,sv3=0,sv4=0,sv5=0,sv6=0,sv7=0,sv8=0,sv9=0;
                                            double sv1mb=0,sv2mb=0,sv3mb=0,sv4mb=0,sv5mb=0,sv6mb=0,sv7mb=0,sv8mb=0,sv9mb=0;
                                            
                                            if(aksi==1){
                                                jual.prosesTransaksi(t);
                                                System.out.println("Berhasil diproses...");
                                                //penjumlahan per baraang
                                                if (t.getMenu().getNama().equals(Mn1.getNama())) {
                                                   sv1=(Mn1.getHarga()*t.getJumlah());
                                                    if(t.getPembeli().equalsIgnoreCase(String.valueOf(id1))){
                                                      sv1mb= sv1mb-(0.05*(Mn1.getHarga()*t.getJumlah()));
                                                      member1=sv1+sv1mb;
                                                      pemasukanMb1=pemasukanMb1 + member1;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id2))){
                                                        sv1mb= sv1mb-(0.05*(Mn1.getHarga()*t.getJumlah()));
                                                        member2=sv1+sv1mb;
                                                        pemasukanMb2=pemasukanMb2 + member2;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id3))){
                                                        sv1mb= sv1mb-(0.05*(Mn1.getHarga()*t.getJumlah()));
                                                        member2=sv1+sv1mb;
                                                        pemasukanMb3=pemasukanMb3 + member2;
                                                    }
                                                   pmskn1=(sv1+sv1mb);
                                                   Mn1.setPemasukan(pmskn1);                            //set pemasukan per makanan
                                                   System.out.println("Nasi Rawon : Rp"+pmskn1);
                                                }else if (t.getMenu().getNama().equals(Mn2.getNama())){
                                                    sv2=(Mn2.getHarga()*t.getJumlah());
                                                    if(t.getPembeli().equalsIgnoreCase(String.valueOf(id1))){
                                                      sv2mb= sv2mb-(0.05*(Mn2.getHarga()*t.getJumlah()));
                                                      member1=sv2+sv2mb;
                                                      pemasukanMb1=pemasukanMb1 + member1;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id2))){
                                                        sv2mb= sv2mb-(0.05*(Mn2.getHarga()*t.getJumlah()));
                                                        member2=sv2+sv2mb;
                                                        pemasukanMb2=pemasukanMb2 + member2;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id3))){
                                                        sv2mb= sv2mb-(0.05*(Mn2.getHarga()*t.getJumlah()));
                                                        member3=sv2+sv2mb;
                                                        pemasukanMb3=pemasukanMb3 + member3;
                                                    }
                                                   pmskn2=(sv2+sv2mb);
                                                   Mn2.setPemasukan(pmskn2);                            //set pemasukan per makanan
                                                   System.out.println("Nasi Cumi : Rp"+pmskn2);
                                                
                                                }else if (t.getMenu().getNama().equals(Mn3.getNama())){
                                                     sv3=(Mn3.getHarga()*t.getJumlah());
                                                     if(t.getPembeli().equalsIgnoreCase(String.valueOf(id1))){
                                                      sv3mb= sv3mb-(0.05*(Mn3.getHarga()*t.getJumlah()));
                                                      member1=sv3+sv3mb;
                                                      pemasukanMb1=pemasukanMb1 + member1;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id2))){
                                                        sv3mb= sv3mb-(0.05*(Mn3.getHarga()*t.getJumlah()));
                                                        member2=sv3+sv3mb;
                                                        pemasukanMb2=pemasukanMb2 + member2;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id3))){
                                                        sv3mb= sv3mb-(0.05*(Mn3.getHarga()*t.getJumlah()));
                                                        member3=sv3+sv3mb;
                                                        pemasukanMb3=pemasukanMb3 + member3;
                                                    }
                                                   pmskn3=(sv3+sv3mb);
                                                   Mn3.setPemasukan(pmskn3);  
                                                    System.out.println("Nasi Krengsengan : Rp"+pmskn3);
                                                }else if (t.getMenu().getNama().equals(Mn4.getNama())){
                                                     sv4=(Mn4.getHarga()*t.getJumlah());
                                                     if(t.getPembeli().equalsIgnoreCase(String.valueOf(id1))){
                                                      sv4mb= sv4mb-(0.05*(Mn4.getHarga()*t.getJumlah()));
                                                      member1=sv4+sv4mb;
                                                      pemasukanMb1=pemasukanMb1 + member1;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id2))){
                                                        sv4mb= sv4mb-(0.05*(Mn4.getHarga()*t.getJumlah()));
                                                        member2=sv4+sv4mb;
                                                        pemasukanMb2=pemasukanMb2 + member2;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id3))){
                                                        sv4mb= sv4mb-(0.05*(Mn4.getHarga()*t.getJumlah()));
                                                        member3=sv4+sv4mb;
                                                        pemasukanMb3=pemasukanMb3 + member3;
                                                    }
                                                   pmskn4=(sv4+sv4mb);
                                                   Mn4.setPemasukan(pmskn4);
                                                    System.out.println("Nasi Pecel : Rp"+pmskn4);
                                                }else if (t.getMenu().getNama().equals(Mn5.getNama())){
                                                     sv5=(Mn5.getHarga()*t.getJumlah());
                                                     if(t.getPembeli().equalsIgnoreCase(String.valueOf(id1))){
                                                      sv5mb= sv5mb-(0.05*(Mn5.getHarga()*t.getJumlah()));
                                                      member1=sv5+sv5mb;
                                                      pemasukanMb1=pemasukanMb1 + member1;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id2))){
                                                        sv5mb= sv5mb-(0.05*(Mn5.getHarga()*t.getJumlah()));
                                                        member2=sv5+sv5mb;
                                                        pemasukanMb2=pemasukanMb2 + member2;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id3))){
                                                        sv5mb= sv5mb-(0.05*(Mn5.getHarga()*t.getJumlah()));
                                                        member3=sv5+sv5mb;
                                                        pemasukanMb3=pemasukanMb3 + member3;
                                                    }
                                                   pmskn5=(sv5+sv5mb);
                                                   Mn5.setPemasukan(pmskn5);
                                                    System.out.println("Nasi Lodeh : Rp"+pmskn5);
                                                }else if (t.getMenu().getNama().equals(Mn6.getNama())){
                                                     sv6=(Mn6.getHarga()*t.getJumlah());
                                                     if(t.getPembeli().equalsIgnoreCase(String.valueOf(id1))){
                                                      sv6mb= sv6mb-(0.05*(Mn6.getHarga()*t.getJumlah()));
                                                      member1=sv6+sv6mb;
                                                      pemasukanMb1=pemasukanMb1 + member1;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id2))){
                                                        sv6mb= sv6mb-(0.05*(Mn6.getHarga()*t.getJumlah()));
                                                        member2=sv6+sv6mb;
                                                        pemasukanMb2=pemasukanMb2 + member2;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id3))){
                                                        sv6mb= sv6mb-(0.05*(Mn6.getHarga()*t.getJumlah()));
                                                        member3=sv6+sv6mb;
                                                        pemasukanMb3=pemasukanMb3 + member3;
                                                    }
                                                   pmskn6=(sv6+sv6mb);
                                                   Mn6.setPemasukan(pmskn6);
                                                    System.out.println("Es Teh : Rp"+pmskn6);
                                                }else if (t.getMenu().getNama().equals(Mn7.getNama())){
                                                     sv7=(Mn7.getHarga()*t.getJumlah());
                                                     if(t.getPembeli().equalsIgnoreCase(String.valueOf(id1))){
                                                      sv7mb= sv7mb-(0.05*(Mn7.getHarga()*t.getJumlah()));
                                                      member1=sv7+sv7mb;
                                                      pemasukanMb1=pemasukanMb1 + member1;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id2))){
                                                        sv7mb= sv7mb-(0.05*(Mn7.getHarga()*t.getJumlah()));
                                                        member2=sv7+sv7mb;
                                                        pemasukanMb2=pemasukanMb2 + member2;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id3))){
                                                        sv7mb= sv7mb-(0.05*(Mn7.getHarga()*t.getJumlah()));
                                                        member3=sv7+sv7mb;
                                                        pemasukanMb3=pemasukanMb3 + member3;
                                                    }
                                                   pmskn7=(sv7+sv7mb);
                                                   Mn7.setPemasukan(pmskn7);
                                                    System.out.println("Kopi Susu : Rp"+pmskn7);
                                                }else if (t.getMenu().getNama().equals(Mn8.getNama())){
                                                     sv8=(Mn8.getHarga()*t.getJumlah());
                                                     if(t.getPembeli().equalsIgnoreCase(String.valueOf(id1))){
                                                      sv8mb= sv8mb-(0.05*(Mn8.getHarga()*t.getJumlah()));
                                                      member1=sv8+sv8mb;
                                                      pemasukanMb1=pemasukanMb1 + member1;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id2))){
                                                        sv8mb= sv8mb-(0.05*(Mn8.getHarga()*t.getJumlah()));
                                                        member2=sv8+sv8mb;
                                                        pemasukanMb2=pemasukanMb2 + member2;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id3))){
                                                        sv8mb= sv8mb-(0.05*(Mn8.getHarga()*t.getJumlah()));
                                                        member3=sv8+sv8mb;
                                                        pemasukanMb3=pemasukanMb3 + member3;
                                                    }
                                                   pmskn8=(sv8+sv8mb);
                                                   Mn8.setPemasukan(pmskn8);
                                                    System.out.println("Air Mineral : Rp"+pmskn8);
                                                }else if (t.getMenu().getNama().equals(Mn9.getNama())){
                                                     sv9=(Mn9.getHarga()*t.getJumlah());
                                                     if(t.getPembeli().equalsIgnoreCase(String.valueOf(id1))){
                                                      sv9mb= sv9mb-(0.05*(Mn9.getHarga()*t.getJumlah()));
                                                      member1=sv9+sv9mb;
                                                      pemasukanMb1=pemasukanMb1 + member1;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id2))){
                                                        sv9mb= sv9mb-(0.05*(Mn9.getHarga()*t.getJumlah()));
                                                        member2=sv9+sv9mb;
                                                        pemasukanMb2=pemasukanMb2 + member2;
                                                    }else if (t.getPembeli().equalsIgnoreCase(String.valueOf(id3))){
                                                        sv9mb= sv9mb-(0.05*(Mn9.getHarga()*t.getJumlah()));
                                                        member3=sv9+sv9mb;
                                                        pemasukanMb3=pemasukanMb3 + member3;
                                                    }
                                                   pmskn9=(sv9+sv9mb);
                                                   Mn9.setPemasukan(pmskn9);
                                                    System.out.println("Susu Soda : Rp"+pmskn9);
                                                } 
                                            }
                                            else {
                                               break;
                                            }
                                        }
                                        t=t.next;login=0;
                                    }while(t!=null);
//                                    System.out.println("Daftar Transaksi Belum Diproses");
//                                    System.out.println("Menu : "+jual.mnblmproses());
//                                    System.out.println("Transaksi Belum Diproses  : "+jual.lihatblmDiproses());
                                
                                }else{
                                    System.out.println("password anda salah");
                                    login--;
                                    System.out.println("Sisa Percobaan "+login);
                                }
                            }while (login!=0); 
                            break;
                        case 2 :
                            login=3;
                            do{
                                System.out.print("Password : ");
                                passad = sc.nextInt();
                                if(passad==222){
                                    System.out.println("==Daftar Transaksi Belum Diproses==");
                                    System.out.println("Transaksi Belum Diproses  : "+jual.mnblmproses());
                                   // System.out.println("Transaksi Belum Diproses  : "+jual.lihatblmDiproses());
                                    System.out.println("Pemasukan           : Rp"+jual.lihatBelumDiproses());
                                }else{
                                    System.out.println("password anda salah");
                                    login--;
                                    System.out.println("Sisa Percobaan "+login);
                                }login=0;
                            }while (login!=0); 
                            break;
                        case 3 :
                            System.out.println("Kembali ke Menu Utama...");
                            break;
                        }
                    }while(pilihad!=3);
                    break;
                case 4:
                    //pemilik
                    int pilihow,passow,login2=3;
                    do{
                    System.out.println("====== AKUN PEMILIK ======");
                    System.out.println("1. Login");
                    System.out.println("2. Selesai");
                    System.out.print("Pilih : ");
                    pilihow = sc.nextInt();
                    switch(pilihow){
                        case 1:
                                do{
                                System.out.print("Password : ");
                                passad = sc.nextInt();
                                if(passad==333){
                                    do{
                                        System.out.println("Lihat Laporan");
                                        System.out.println("1. Laporan Transaksi");
                                        System.out.println("2. Lihat Pemasukan Tiap menu");
                                        System.out.println("3. Total Transaksi Member");
                                        System.out.println("4. Cetak Grafik");
                                        System.out.println("5. Ubah Harga");
                                        System.out.println("6. Keluar");
                                        System.out.print("Pilih = ");
                                        pilih4 =sc.nextInt();
                                            if(pilih4==1){
                                                System.out.println("====Pemasukan Tiap Menu====");
                                                System.out.println("Transaksi Diproses  : "+jual.lihatDiproses());
                                                System.out.println("Pemasukan           : "+jual.lihatPemasukan());
                                                System.out.println("================================================");
                                                System.out.println("Transaksi Belum Diproses  : "+jual.lihatblmDiproses());
                                                System.out.println("Pemasukan           : "+jual.lihatBelumDiproses());
                                            }
                                            else if(pilih4==2){
                                                System.out.println("\n1. "+ Mn1.getNama()+": Rp"+Mn1.getPemasukan());
                                                System.out.println("2. "+ Mn2.getNama()+": Rp"+Mn2.getPemasukan());
                                                System.out.println("3. "+ Mn3.getNama()+": Rp"+Mn3.getPemasukan());
                                                System.out.println("4. "+ Mn4.getNama()+": Rp"+Mn4.getPemasukan());
                                                System.out.println("5. "+ Mn5.getNama()+": Rp"+Mn5.getPemasukan());
                                                System.out.println("6. "+ Mn6.getNama()+": Rp"+Mn6.getPemasukan());
                                                System.out.println("7. "+ Mn7.getNama()+": Rp"+Mn7.getPemasukan());
                                                System.out.println("8. "+ Mn8.getNama()+": Rp"+Mn8.getPemasukan());
                                                System.out.println("9. "+ Mn9.getNama()+": Rp"+Mn9.getPemasukan());
                                            }
                                            else if(pilih4==3){
                                                System.out.println("\n====Total Transaksi Member====");
                                                System.out.println("1. "+ mb1+": Rp"+pemasukanMb1);
                                                System.out.println("2. "+ mb2+": Rp"+pemasukanMb2);
                                                System.out.println("3. "+ mb3+": Rp"+pemasukanMb3);
                                            }else if (pilih4==5){
                                                String ubah; boolean ada = false;
                                                System.out.println("====UBAH HARGA Menu====");
                                                System.out.print("Nama Menu : ");
                                                sc = new Scanner (System.in);
                                                ubah = sc.nextLine(); 
                                                    if(ubah.equalsIgnoreCase(Mn1.getNama())){
                                                       ada = true;
                                                       System.out.print("Harga baru : Rp");
                                                       int hargabr = sc.nextInt();
                                                       Mn1.setharga(hargabr);
                                                       System.out.println("harga baru "+Mn1.getNama()+" Rp"+Mn1.getHarga());
                                                       
                                                    }else if (ubah.equalsIgnoreCase(Mn2.getNama())){
                                                       ada = true;
                                                       System.out.print("Harga baru : Rp");
                                                       int hargabr = sc.nextInt();
                                                       Mn2.setharga(hargabr);
                                                       System.out.println("harga baru "+Mn2.getNama()+" Rp"+Mn2.getHarga());
                                                      
                                                    }else if (ubah.equalsIgnoreCase(Mn3.getNama())){
                                                       ada = true;
                                                       System.out.print("Harga baru : Rp");
                                                       int hargabr = sc.nextInt();
                                                       Mn3.setharga(hargabr);
                                                       System.out.println("harga baru "+Mn3.getNama()+" Rp"+Mn3.getHarga());
                                                       
                                                    }else if (ubah.equalsIgnoreCase(Mn4.getNama())){
                                                       ada = true;
                                                       System.out.print("Harga baru : Rp");
                                                       int hargabr = sc.nextInt();
                                                       Mn4.setharga(hargabr);
                                                       System.out.println("harga baru "+Mn4.getNama()+" Rp"+Mn4.getHarga());
                                                      
                                                    }else if (ubah.equalsIgnoreCase(Mn5.getNama())){
                                                       ada = true;
                                                       System.out.print("Harga baru : Rp");
                                                       int hargabr = sc.nextInt();
                                                       Mn5.setharga(hargabr);
                                                       System.out.println("harga baru "+Mn5.getNama()+" Rp"+Mn5.getHarga());
                                                       
                                                    }else if (ubah.equalsIgnoreCase(Mn6.getNama())){
                                                       ada = true;
                                                       System.out.print("Harga baru : Rp");
                                                       int hargabr = sc.nextInt();
                                                       Mn6.setharga(hargabr);
                                                       System.out.println("harga baru "+Mn6.getNama()+" Rp"+Mn6.getHarga());
                                                      
                                                    }else if (ubah.equalsIgnoreCase(Mn7.getNama())){
                                                       ada = true;
                                                       System.out.print("Harga baru : Rp");
                                                       int hargabr = sc.nextInt();
                                                       Mn7.setharga(hargabr);
                                                       System.out.println("harga baru "+Mn7.getNama()+" Rp"+Mn7.getHarga());
                                                       
                                                    }else if (ubah.equalsIgnoreCase(Mn8.getNama())){
                                                       ada = true;
                                                       System.out.print("Harga baru : Rp");
                                                       int hargabr = sc.nextInt();
                                                       Mn8.setharga(hargabr);
                                                       System.out.println("harga baru "+Mn8.getNama()+" Rp"+Mn8.getHarga());
                                                       
                                                    }else if (ubah.equalsIgnoreCase(Mn9.getNama())){
                                                       ada = true;
                                                       System.out.print("Harga baru : Rp");
                                                       int hargabr = sc.nextInt();
                                                       Mn9.setharga(hargabr);
                                                       System.out.println("harga baru "+Mn9.getNama()+" Rp"+Mn9.getHarga());
                                                       
                                                    }
                                                    System.out.println("perubahan berhasil");
                                          }
                                            login2=0;
                                        }while(pilih4!=6);
                                    }else{
                                      System.out.println("password anda salah");
                                      login2--;
                                      System.out.println("Sisa Percobaan "+login2);  
                                    }
                                    }while (login2!=0);    
                                break;
                        case 2 :
                                System.out.println("Kembali ke Menu Utama...");
                            break;
                      }
                    
                    }while(pilihow!=2);
                    break;
                case 5:
                    System.out.println("Terima kasih...");
                    break;
            }
        }while(pilih!=5);
    }
}
