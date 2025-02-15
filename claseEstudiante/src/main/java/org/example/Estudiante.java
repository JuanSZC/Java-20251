package org.example;


public class Estudiante {
    private String id;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private int edad;


    public Estudiante(String id, String nombres, String apellidos, String correo, String telefono, int edad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
    }


    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombres + " " + apellidos);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
    }
}

