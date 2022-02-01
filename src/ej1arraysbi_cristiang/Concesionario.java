package ej1arraysbi_cristiang;

import textoandnumeros.Utilidad;

public class Concesionario {

    Modelo[] modelos;
    String[] tipos;
    float[] limites;
    float[][] beneficios;

    public void inicilizar() {
        tipos = new String[]{
            new String("Turismo"),
            new String("Depostivo"),
            new String("Todo Terreno")
        };
        limites = new float[]{15000f, 30000f, 50000f, 100000f, Float.MAX_VALUE};
        beneficios = new float[][]{
            {0.15f, 0.10f, 0.10f, 0.18f, 0.06f},//Primera fila
            {0.18f, 0.12f, 0.14f, 0.2f, 0.08f},//Segunda fila
            {0.21f, 0.14f, 0.16f, 0.22f, 0.1f}//Tercera fila
        };
    }

    public Concesionario() {
        inicilizar();
        modelos = new Modelo[15];
    }

    public Concesionario(int numModelos) {
        inicilizar();
        modelos = new Modelo[numModelos];
    }

    public void crear() {
        for (int pos = 0; pos < modelos.length; pos++) {
            modelos[pos] = new Modelo();
        }
    }

    public void pedirDatos() {
        int tipo = 0;
        String nombre;

        for (int nmodelo = 0; nmodelo < modelos.length; nmodelo++) {
            nombre = Utilidad.pedirString("Nombre del modelo: ");
            menu();
            tipo = Utilidad.pedirNumeroEntero("Introduce un tipo: ", 0, tipos.length - 1);
            modelos[nmodelo].grabar(nombre,tipo);
        }
    }

    private void menu() {
        for (int tipo = 0; tipo < tipos.length; tipo++) {
            System.out.println(tipo + "---->" + tipos[tipo]);
        }
    }

}
