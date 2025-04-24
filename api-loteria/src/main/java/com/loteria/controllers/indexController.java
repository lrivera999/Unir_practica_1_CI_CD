package com.loteria.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

	@GetMapping("/index")
	public String getPage() {
		StringBuilder msg = new StringBuilder();
		msg.append("<div>");
		/**AQUI CONSTRUIR HTM DEL WELCMONE*/
		msg.append("<header><h2><b>Bienvenido</b> - Api Loteria</h2></header>");
		msg.append("<div>"
				+ "<div><article><p>M&eacute;todos soportados: <h3>GET, POST, PUT, DELETE</h3></p></article></div>"
					+ "<div><p>Open API</p><ul>"
					+ "<li><a href='http://localhost:8080/v3/api-docs'>Open API</a></li>"
					+ "</ul></div>"
				+ "<div><p>Usuarios</p><ul>"
				+ "<li><a href='http://localhost:8080/Users'>Get - Listar</a></li>"
				+ "<li><a href='http://localhost:8080/Users'>POST - Registrar</a></li>"
				+ "<li><a href='http://localhost:8080/Users/Update'>Put - Actualizar</a></li>"
				+ "<li><a href='http://localhost:8080/Users/Delete'>Delete - Eliminar</a></li>"
				+ "</ul></div>"
				+ "<div><p>Apuestas</p><ul>"
				+ "<li><a href='http://localhost:8080/Bets'>Get - Listar</a></li>"
				+ "<li><a href='http://localhost:8080/Bets'>POST - Registrar</a></li>"
				+ "<li><a href='http://localhost:8080/Bets/Update'>Put - Actualizar</a></li>"
				+ "<li><a href='http://localhost:8080/Bets/Delete'>Delete - Eliminar</a></li>"
				+ "</ul></div>"
				+ "<div><p>Resultados</p><ul>"
				+ "<li><a href='http://localhost:8080/Results'>Get - Listar</a></li>"
				+ "<li><a href='http://localhost:8080/Results'>POST - Registrar</a></li>"
				+ "<li><a href='http://localhost:8080/Results/Update'>Put - Actualizar</a></li>"
				+ "<li><a href='http://localhost:8080/Results/Delete'>Delete - Eliminar</a></li>"
				+ "</ul></div>"
				+ "<div><p>Historicos</p><ul>"
				+ "<li><a href='http://localhost:8080/Historic'>Get - Listar</a></li>"
				+ "<li><a href='http://localhost:8080/Historic'>POST - Registrar</a></li>"
				+ "<li><a href='http://localhost:8080/Historic/Update'>Put - Actualizar</a></li>"
				+ "<li><a href='http://localhost:8080/Historic/Delete'>Delete - Eliminar</a></li>"
				+ "</ul></div>"
				+ "</div>");
		msg.append("<footer></footer>");
		/**fin de la etiqueta html*/
		msg.append("</div>");
		return msg.toString();
	}
}
