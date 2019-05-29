package br.edu.usj.ads;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BeanCalculadora {
    
    private int a, b, resultado;
    private String op;
    
    public String efetuarCalc(){
        if("+".equals(op)){
            resultado = a + b;
        }
        else if("-".equals(op)){
            resultado = a - b;
        }
        else if("*".equals(op)){
            resultado = a * b;
        }
        else if("/".equals(op)){
            resultado = a / b;
        }
        else{
            resultado = 0;
        }
        return "resultado";
    }

    public String somar(){
        resultado = a + b;
        return "resultado";
    }
    
    public String subtrair(){
        resultado = a - b;
        return "resultado";
    }
    
    public String multiplicar(){
        resultado = a * b;
        return "resultado";
    }
    
    public String dividir(){
        resultado = a / b;
        return "resultado";
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
}