package trimestre2.OrientadaAObjetos.ProgramacionAvanzada;

import java.util.*;
class Fecha {
    public static void main(String[] args) {
        Date d = new Date();
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(d);
        System.out.print("La fecha actual es: "+c.get(Calendar.DAY_OF_MONTH));
        System.out.print(" – ");
        System.out.print(c.get(Calendar.MONTH) + 1);
        System.out.print(" - ");
        System.out.print(c.get(Calendar.YEAR));
    }
}