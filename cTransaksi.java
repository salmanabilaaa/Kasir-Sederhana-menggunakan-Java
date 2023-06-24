package BismillahLancar;
public class cTransaksi {
    String kode;
    String pembeli;
    cMenu menu;
    int jumlahMn;
    int status,status2;
    cTransaksi next;
    cTransaksi(String k, String p, cMenu m, int j, int s){
        kode=k; pembeli=p; menu=m; jumlahMn=j; status=s;
        next=null;
    }
    public void setStatus(int s){
        status=s;
    }
//    public void setStatus2(int ss){ //blm diproses
//        status2=ss;
//    }
    public String getKode(){
        return kode;
    }
    public String getPembeli(){
        return pembeli;
    }
    public cMenu getMenu(){
        return menu;
    }
    public int getJumlah(){
        return jumlahMn;
    }
    public int getStatus(){
        return status;
    }
//    public int getStatus2(){ //blm diproses
//        return status2;
//    }
}
