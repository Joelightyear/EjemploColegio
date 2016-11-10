package ejemplocolegio;

import java.util.ArrayList;

public class EjemploColegio {

    static ArrayList<Persona> personas = new ArrayList<>();

    public static void rellenarDatos() {

        Alumno alum;
        Profesor prof;
        ProfesorInterino profi;
        Persona pers;

        for (int i = 0; i < 10; i++) {
            alum = new Alumno();
            alum.setNombre("Alumno " + i);
            alum.setEdad(8 + i);
            personas.add(alum);
        }
        for (int j = 0; j < 10; j++) {
            prof = new Profesor();
            prof.setNombre("Profesor " + j);
            prof.setEdad(40 + j);
            prof.setEspecialidad("Especialidad " + j);
            personas.add(prof);
        }
        for (int pi = 0; pi < 10; pi++) {
            profi = new ProfesorInterino();
            profi.setNombre("Profesor Interino " + pi);
            profi.setEdad(43 + pi);
            profi.setEspecialidad("Especialidad Interino " + pi);
            profi.setPuntos(20 + pi);
            personas.add(profi);
        }

    }

    public static void mostrarProfesorMasViejo() {

        int MaxEdad = 0;
        Profesor personaEdadMaxima = null;

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i) instanceof Profesor) {
                if (MaxEdad < personas.get(i).getEdad()) {
                    MaxEdad = personas.get(i).getEdad();
                    personaEdadMaxima = (Profesor) personas.get(i);
                }
            }
        } 
        System.out.println("El " + personaEdadMaxima.getNombre() + " tiene " + MaxEdad + " años");

    }

    public static void cambiarEspecialidad(Profesor p, String especialidad) {
        p.setEspecialidad(especialidad);
        
    }

    public static void mostrarAlumnoMasJoven() {

        int MinEdad = 100;
        Alumno personaEdadMinima = null;

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i) instanceof Alumno) {
                if (MinEdad > personas.get(i).getEdad()) {
                    MinEdad = personas.get(i).getEdad();
                    personaEdadMinima = (Alumno) personas.get(i);
                }
            }
        } 
        System.out.println(MinEdad);
    }

    public static void main(String[] args) {

        rellenarDatos();

        //mostrarProfesorMasViejo();
        Profesor prof = null;
        //Primer profesor que me encuentre
        int i = 0;
        int encontrado = 0;
        while ( (i < personas.size()) && (encontrado == 0)){
            if (personas.get(i) instanceof Profesor){
                encontrado = 1;
                prof = (Profesor) personas.get(i);
            }
        }
        cambiarEspecialidad(prof,"OTRA ESPECIALIDAD");
        //mostrarAlumnoMasJoven();
    }

}
