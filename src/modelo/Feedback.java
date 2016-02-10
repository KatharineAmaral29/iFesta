package modelo;

public class Feedback {
	private float nota;
	private String comentario = new String();
	private int id_servico_avaliado;
	private int id_cliente_avaliador;
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public int getId_servico_avaliado() {
		return id_servico_avaliado;
	}
	public void setId_servico_avaliado(int id_servico_avaliado) {
		this.id_servico_avaliado = id_servico_avaliado;
	}
	public int getId_cliente_avaliador() {
		return id_cliente_avaliador;
	}
	public void setId_cliente_avaliador(int id_cliente_avaliador) {
		this.id_cliente_avaliador = id_cliente_avaliador;
	}
	
	

}
