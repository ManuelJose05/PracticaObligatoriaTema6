package correos;

import correos.Comunicaciones;
import correos.Plantilla;

public class mensaje {
    public static void main(String[] args) {
        Comunicaciones.enviarMensaje("manueljoseliebana05@gmail.com","Prueba", Plantilla.tokenRegistro("Manuel Jose",
                "manueljoseliebana05@gmail.com",1));
    }
}
