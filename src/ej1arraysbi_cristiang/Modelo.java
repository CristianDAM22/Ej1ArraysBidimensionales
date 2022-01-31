package ej1arraysbi_cristiang;

public class Modelo {

    private String nombre;
    private int tipo;
    private float[] ventas;

    public Modelo(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        ventas = new float[6];//6:Porque son dos meses;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public float[] getVentas() {
        return ventas;
    }

    public float getUnaVenta(int mes) {//Venta por cada mes
        return ventas[mes];
    }

    public void setVentas(float[] ventas) {
        this.ventas = ventas;
    }

    public void setVentas(float venta, int mes) {
        ventas[mes] = venta;
    }

    public float ventasalTrimestre() {
        float total = 0;
        for (int mes = 0; mes < 3; mes++) {
            total = total + ventas[mes];
        }
        return total;
    }
    public float ventasalTrimestre(int valor) {
        float total = 0;
        int finalt=valor+3;
        for (int mes = valor; mes < finalt; mes++) {
            total = total + ventas[mes];
        }
        return total;
    }
    

}
