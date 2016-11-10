
package ejemplocolegio;


public abstract class Persona {
    
    private String nombre;
    private int edad;
    private Profesor profesor;
    private Alumno alumno;
    private ProfesorInterino profesorinterino;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ProfesorInterino getProfesorinterino() {
        return profesorinterino;
    }

    public void setProfesorinterino(ProfesorInterino profesorinterino) {
        this.profesorinterino = profesorinterino;
    }

}
