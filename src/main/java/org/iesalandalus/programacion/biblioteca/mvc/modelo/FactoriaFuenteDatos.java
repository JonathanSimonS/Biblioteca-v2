/**
 * 
 */
package org.iesalandalus.programacion.biblioteca.mvc.modelo;

import org.iesalandalus.programacion.biblioteca.mvc.modelo.negocio.memoria.FactoriaFuenteDatosMemoria;

/**
 * @author Jonathan Simón
 * @version v2
 *
 */
public enum FactoriaFuenteDatos {

	MEMORIA {
		@Override
		public IFuenteDatos crear() {
			return new FactoriaFuenteDatosMemoria();
		}
	};
	
	FactoriaFuenteDatos() {
		
	}
	
	public abstract IFuenteDatos crear();
	
}
