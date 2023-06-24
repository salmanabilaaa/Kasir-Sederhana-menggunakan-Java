package BismillahLancar;
public class cDaftarTransaksi {
    cTransaksi front, rear;
    int jumlah;
    cDaftarTransaksi(){
        front=rear=null;
        jumlah=0;
    }
    public cTransaksi getFront(){
        return front;
    }
    public cTransaksi getRear(){
        return rear;
    }
    public void tambahTransaksi(cTransaksi baru){
        if(rear==null){
            front=rear=baru;
        }
        else{
            rear.next=baru;
            rear=baru;
        }
        System.out.println("Penambahan sukses..");
    }
    public void lihatTransaksi(){
        int i = 1;
        System.out.println("Daftar Transaksi: ");
        for(cTransaksi t=front; t!=null; t=t.next){
            System.out.print(i+".");
            System.out.print(t.getKode()+"-");
            System.out.print(t.getPembeli()+"-");
            System.out.print(t.getMenu().getNama()+"-");
            System.out.print(t.getJumlah()+"-");
            System.out.println(t.getStatus());
            i++;
        }
    }
    public void lihatTransaksiMember(){
        int i = 1;
        double total=0, diskon;
        System.out.println("Daftar Transaksi Member: ");
        for(cTransaksi t=front; t!=null; t=t.next){
            System.out.print(i+".");
            System.out.print(t.getKode()+"-");
            System.out.print(t.getPembeli()+"-");
            System.out.print(t.getMenu().getNama()+"-");
            System.out.print(t.getJumlah()+"-");
            System.out.println(t.getStatus());
            i++;
            total=total+(t.getMenu().getHarga()*t.getJumlah());
        }
        System.out.println("Total Belanja  : "+total);
        System.out.println("Diskon         : "+(0.05*total));
        System.out.println("Jumlah Dibayar : "+(total-(0.05*total)));
    }
    public void hapusTransaksi(int nomor){
        cTransaksi t = front;
        cTransaksi prev=null;
        int i=1;
        if(nomor==1){   //hapus posisi terdepan
            if(t.next==null){
                front=rear=null;
            }
            else{
                front=front.next;
                t.next=null;
            }
            System.out.println("["+t.getMenu().getNama()+"] dihapus..");
        }
        else{
            for(; t!=null; t=t.next){
                if(i==nomor){   //posisinya sudah ditemukan
                    break;
                }
                i++;
                prev=t;
        }
        //yg dihapus di ujung belakang
        if(t.next==null){
            rear=prev;
            rear.next=null;
        }
        else{
            prev.next=t.next;
            t.next=null;
        }
        System.out.println("["+t.getMenu().getNama()+"] dihapus..");
        }
    }
    public void sambungTransaksi(cTransaksi depan, cTransaksi belakang){//sambungkan dengan simpul depan transaksi
        //sambungkan transaksi
        if(rear==null){ //transaksi toko masih kosong
            front=depan; //front diisi dgn depannya dari antrian pembeli
            rear=belakang;
        }
        else{
            rear.next=depan;
            //update posisi rear
            rear=belakang;
        }
    }
    public void prosesTransaksi(cTransaksi t){
        //cek member
        t.setStatus(1);
    }
//    public void blmprosesTransaksi(cTransaksi t){ //blm proses
//        //cek member
//        t.setStatus2(1);
//    }
    public void prosesTransaksiMember(cTransaksi t){
        //mendapatkan diskon
    }
    public int lihatDiproses(){//dipake
        cTransaksi t=front;
        int proses=0;
        for (;t!=null; t=t.next) {
            if(t.getStatus()==1){
                proses++;
            }
        }
        return proses;
    }
    public int mnblmproses(){
        cTransaksi t = front;
        int blmproses=0,i=1;
        for (; t!=null; t=t.next) {
            if (t.getStatus()==0){
                blmproses++;
                System.out.println(i+". "+t.getMenu().getNama()+"\t");i++;
        }
      }return blmproses;
    }
    public int lihatblmDiproses(){ //  dipake
        cTransaksi t=front;
        int proses=0;
        for (;t!=null; t=t.next) {
            if(t.getStatus()==0){
                proses++;
            }
        }
        return proses;
    }
      public double lihatPemasukan(){
        cTransaksi t=front;
        double nominalnonmem=0,nominalmem=0,nominalfix;
        for (;t!=null; t=t.next) {
            //System.out.println("Kode: "+t.getKode());
            if(t.getStatus()==1){
                //cek member berdasarkan data nama/kode pembeli
                nominalnonmem=nominalnonmem+t.getMenu().getHarga()*t.getJumlah();
                if(t.getPembeli().compareToIgnoreCase("10")==0||t.getPembeli().compareToIgnoreCase("11")==0||t.getPembeli().compareToIgnoreCase("12")==0){
                    //System.out.println("Member!");
                    nominalmem=nominalmem-(0.05*(t.getMenu().getHarga()*t.getJumlah()));break;
                }
            }
        }
        nominalfix=nominalmem+nominalnonmem;
        return nominalfix;
    }
      public void totalBarang(){
          for (int i = 0; i < 10; i++) {
              
          }
      }
    public double lihatBelumDiproses(){
        cTransaksi t=front;
        double nominalnonmem2=0,nominalmem2=0,nominalfix2;
        for (;t!=null; t=t.next) {
            //System.out.println("Kode: "+t.getKode());
            if(t.getStatus()==0){
                //cek member berdasarkan data nama/kode pembeli
                nominalnonmem2=nominalnonmem2+t.getMenu().getHarga()*t.getJumlah();
                if(t.getPembeli().compareToIgnoreCase("10")==0||t.getPembeli().compareToIgnoreCase("11")==0||t.getPembeli().compareToIgnoreCase("12")==0){
                    //System.out.println("Member!");
                    nominalmem2=nominalmem2-(0.05*(t.getMenu().getHarga()*t.getJumlah()));break;
                }
            }
        }
        nominalfix2=nominalmem2+nominalnonmem2;
        return nominalfix2;
    }
    public void grafikPenjualan(int x){
        for (int i = 0; i < x; i++) {
            System.out.println("X");
        }
        System.out.println("");
    }
}
