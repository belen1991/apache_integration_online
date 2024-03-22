package org.apache.camel.learn;

public class Cliente {
    private int codigo;
    private String identificacion;
    private String nombres;
    private String direccion;
	private String perfil;
    
	public Cliente(int codigo, String identificacion, String nombres, String direccion, String perfil) {
		this.codigo = codigo;
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.direccion = direccion;
		this.perfil = perfil;
	}
    
	public Cliente() {
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPerfil() { 
		return perfil; 
	}
    public void setPerfil(String perfil) { 
		this.perfil = perfil; 
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", identificacion=" + identificacion + ", nombres=" + nombres
				+ ", direccion=" + direccion + ", perfil=" + perfil + "]";
	}

}
