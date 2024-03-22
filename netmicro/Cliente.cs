public class Cliente
{
    public Cliente(int codigo, string nombres, string identificacion, string direccion, string perfil){
        this.codigo = codigo;
        this.nombres = nombres;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.perfil = perfil;
    }

    public int codigo{get;set;}
    public string nombres{get;set;}
    public string identificacion{get;set;}
    public string direccion{get;set;}
    public string perfil{get;set;}
}