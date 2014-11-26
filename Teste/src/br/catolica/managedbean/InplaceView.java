package br.catolica.managedbean;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
@ManagedBean
	public class InplaceView implements Serializable {
	     
	  
	    private String nome = "Nome";
	    private String email="Email";
	    private String fone="telefone";
	    private String face="facebbok";
	    private String gmais="Google+";
	    
	 
	    public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getFone() {
			return fone;
		}

		public void setFone(String fone) {
			this.fone = fone;
		}

		public String getFace() {
			return face;
		}

		public void setFace(String face) {
			this.face = face;
		}

		public String getGmais() {
			return gmais;
		}

		public void setGmais(String gmais) {
			this.gmais = gmais;
		}

		

}
