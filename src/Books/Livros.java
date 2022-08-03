package Books;

public class Livros {
	private String titulo;
	private String autor;
	private String anoDePubli;
	private String generosoLitera;
	public Livros(String titulo, String autor, String anoDePubli, String generosoLitera) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePubli = anoDePubli;
		this.generosoLitera = generosoLitera;
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
	public String getAnoDePubli() {
		return anoDePubli;
	}
	public void setAnoDePubli(String anoDePubli) {
		this.anoDePubli = anoDePubli;
	}
	public String getGenerosoLitera() {
		return generosoLitera;
	}
	public void setGenerosoLitera(String generosoLitera) {
		this.generosoLitera = generosoLitera;
	}
	@Override
	public String toString() {
		return "Título [titulo=" + titulo + "\nAutor=" + autor + "\n Ano de Publicação = " + anoDePubli + "\nGênero ="
				+ generosoLitera + "]";
	}



}
