package fes.aragon.service;

import fes.aragon.model.ClienteProyectoFinal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteService implements ServiceProyectoFinal {
    private ArrayList<ClienteProyectoFinal> clientes = new ArrayList<>();
    @Override
    public void agregarClientePF(ClienteProyectoFinal clienteProyectoFinal) {
        clientes.add(clienteProyectoFinal);
    }
    @Override
    public ArrayList<ClienteProyectoFinal> obtenerClientesPF() {
        return this.clientes;
    }
    @Override
    public void setClientes(ArrayList<ClienteProyectoFinal> clientes) {
        this.clientes = clientes;
    }
    @Override
    public void setClientes() {

    }
}