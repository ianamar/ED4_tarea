/**
 *
 * @author Iana Markarova
 */
public class Main {

    public static void main(String[] args) {
        
        //inicialización del método operativa_cuenta
        operativa_cuenta();
    }

    //creando el método operativa_cuenta que englobe las sentencias 
    //de la clase Main que operan con el objeto cuenta1
    
    public static void operativa_cuenta() {
        
        CCuenta cuenta1;
        double saldoActual;
        float cantidad; //Añadiendo un nuevo parámetro de nombre cantidad y de tipo float
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}