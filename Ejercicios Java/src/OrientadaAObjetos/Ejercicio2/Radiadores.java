package OrientadaAObjetos.Ejercicio2;

public class Radiadores {
   private String nombre;
   private int tempmax;
   private int tempmin;
   private int grados;

   Radiadores(String nombre,int tempmax, int tempmin,int grados){
       this.nombre=nombre;
       this.tempmax=tempmax;
       this.tempmin=tempmin;
       this.grados=grados;
   }
   public String getNombre(){
       return nombre;
   }
   public int getTempmax(){
       return tempmax;
   }
   public int getTempmin(){
       return tempmin;
   }
   public int getGrados(){
       return grados;
   }
   public String subir(){
       int res= getGrados()+1;
       return "Has subido 1 grado "+res;
   }
   public String bajar(){
       int res=getGrados()-1;
       return "Has bajado 1 grado"+res;
   }
    public String toString(){
        return getNombre()+", temperatura maxima = "+getTempmax()+"º, "+" temperatura minima = "+getTempmin()+"º, grados actuales = "+getGrados()+"º";
    }
}
