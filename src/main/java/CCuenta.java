/**
 *
 * @author Iana Markarova
 */
public class CCuenta {

    /**
     * atributos de la clase CCuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    //encapsulando los cuatro atributos de la clase CCuenta, creando los
    //getters y setters correspondientes
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Un constructor sin parametros para la clase CCuenta
     */
    public CCuenta()
    {
    }
    
    /**
     * Un constructor con parametros para la clase CCuenta
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Un método que devuelve el saldo de la cuenta
     * @return 
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Un método para hacer una ingreso en la cuenta. Primero se comprueba
     * que la cantidad no sea negativa
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Un método para hacer un retirada de la cuenta. Primero se comprueba
     * que la cantidad no sea negativa y que haya sufieciento saldo en la cuenta
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
