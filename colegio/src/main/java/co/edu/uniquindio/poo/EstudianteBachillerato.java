package co.edu.uniquindio.poo;

/**
 * Creación de clase EstudianteBachillerato que hereda de Estudiante
 */
public class EstudianteBachillerato extends Estudiante {

    private String tutor;

    /**
     * método constructor
     * @param builder
     */
    private EstudianteBachillerato(Builder builder) {
        super(builder);
        this.tutor = builder.tutor;
    }

    public String getTutor() {
        return tutor;
    }

    /**
     * Builder para EstudianteBachillerato
     */
    public static class Builder extends Estudiante.Builder<Builder> {
        private String tutor;

        public Builder setTutor(String tutor) {
            this.tutor = tutor;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public EstudianteBachillerato build() {
            return new EstudianteBachillerato(this);
        }
    }
}
