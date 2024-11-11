package org.example.demo123;
import java.util.Scanner;

// definir atributos y inicializar en 0 las variables predispuestas
class Cuenta {
    protected float saldo;
    protected int nConsignaciones = 0;
    protected int nRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0.0f;

    // generar constructor que inicia saldo y la tasa anual
    public Cuenta(float saldoInicial, float tasaAnual) {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual;
    }

    // metodo para el depósito
    public void depositar(float cantidad) {
        saldo += cantidad;
        nConsignaciones++;
    }

    // metodo para retirar
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            nRetiros++;
        } else {
            System.out.println("No se puede retirar, el saldo es insuficiente");
        }
    }

    // metodo para el cálculo de interes mensual
    public void calcularInteresMensual() {
        float interesMensual = (tasaAnual / 12) / 100 * saldo;
        saldo += interesMensual;
    }

    // metodo para el cálculo de extracto mensual
    public void extractoMensual() {
        calcularInteresMensual();
        saldo -= comisionMensual;
        comisionMensual = 0;
    }

    // imprimir
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Número de consignaciones: " + nConsignaciones);
        System.out.println("Número de retiros: " + nRetiros);
    }
}
