/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero.acceso;

/**
 *
 * @author Asus
 */
public interface IParqueadero {
    public String consultarVehiculosPorConductor(String idConductor);
    public String consultarConductor(String idConductor);
    
    
}
