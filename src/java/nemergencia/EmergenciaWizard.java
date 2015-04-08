package nemergencia;

import java.io.Serializable;

public class EmergenciaWizard implements Serializable {

    private EmergenciaUsuario user = new EmergenciaUsuario();

    public EmergenciaUsuario getUser() {
        return user;
    }

    public void setUser(EmergenciaUsuario user) {
        this.user = user;
    }

    public String save() {

        return "REGISTERED";

    }

}
