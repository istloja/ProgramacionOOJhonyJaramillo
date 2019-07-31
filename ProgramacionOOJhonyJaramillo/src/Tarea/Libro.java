package Tarea;

public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas + '}';
    }
    

    public static void main(String[] args) {
        	Libro l1 = new Libro(66273737, "ecuaciones", "larson", 500);
		Libro l2 = new Libro(58585858,"el camino del amor","nicholas Spark",300);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
        if (l1.getNumeroDePaginas() > l2.getNumeroDePaginas()) {
            System.out.println("El libro " + l1.getTitulo() + " tiene mas numeros de paginas que el libro " + l2.getTitulo());
        } else {
            System.out.println("El libro " + l2.getTitulo() + " tiene mas numeros de paginas que el libro " + l1.getTitulo());
        }
    }
}
