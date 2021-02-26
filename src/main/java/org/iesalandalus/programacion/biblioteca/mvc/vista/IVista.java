package org.iesalandalus.programacion.biblioteca.mvc.vista;

import org.iesalandalus.programacion.biblioteca.mvc.controlador.Controlador;
/**
 * @author: Jonathan Simón Sánchez
 * @version v2
 **/
public interface IVista {

	void setControlador(Controlador controlador);

	void comenzar();

	void terminar();

	// Métodos Alumno
	void insertarAlumno();

	void buscarAlumno();

	void borrarAlumno();

	void listarAlumnos();

	// Métodos Libro
	void insertarLibro();

	void buscarLibro();

	void borrarLibro();

	void listarLibros();

	void prestarLibro();

	void devolverLibro();

	void buscarPrestamo();

	void borrarPrestamo();

	void listarPrestamos();

	void listarPrestamosAlumno();

	void listarPrestamosLibro();

	void listarPrestamosFecha();

	void mostrarEstadisticaMensualPorCurso();

}