package principal;

public class Livro {
	private String titulo;
	private String autor;
	
	public Livro() {}
	
	
	
	public Livro(String titulo, String autor) {
		setTitulo(titulo);
		setAutor(autor);
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



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [titulo=");
		builder.append(titulo.toString());
		builder.append(", autor=");
		builder.append(autor.toString());
		builder.append("]");
		return builder.toString();
	}
}
