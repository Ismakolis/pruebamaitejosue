package org.example.demo123;

// hereda de la clase Cuenta
class Cuentaahorros extends Cuenta {
    private boolean activa;

    // constructor
    public Cuentaahorros(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        activa = saldo >= 100;
    }

    // sobreescribe el metodo depositar de la clase Cuenta
    @Override
    public void depositar(float cantidad) {
        if (activa) {
            super.depositar(cantidad);
        } else {
            System.out.println("La cuenta está inactiva, no se puede depositar.");
        }
        activa = saldo >= 100;
    }

    // sobreescribe el metodo retirar de la clase Cuenta
    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("La cuenta esta inactiva, no se puede retirar.");
        }
        activa = saldo >= 100;
    }

    // sobreescribe el metodo extractoMensual de la clase Cuenta
    @Override
    public void extractoMensual() {
        int cargosAdicionales = Math.max(0, nRetiros - 4);
        comisionMensual += cargosAdicionales;
        super.extractoMensual();
        activa = saldo >= 100;
    }
}
