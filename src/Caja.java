public class Caja {

    public static void main(String[] args) {
        int ancho = 18;
        int alto = 2;
        int profundo = 6;
        
        VolumenCaja caja = new VolumenCaja(ancho,alto,profundo);
        
        caja.volumen();
     
    }
    
}
