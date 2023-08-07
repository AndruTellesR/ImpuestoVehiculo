
public class Vehiculo
{
    private String marca;
    private String linea;
    private String modelo;
    private Double precio;
    //Constructores.
    public Vehiculo(){}
    public void Vehiculo(String marca, String linea, String modelo, Double precio)
    {
     this.marca=marca;
     this.linea=linea;
     this.modelo=modelo;
     this.precio=precio;
    }
    //Getters and Setters.
    public void setMarca (String marca){this.marca=marca;}
    public String getMarca (){return marca;}
    
    public void setLinea (String linea){this.linea=linea;}
    public String getLinea (){return linea;}
    
    public void setModelo (String modelo){this.modelo=modelo;}
    public String getModelo (){return modelo;}
    
    public void setPrecio (Double precio){this.precio=precio;}
    public Double getPrecio (){return precio;}
    
    /*Metodos.
    
    public Double ImpuestoAnual(){
     
    }
*/
}
