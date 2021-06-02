package com.chris.ram.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.chris.ram.model.Producto;
@Service
public class ProductosServiceImp implements IntProductosService {

	private List<Producto> lista;
	
	public ProductosServiceImp() {
		lista = new LinkedList<Producto>();
		DateTimeFormatter formato = DateTimeFormatter.
				ofPattern("dd-MM-yyyy");
		
		try {
			
		
		
		Producto p1 = new Producto();
		p1.setId(1);
		p1.setNombre("Martillo");
		p1.setDescripcion("Descripción del producto");
		p1.setExistencias(5);
		p1.setPrecio(230.0);
		//p1.setFechaProduccion(LocalDate.now());
		p1.setFechaProduccion(LocalDate.parse("04-01-2021", formato));
		p1.setImagen("martillo.jpg");
		
		lista.add(p1);
		//***********************************************************
		Producto p2 = new Producto();
		p2.setId(2);
		p2.setNombre("Desarmador");
		p2.setDescripcion("Descripción del producto");
		p2.setExistencias(10);
		p2.setPrecio(80.0);
		//p1.setFechaProduccion(LocalDate.now());
		p2.setFechaProduccion(LocalDate.parse("15-01-2021", formato));
		p2.setImagen("desarmador.jpg");
		
		lista.add(p2);
		//***********************************************************
		Producto p3 = new Producto();
		p3.setId(3);
		p3.setNombre("Pala");
		p3.setDescripcion("Descripción del producto");
		p3.setExistencias(13);
		p3.setPrecio(270.0);
		//p1.setFechaProduccion(LocalDate.now());
		p3.setFechaProduccion(LocalDate.parse("25-01-2021", formato));
		p3.setImagen("pala.jpg");
		
		lista.add(p3);
		//***********************************************************
		Producto p4 = new Producto();
		p4.setId(4);
		p4.setNombre("Carretilla");
		p4.setDescripcion("Descripción del producto");
		p4.setExistencias(9);
		p4.setPrecio(730.0);
		//p1.setFechaProduccion(LocalDate.now());
		p4.setFechaProduccion(LocalDate.parse("25-01-2021", formato));
		p4.setImagen("carretilla.jpg");
		
		lista.add(p4);
		//***********************************************************
				Producto p5 = new Producto();
				p5.setId(5);
				p5.setNombre("Carretilla");
				p5.setDescripcion("Descripción del producto");
				p5.setExistencias(9);
				p5.setPrecio(730.0);
				//p1.setFechaProduccion(LocalDate.now());
				p5.setFechaProduccion(LocalDate.parse("25-01-2021", formato));
				p5.setImagen("carretilla.jpg");
				
				lista.add(p5);
				//***********************************************************
				Producto p6 = new Producto();
				p6.setId(6);
				p6.setNombre("Carretilla");
				p6.setDescripcion("Descripción del producto");
				p6.setExistencias(9);
				p4.setPrecio(730.0);
				//p1.setFechaProduccion(LocalDate.now());
				p6.setFechaProduccion(LocalDate.parse("25-01-2021", formato));
				p6.setImagen("carretilla.jpg");
				
				lista.add(p6);
				//***********************************************************
				Producto p7 = new Producto();
				p7.setId(7);
				p7.setNombre("Carretilla");
				p7.setDescripcion("Descripción del producto");
				p7.setExistencias(9);
				p7.setPrecio(730.0);
				//p1.setFechaProduccion(LocalDate.now());
				p7.setFechaProduccion(LocalDate.parse("25-01-2021", formato));
				p7.setImagen("carretilla.jpg");
				
				lista.add(p7);
				
		}catch(DateTimeParseException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Override
	public List<Producto> obtenerTodos() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public void guardar(Producto producto) {
		lista.add(producto);
		
	}

	@Override
	public void eliminar(Integer idProducto) {
		lista.remove(buscarPorId(idProducto));
		
	}

	@Override
	public Producto buscarPorId(Integer idProducto) {
		for (Producto p : lista) {
			if(p.getId() == idProducto) {
				return p;
			}
		}
		return null;
	}

}
