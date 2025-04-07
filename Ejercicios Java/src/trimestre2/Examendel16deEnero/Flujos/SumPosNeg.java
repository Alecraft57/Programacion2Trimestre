package trimestre2.Examendel16deEnero.Flujos;
import java.util.ArrayList;
import java.util.List;
public class SumPosNeg {
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();
        int contaodorpos=0;
        int contadorneg=0;
        numeros.add("2");
        numeros.add("30");
        numeros.add("-1");
        int suma = numeros.stream()
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println(contadorneg+" Negativos y "+contaodorpos+" positivos");
    }
}
