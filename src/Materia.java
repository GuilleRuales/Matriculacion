public class Materia {
    private String nombre = "";
    private String codigo = "";
    private int numHoras = 0;
    private Profesor profesor;


    public Materia(String nombre, String codigo, int numHoras, Profesor profesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numHoras = numHoras;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }


    public void imprimirInfoMateria(){
        System.out.println("La materia es: "+nombre);
        System.out.println("El codigo es: "+codigo);
        System.out.println("El numero de horas es: "+numHoras);
        //System.out.println("Los profesores son: "+profesor);
    }
}
