package co.edu.unicauca.cuychair.gui.context;

import co.edu.unicauca.cuychair.gui.language.LanguageManager;

/**
 * Clase que es un singleton que contiene la información de la sesión actual del
 * usuario
 */
public class SessionContext {
    private static SessionContext instance;
    private Integer userId;
    private String userName;
    private String userRole;
    private String userMail;
    private final LanguageManager languageManager;

    private SessionContext() {
        userId = -1;
        userName = "NoApi";
        userRole = "NoApi";
        userMail = "NoApi@noApi.com";
        languageManager = new LanguageManager();
    }

    /**
     * Obtiene una instancia del contexto de sesión
     * 
     * @return SessionContext instancia del contexto de sesión
     */
    public static SessionContext getInstance() {
        if (instance == null) {
            instance = new SessionContext();
        }
        return instance;
    }

    /**
     * Obtiene el id del usuario
     * 
     * @return String id del usuario
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Establece el id del usuario
     * 
     * @param userId id del usuario
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Obtiene el nombre del usuario
     * 
     * @return nombre del usuario
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Establece el nombre del usuario
     * 
     * @param userName nombre del usuario
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Obtiene el rol del usuario
     * 
     * @return rol del usuario
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * Establece el rol del usuario
     * 
     * @param userRole rol del usuario
     */
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }


    /**
     * Obtiene el correo del usuario
     * 
     * @return correo del usuario
     */
    public String getUserMail() {
        return userMail;
    }

    /**
     * Establece el correo del usuario
     * 
     * @param userMail correo del usuario
     */
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }
    
    public LanguageManager getLanguageManager() {
        return languageManager;
    }
}
