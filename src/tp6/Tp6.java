package tp6;

public class Tp6 {

   
    public static void main(String[] args) {
        Directorio directorio = new Directorio();
        Cliente cliente1= new Cliente ("Ramon","Castillo","La jarilla","La toma",19345678);
        Cliente cliente2= new Cliente ("Claudio","Gonzale<","La Alameda","Merlo",41272923);
        Cliente cliente3= new Cliente ("Romina","Miranda","El Sauce","San Luis",16321156);
        Cliente cliente4= new Cliente ("Juan","Ramire<","El borbollon","Villa Mercedes",38945612);
        directorio.agregarCliente(266462251, cliente1);
        directorio.agregarCliente(266562251, cliente2);
        directorio.agregarCliente(266662251, cliente3);
        directorio.agregarCliente(266762251, cliente4);
        directorio.buscarCliente(266462251);
        directorio.listar();
        directorio.borrarCliente(41272923);
        directorio.buscarCliente(266462251);
        System.out.println("----------------------------------");
        directorio.listar();
        directorio.buscarCliente("La toma");
    }
    
}
