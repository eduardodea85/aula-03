
package aula02;

/**
 *
 * @author eduar
 */
public class Aula02 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true;
        c1.status();
        c1.destampar();
        c1.rabiscar(); 
    }
    
}
