package Examendel16deEnero.InterfazComparable;

public class Human implements Comparable<Human>{
    private String name;
    private int salario;

    public Human(String name, int salario) {
        this.name = name;
        this.salario = salario;
    }

    public String getName() {
        return this.name;
    }

    public int getSalario() {
        return this.salario;
    }

    public String toString() {
        return this.getName() + " (" + this.getSalario() + ")";
    }
    public int compareTo(Human personas) {
        if (this.salario == personas.getSalario()){
            return 0;
        }else if(this.salario>personas.getSalario()) {
            return 1;
        }else{
            return -1;
        }
    }
}
