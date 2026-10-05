package org.example;

//Definir la clase
public abstract class Vehiculo {
    //Definir los atributos de identificación
    protected String marca;
    protected int anioDeFabricacion;
    //Definir los atributos de estado
    protected int kilometraje;

    //Definir el contructor
    public Vehiculo(String marca, int anioDeFabricacion, int kilometraje) {
        this.marca = marca;
        this.anioDeFabricacion = anioDeFabricacion;
        this.kilometraje = kilometraje;
    }

    // Definimos las entradas y salidas de datos

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca == null) {

        }
        this.marca = marca;
    }

    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(int anioDeFabricacion) {
        if(anioDeFabricacion < 1990 || anioDeFabricacion > 2026) {
            return
        }
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public int getKilometraje() {
        if (kilometraje <= 0) {
            return
        }
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
}
