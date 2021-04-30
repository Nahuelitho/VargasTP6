package tp6;

public class Tp6 {

   
    public static void main(String[] args) {
        Directorio directorio = new Directorio();
        Cliente cliente1= new Cliente ("Nahuel1","Vargas1","La Punta 4/02","La toma",123);
        Cliente cliente2= new Cliente ("Nahuel2","Vargas2","La Punta 4/02","Merlo",41272923);
        Cliente cliente3= new Cliente ("Nahuel3","Vargas3","La Punta 4/02","La punta",41272923);
        Cliente cliente4= new Cliente ("Nahuel4","Vargas4","La Punta 4/02","La punta",41272923);
        directorio.agregarCliente(266462251, cliente1);
        directorio.agregarCliente(266562251, cliente2);
        directorio.agregarCliente(266662251, cliente3);
        directorio.agregarCliente(266762251, cliente4);
        directorio.buscarCliente(266462251);
        directorio.listar();
        directorio.borrarCliente(123);
        directorio.buscarCliente(266462251);
        directorio.listar();
        directorio.buscarCliente("La punta");
    }
    
}
