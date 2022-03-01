
public class Tigre extends Animal {
   String raza;
    public Tigre(){
        raza="albina";
    }
    public Tigre(String raza){
        this.raza=raza;
    }
    public Tigre(String raza,String sexo, String tipo){
        this.raza=raza;
       super.setSexo(sexo);
        super.setTipo(tipo);
    }
    public void come(String come){
        System.out.println("Esta comiendo");
    }
    public void sonido(){
        System.out.println("Arrrrrrrrr");
    }
    public String toString(){
        String cadena="";
        return cadena;
    }
}
