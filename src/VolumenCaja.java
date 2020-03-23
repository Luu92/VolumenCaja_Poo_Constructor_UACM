public class VolumenCaja {
 int a;
 int b;
 int c;
    VolumenCaja(){
        System.out.println("Constructor vacio");
    }
    
    VolumenCaja(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public void volumen(){
       int volumen = this.a*this.b*this.c;
        System.out.println("El volumen es: " + volumen);
    }
    
}
