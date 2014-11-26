package br.catolica.managedbean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.model.UploadedFile;

@ManagedBean
public class CarregaFoto {

	private UploadedFile foto;

	public UploadedFile getfoto() {
		return foto;
	}

	public void setfoto(UploadedFile foto) {
		this.foto = foto;
	}

	public void upload() {
		if (foto != null) {
			FacesMessage message = new FacesMessage("Foto carregada  com suceso ",
					foto.getFileName() + " is uploaded.");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}
}
