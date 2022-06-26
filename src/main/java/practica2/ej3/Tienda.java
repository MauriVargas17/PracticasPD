package practica2.ej3;


import java.util.ArrayList;
import java.util.List;

public class Tienda {
    Celular[] inventario;
    IAlgoritmo tipoBusqueda;
    int pesoDeBusqueda = 6;

    public Tienda(Celular[] inventario) {
        this.inventario = inventario;
    }

    public void showIterateFiltered(List<Celular> filtro) {
        for(Celular c: filtro){
            System.out.println(c.getModelo()+" "+c.getPrecio()+" "+c.getYear());
        }
    }

    public void buscarCelular(String modelo){
        List<Celular> filtro = tipoBusqueda.execute(modelo, inventario);
        showIterateFiltered(filtro);
    }

    public void buscarCelular(int precio){
        List<Celular> filtro = tipoBusqueda.execute(precio, inventario);
        showIterateFiltered(filtro);
    }

    public void buscarCelular(String modelo, int precio){
        List<Object> t = new ArrayList<>();
        t.add(modelo); t.add(precio);
        List<Celular> filtro = tipoBusqueda.execute(t, inventario);
        showIterateFiltered(filtro);
    }

    public IAlgoritmo getTipoBusqueda() {
        return tipoBusqueda;
    }

    public void setTipoBusqueda(IAlgoritmo tipoBusqueda) {
        this.tipoBusqueda = tipoBusqueda;
    }

    public Celular[] getInventario() {
        return inventario;
    }

    public void setInventario(Celular[] inventario) {
        this.inventario = inventario;
        if (inventario.length > 6){
            setTipoBusqueda(new BusquedaPesada());
        } else {
            setTipoBusqueda(new BusquedaLigera());
        }
    }
}
