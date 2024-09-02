package co.edu.uniquindio.poo;

/**
 * Creación de clase EstudiantePrimaria que hereda de Estudiante
 */
public class EstudiantePrimaria extends Estudiante {

    private String profesor;

    /**
     * método constructor
     * @param builder
     */
    private EstudiantePrimaria(Builder builder) {
        super(builder);
        this.profesor = builder.profesor;
    }

    public String getProfesor() {
        return profesor;
    }

    /**
     * Builder para EstudiantePrimaria
     */
    public static class Builder extends Estudiante.Builder<Builder> {
        private String profesor;

        public Builder setProfesor(String profesor) {
            this.profesor = profesor;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public EstudiantePrimaria build() {
            return new EstudiantePrimaria(this);
        }
    }
}

