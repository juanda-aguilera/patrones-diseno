public class ConfiguracionNomina {
    // Única instancia de la clase (Singleton)
    private static ConfiguracionNomina instancia;

    private double porcentajeSalud = 0.04;

    // Constructor privado: impide crear instancias con "new" desde fuera
    private ConfiguracionNomina() {
    }

    // Punto de acceso global a la única instancia
    public static synchronized ConfiguracionNomina getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionNomina();
        }
        return instancia;
    }

    public double getPorcentajeSalud() {
        return porcentajeSalud;
    }

    public void setPorcentajeSalud(double porcentajeSalud) {
        this.porcentajeSalud = porcentajeSalud;
    }
}
