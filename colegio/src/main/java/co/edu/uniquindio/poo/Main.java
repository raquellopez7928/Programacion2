package co.edu.uniquindio.poo;

public class Main {
        public static void main(String[] args) {
            // Crear un alumno de primaria
            EstudiantePrimaria estudiantePrimaria = new EstudiantePrimaria.Builder()
                .setNombre("Miguel")
                .setEdad(7)
                .setGrado("1ro Primaria")
                .setProfesor("Luisa")
                .build();
    
            // Crear un alumno de secundaria
            EstudianteBachillerato estudianteBachillerato = new EstudianteBachillerato.Builder()
                .setNombre("Vanesa")
                .setEdad(14)
                .setGrado("7mo")
                .setTutor("Mauricio")
                .build();
    
            // Mostrar información de los alumnos
            System.out.println("Estudiante de Primaria: " + estudiantePrimaria.getNombre() + 
                               ", Profesor: " + estudiantePrimaria.getProfesor());
            System.out.println("Estudiante de Bachillerato: " + estudianteBachillerato.getNombre() + 
                               ", Tutor: " + estudianteBachillerato.getTutor());
        }
    }

