/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import javax.faces.context.FacesContext;

/**
 *
 * @author Miguel
 */
public class Usuario {

    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String isUsernameAndPasswordValid() {
        //hacer logica para validar que el usuario realmente exista
        if (password.equals("password") && username.equals("username")) {
            return "ACCEPTED";
        } else if(username.equals("admin") && password.equals("admin")){
            return "ADMIN";
        }
        return "DENIED";
    }
    
    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/index.xhtml?faces-redirect=true";
    }

}
