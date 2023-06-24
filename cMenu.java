package BismillahLancar;
public class cMenu {
    String nama;
    int harga;private double totalP;
    cMenu(String n, int h){
        nama=n; harga=h;
    }
    public void setharga (int h){
        harga=h;
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
     public void setPemasukan (double t){
          totalP=totalP+t ;
     }
     public double getPemasukan (){
        return totalP ;
     }
}
