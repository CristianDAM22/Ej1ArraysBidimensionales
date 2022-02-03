package ej1arraysbi_cristiang;

//Las ventas son de un modelo por eso ventas trimestre va en esta clase

public class Modelo {

    private String nombre;
    private int tipo;
    private float[] ventas;

    public Modelo() {
        ventas = new float[6];
    }

    public Modelo(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        ventas = new float[6];
    }

    /*
      public Modelo(int nelementos) {
        ventas=new float[nelementos];
    }
     */
    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public float[] getVentas() {
        return ventas;
    }

    public float getUnaVenta(int mes) {
        return ventas[mes];
    }

    public void grabar(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void setVentas(float[] ventas) {
        this.ventas = ventas;
    }

    public void setUnaVenta(float venta, int mes) {
        ventas[mes] = venta;
    }

    public float ventasTrimestre(int valor) {//VALOR ES EL MES EN EL QUE QIERO EMPEZAR
        float total = 0;
        int finalt = valor + 3;
        for (int mes = valor; mes < finalt; mes++) {
            total = total + ventas[mes];
        }
        return total;

    }
}
