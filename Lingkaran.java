public class Lingkaran extends BangunDatar {
    float jari_jari;
    
    public Lingkaran(float jari_jari) {
       this.jari_jari = jari_jari;
    }
    
    
    float getLuas(){
        return (float)Math.PI * jari_jari * jari_jari;
    }
    
}
