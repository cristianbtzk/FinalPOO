package principal;

public class Professor extends Pessoa{
	private String formacao;
	
	public Professor(String nome, String formacao) {
		super(nome);
		setFormacao(formacao);
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [formacao=");
		builder.append(formacao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
