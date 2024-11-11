package org.example.demo123;

// se hereda de la clase Cuenta y define el atributo sobregiro
class Cuentacorriente extends Cuenta {
    private float sobregiro = 0.0f;

    // constructor
    public Cuentacorriente(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
    }

    // sobreescribe el metodo retirar y modifica para el sobregiro si retira una cantidad mayor a la que se tiene
    @Override
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            super.retirar(cantidad);
        } else {
            float diferencia = cantidad - saldo;
            sobregiro += diferencia;
            saldo = 0;
            nRetiros++;
        }
    }

    // sobreescribe el metodo depositar y se resta el sobregiro si se realizó anteriormente
    @Override
    public void depositar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
                cantidad = 0;
            }
        }
        super.depositar(cantidad);
    }

    // sobreescribe el metodo extractoMensual
    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    // sobreescribe el metodo imprimir y imprime el sobregiro
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor del sobregiro: " + sobregiro);
    }
}
