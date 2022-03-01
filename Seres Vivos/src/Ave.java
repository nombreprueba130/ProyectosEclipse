
public class Ave extends Animal {
    public Ave(){
        super();
    }
    public Ave(String sexo){
        super();
    }
    public Ave(String sexo,String tipo){
        super.setSexo(sexo);
        super.setTipo(tipo);
    }
    public void limpieza(){
        System.out.println("Limpiando");
    }
    public String toString(){
        String cadena="Sexo: "+super.getSexo()+"Tipo: "+super.getTipo();
        return cadena;
    }
    public void vuela(){
        System.out.println("Estoy volando");
    }
    
}
