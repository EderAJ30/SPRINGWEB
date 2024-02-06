package fes.aragon.service;

import fes.aragon.model.ClienteProyectoFinal;

import java.util.ArrayList;

public interface ServiceProyectoFinal {
    void agregarClientePF(ClienteProyectoFinal clienteProyectoFinal);
    ArrayList<ClienteProyectoFinal> obtenerClientesPF();
    void setClientes(ArrayList<ClienteProyectoFinal> clientes);
    void setClientes();
}
