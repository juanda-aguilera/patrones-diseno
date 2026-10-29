// Creator del patrón Factory Method.
// Declara el método fábrica que las subclases deben implementar.
public abstract class EmpleadoCreator {

    // Factory Method: cada creador concreto decide qué Empleado instanciar
    public abstract Empleado crearEmpleado(String[] datos);
}
