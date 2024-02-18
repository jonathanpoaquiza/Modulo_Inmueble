package Inmueble_Privado;
import Inmueble.Inmueble;

public abstract class InmueblePrivado extends Inmueble{

    protected double dimensiones;
    protected String ubicacion;
    protected double alicuota;

    public InmueblePrivado(double dimensiones, String ubicacion, double alicuota) {
        this.dimensiones = dimensiones;
        this.ubicacion = ubicacion;
        this.alicuota = alicuota;
    }


    @Override
    public String toString() {
        return "InmueblePrivado " +
                "dimensiones: " + dimensiones +
                ", ubicacion: " + ubicacion +
                ", alicuota: " + alicuota;
    }
}
