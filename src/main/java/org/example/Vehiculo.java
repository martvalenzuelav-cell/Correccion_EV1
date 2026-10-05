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
        if(marca == null || marca.isEmpty() ) {
            throw new IllegalArgumentException("La marca no puede ser nula.");
        }
        this.marca = marca;
    }

    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(int anioDeFabricacion) {
        if(anioDeFabricacion < 1990 || anioDeFabricacion > 2026) {
            throw new IllegalArgumentException("El año de fabricación no puede ser menor a 1990 o más a 2026.");
        }
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public int getKilometraje() {

        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        if (kilometraje <= 0) {
            throw new IllegalArgumentException("El kilometraje debe ser un valor mayor a 0");
        }

        this.kilometraje = kilometraje;
    }



    }

