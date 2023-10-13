// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Estudiante est1 = new Estudiante("Guille", "1724009806", "12345");
        est1.imprimirDatosEstudiante();
        System.out.println("--------------------------------------------------------------");

        Profesor profesor1 = new Profesor("Carlos", "1234567890", "5555");
        Profesor profesor2 = new Profesor("Edison", "0987654321", "4444");

        Materia materia1 = new Materia("Programacion", "1111", 5, profesor1);
        materia1.imprimirInfoMateria();
        materia1.setProfesor(profesor1);
        materia1.getProfesor().imprimirDatosProfesor();
        System.out.println("--------------------------------------------------------------");

        Materia materia2 = new Materia("EDO", "2222", 3, profesor2);
        materia2.imprimirInfoMateria();
        materia2.setProfesor(profesor2);
        materia2.getProfesor().imprimirDatosProfesor();
        System.out.println("--------------------------------------------------------------");
        Materia materia3 = new Materia("Historia", "3333", 2, profesor1);
        materia3.imprimirInfoMateria();
        materia3.setProfesor(profesor1);
        materia3.getProfesor().imprimirDatosProfesor();
        System.out.println("--------------------------------------------------------------");

    }
}