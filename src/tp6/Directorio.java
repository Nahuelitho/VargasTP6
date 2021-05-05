package tp6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Directorio {
    private TreeMap<Long,Cliente> listaClientes = new TreeMap<>();
    
/*****************************************************************/    
    public Cliente agregarCliente(long telefono, Cliente c){
    
    Cliente cliente = listaClientes.put(telefono, c);
    if(cliente !=null){
        return cliente;
    } else return cliente;
    }
//////////////////////////////////////////////////////////////
    public void buscarCliente(long telefono) {

        Set<Long> claves = listaClientes.keySet();
        //Pensaba hacer un for pero recorde que un telefono solo puede pertenecer a una persona
        if (listaClientes.containsKey(telefono)) {
            System.out.println("El Dueño de este telefono es: " + listaClientes.get(telefono).getNombre() + " " + listaClientes.get(telefono).getApellido());
        }else System.out.println("El cliente no se encontro");
    }
    
//////////////////////////////////////////////////////////////    
    public HashSet<Long> buscarTelefono(String apellido){
    System.out.print("\n");
    HashSet<Long> telefonos= new HashSet<>();
    
    Set<Long> claves= listaClientes.keySet();
    
    Iterator it = claves.iterator();
    
    while(it.hasNext()){
    Long Ntelefono = (Long) it.next();
    Cliente c = listaClientes.get(Ntelefono);
    if(c.getApellido().equals(apellido)){
    telefonos.add(Ntelefono);
    }
    }
    return telefonos;
    }
//////////////////////////////////////////////////////////////    
    public Set<Cliente> buscarCliente (String ciudad){
    HashSet<Cliente> clientesxCiudad = new HashSet<>();
    Set<Long> claves= listaClientes.keySet();
    for(Long it:claves){
        if(listaClientes.get(it).getCiudad()== ciudad){
        clientesxCiudad.add(listaClientes.get(it));
        }
        }
    System.out.println("Los clientes por ciudad son: "+clientesxCiudad.toString());
    return clientesxCiudad;
    }
//////////////////////////////////////////////////////////////    
    public void borrarCliente(long dni){
    
    Set<Long> claves = listaClientes.keySet();
    Iterator it = claves.iterator();
    
    
    while(it.hasNext()){
        
    Long Ntelefono = (Long) it.next();
    
    if(listaClientes.get(Ntelefono).getDni()==dni){
    it.remove();
    System.out.println("Se borro el cliente con dni: "+dni);
    }  
        }   
    }
    
/***************************************************************************************************/
    public void listar(){
        
        for(Long it: listaClientes.keySet()){
            System.out.println(listaClientes.get(it).getNombre()+" "+listaClientes.get(it).getNombre());
        }
    }
}

