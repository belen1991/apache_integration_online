using Microsoft.AspNetCore.Mvc;

namespace netmicro.Controllers;

[ApiController]
[Route("[controller]")]
public class ClienteController : ControllerBase
{
    static List<Cliente> clientes = 
        new(){
            new Cliente(1234,"Belen Arizaga","Casa","0123456789", "Store")
        };

    private readonly ILogger<WeatherForecastController> _logger;

    public ClienteController(ILogger<WeatherForecastController> logger)
    {
        _logger = logger;
    }

    [HttpGet(Name = "GetCliente")]
    public IEnumerable<Cliente> Get()
    {
        return clientes
        .ToArray();
    }
    
    [HttpPost(Name = "CrearCliente")]
    public string Post(Cliente cliente)
    {
        clientes.Add(cliente);
        return "OK";
    }
}
