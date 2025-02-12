package OrientadaAObjetos.EntidadRelacio.Ejercicio8;

public class Dado {
   public int dado1;
   public int dado2;
   public int dado3;

   public Dado(){
       this.roll();
   }


    public void roll(){
       dado1 = (int)(Math.random()*6) + 1;
       dado2 = (int)(Math.random()*6) + 1;
       dado3 = (int)(Math.random()*6) + 1;
   }


} // end class PairOfDice
