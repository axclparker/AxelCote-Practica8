abstract class Figura {
    public abstract void dibuja();
    public abstract double calculaArea();
}

class Circulo extends Figura {
    private double radio;
    public Circulo(double radio) {
        setRadio(radio);
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public void dibuja() {
        System.out.println("Mas adelante usara graficos en java");
    }

    @Override
    public double calculaArea() {
        return Math.PI * getRadio() * getRadio();
    }
}

class Cilindro extends Circulo{
    private double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        setAltura(altura);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public void dibuja() {
        System.out.println("Cilindro abstracto");
    }

    @Override
    public double calculaArea() {
        double areaCirculo = super.calculaArea();
        double areaLateral = 2 * Math.PI * getRadio() * getAltura();
        return 2 * areaCirculo + areaLateral;
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Figura circulo = new Circulo(7.0);
        Figura cilindro = new Cilindro(4.0, 9.0);

        dibujaCalcula(circulo);
        dibujaCalcula(cilindro);
    }

    public static void dibujaCalcula( Figura figura) {
        figura.dibuja();
        double area = figura.calculaArea();
        System.out.println("area: " + area);
    }
}
