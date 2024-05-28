package com.ucentral.Tarjeta_Credito;

public class Clientes {
    private String nombre;
    private String numeroTelefonico;
    private String correo;
    private String direccion;
    private String historialBancario;
    private String certificados;

    // Constructor con todos los campos
    public Clientes(String nombre, String numeroTelefonico, String correo, String direccion, String historialBancario, String certificados) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.correo = correo;
        this.direccion = direccion;
        this.historialBancario = historialBancario;
        this.certificados = certificados;
    }


    public Clientes(String nombre, String numeroTelefonico, String correo) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.correo = correo;
    }

    public void solicitarTarjetaCredito() {
        // Aquí se almacenan los datos del cliente para su solicitud de tarjeta de crédito
        // Este es un método simulado, deberías implementar la lógica de almacenamiento según tu necesidad
        System.out.println("Solicitud de tarjeta de crédito para " + this.nombre + " ha sido recibida.");
    }
}