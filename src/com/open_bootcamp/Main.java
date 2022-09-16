package com.open_bootcamp;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNombre("Raul");
        cliente.setEdad(23);
        cliente.setTelefono(381457388);
        cliente.setCredito(50000);

        System.out.println("Nombre cliente: "+cliente.getNombre());
        System.out.println("Edad cliente: "+cliente.getEdad());
        System.out.println("Telefono cliente: "+cliente.getTelefono());
        System.out.println("Credito cliente: "+cliente.getCredito());

        Trabajador trabajador = new Trabajador();

        trabajador.setNombre("Juan");
        trabajador.setEdad(27);
        trabajador.setTelefono(381453698);
        trabajador.setSalario(155000);

        System.out.println("Nombre trabajador: "+trabajador.getNombre());
        System.out.println("Edad trabajador: "+trabajador.getEdad());
        System.out.println("Telefono trabajador: "+trabajador.getTelefono());
        System.out.println("Credito trabajador: "+trabajador.getSalario());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito){
        this.credito=credito;
    }
    public int getCredito(){
        return credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public void setSalario(int salario){
        this.salario=salario;
    }
    public int getSalario(){
        return salario;
    }
}