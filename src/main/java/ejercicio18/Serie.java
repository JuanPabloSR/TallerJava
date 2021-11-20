package ejercicio18;

public class Serie implements Entregable {
    /**
     * clase serie con sus atributos
     */
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this.numeroTemporadas = 3;  /* valores por defecto */
        this.entregado = false;
    }

    public Serie(String titulo, String creador) {   /** constructor titulo y creador */
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = 3;
        this.entregado = false;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {   /** constructor para todo menos entregado */
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }

    /**
     * get and set excepto entregado
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setnumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo='" + titulo + '\'' + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado + ", genero='" + genero + '\'' + ", creador='" + creador + '\'' + '}';
    }


    @Override
    public void Entregar() {
        this.entregado = true;
    }

    @Override
    public void Devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        return 0;
    }
}
