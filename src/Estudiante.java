public class Estudiante {

    private String matricula = "";
    private String cedula = "";
    private String nombre = "";

    private Materia materia1;
    private Materia materia2;
    private Materia materia3;

    public Estudiante(String nombre, String cedula, String matricula) {
        this.matricula = matricula;
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Estudiante(Materia materia1, Materia materia2, Materia materia3) {
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia getMateria1() {
        return materia1;
    }

    public void setMateria1(Materia materia1) {
        this.materia1 = materia1;
    }

    public Materia getMateria2() {
        return materia2;
    }

    public void setMateria2(Materia materia2) {
        this.materia2 = materia2;
    }

    public Materia getMateria3() {
        return materia3;
    }

    public void setMateria3(Materia materia3) {
        this.materia3 = materia3;
    }

    public void imprimirMaterias(){
        System.out.println("Las materias del alumno "+nombre+" son: "+materia1+ ", "+materia2+ ", "+materia3);
    }
}
