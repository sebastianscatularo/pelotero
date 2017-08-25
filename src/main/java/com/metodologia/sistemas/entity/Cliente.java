package com.metodologia.sistemas.entity;



public class Cliente {

    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String email;
    private String CUIL;
    private String otraInformacion;
    private String celular;
    private static int id = 1;

    public Cliente(String nombre, String apellido, String telefono,
                   String direccion, String email, String CUIL,
                   String otraInformacion, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.CUIL = CUIL;
        this.otraInformacion = otraInformacion;
        this.celular = celular;
    }

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Cliente.id = id;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCUIL() {
        return CUIL;
    }

    public void setCUIL(String CUIL) {
        this.CUIL = CUIL;
    }

    public String getOtraInformacion() {
        return otraInformacion;
    }

    public void setOtraInformacion(String otraInformacion) {
        this.otraInformacion = otraInformacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        if (nombre != null ? !nombre.equals(cliente.nombre) : cliente.nombre != null) return false;
        if (apellido != null ? !apellido.equals(cliente.apellido) : cliente.apellido != null) return false;
        if (telefono != null ? !telefono.equals(cliente.telefono) : cliente.telefono != null) return false;
        if (direccion != null ? !direccion.equals(cliente.direccion) : cliente.direccion != null) return false;
        if (email != null ? !email.equals(cliente.email) : cliente.email != null) return false;
        if (CUIL != null ? !CUIL.equals(cliente.CUIL) : cliente.CUIL != null) return false;
        if (otraInformacion != null ? !otraInformacion.equals(cliente.otraInformacion) : cliente.otraInformacion != null)
            return false;
        return celular != null ? celular.equals(cliente.celular) : cliente.celular == null;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (CUIL != null ? CUIL.hashCode() : 0);
        result = 31 * result + (otraInformacion != null ? otraInformacion.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", CUIL='" + CUIL + '\'' +
                ", otraInformacion='" + otraInformacion + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }
}
