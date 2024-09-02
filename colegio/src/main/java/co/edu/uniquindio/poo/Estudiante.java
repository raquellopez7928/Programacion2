package co.edu.uniquindio.poo;

/**
 * Creación de la clase Estudiante
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String grado;

    /**
     * método constructor
     * @param builder
     */
    protected Estudiante(Builder<?> builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.grado = builder.grado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGrado() {
        return grado;
    }

    /**
     * Builder abstracto para la clase estudiante
     */
    public static abstract class Builder<T extends Builder<T>> {
        private String nombre;
        private int edad;
        private String grado;

        public T setNombre(String nombre) {
            this.nombre = nombre;
            return self();
        }

        public T setEdad(int edad) {
            this.edad = edad;
            return self();
        }

        public T setGrado(String grado) {
            this.grado = grado;
            return self();
        }

        /**
         * método que cada clase que cada clase que herede implementará
         * @return
         */
        protected abstract T self();

        /**
         * método build que crea al Estudiante
         * @return
         */
        public abstract Estudiante build();
    }
}

