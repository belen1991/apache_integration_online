package org.apache.camel.learn;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CreateClienteProcess implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Cliente cliente = exchange.getIn().getBody(Cliente.class);
        exchange.getIn().setBody(cliente);
	}

}
