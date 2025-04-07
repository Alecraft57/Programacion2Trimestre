package trimestre2.OrientadaAObjetos.EntidadRelacio.Ejercicio2;

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
   public void setGrados(int grados){
       if (grados <= tempmax && grados >= tempmin)
           grados = grados;
   }
   public void subir() {
       if (grados + 1 <= tempmax)
           grados++;
   }
   public void bajar(){
       if(grados -1 >= tempmin)
           grados--;
   }
    public String toString(){
        return getNombre()+", temperatura maxima = "+getTempmax()+"º, "+" temperatura minima = "+getTempmin()+"º, grados actuales = "+getGrados()+"º";
    }
}
