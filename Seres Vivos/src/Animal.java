

public class Animal {
	   private String sexo;
	    private String tipo;
	    
	    public Animal(){
	        sexo="Hembra";
	        tipo="Carnivoro";
	    }
	    public Animal(String sexo){
	        this.sexo=sexo;
	    }
	    public Animal(String sexo,String tipo){
	        this.sexo=sexo;
	        this.tipo=tipo;
	    }
	    protected void come(){
	        System.out.println("Ñam Ñam");
	    }
	    protected void duerme(){
	        System.out.println("Zzz...");
	    }
	    public String getSexo(){
	        return sexo;
	    }
	    public String getTipo(){
	        return tipo;
	    }
	    public void meArrasco(){
	        System.out.println("Me estoy rascando");
	    }
	    public void setSexo(String sexo){
	        this.sexo=sexo;
	    }
	    public void setTipo(String tipo){
	        this.tipo=tipo;
	    }
	    public String toString(){
	        String cadena="tipo:"+tipo+"\nsexo: "+sexo;
	        return cadena;
	    }
}
