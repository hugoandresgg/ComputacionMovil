package com.example.crudandroid.model;

public class Empleado {
    private Long id;

    private String user;

    private String password;

    private String email;

    public Empleado(){

    }

    public Empleado(Long id, String user, String password, String email){
        this.id = id;
        this.user = user;
        this.password = password;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return user;
    }

    public void setNombre(String nombre) {
        this.user = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Empleado{"+
                "id="+id+
                ", nombre='"+user+'\''+
                ", password='"+password+'\''+
                ", email='"+email+'\''+
                "}";
    }
}
