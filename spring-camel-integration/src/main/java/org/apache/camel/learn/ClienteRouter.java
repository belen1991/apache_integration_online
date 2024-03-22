package org.apache.camel.learn;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.stereotype.Component;

@Component
public class ClienteRouter extends RouteBuilder {

    JacksonDataFormat jsonDataFormat = new JacksonDataFormat(Cliente.class);

	@Override
	public void configure() throws Exception {
		from("direct:crearCliente")
            .routeId("CrearCliente")
            .process(new CreateClienteProcess())
            .choice()
                .when(simple("${body.perfil} == 'Online'"))
                    .marshal(jsonDataFormat)
                    .to("rest:post:/clients?host=pymicroservice:5000")
                .when(simple("${body.perfil} == 'Store'"))
                    .marshal(jsonDataFormat)
                    .to("rest:post:/Cliente?host=netmicroservice:80")
            .end()
            .to("log:CREATE");
	}
    
}
