package actividad_02_ud3_ed;

/**
 * @author rbuegar928
 * @version 1.0
 */
public class CCuenta {
    
    protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    public CCuenta() {
    }

    /**
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * @param nom Nombre del titular
     */
    public void asignarNombre(String nom) {
        nombre = nom;
    }

    /**
     * @return Nombre del titular
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * @return Saldo disponible
     */
    public double estado() {
        return saldo;
    }

    /**
     * @throws Exception si la cantidad que decimos es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(saldo + cantidad);
    }

    /**
     * @throws Exception si la cantidad es negativa o no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        setSaldo(saldo - cantidad);
    }

    /**
     * @return Número de cuenta
     */
    public String obtenerCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta Nuevo número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @param saldo Nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return Tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés Nuevo tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}