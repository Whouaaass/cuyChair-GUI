package co.edu.unicauca.cuychair.gui.DTOs.paperAPI;

import lombok.Getter;

@Getter
public class PaperDTO {
    private int id;
    private String title;
    private String Abstract;
    private String subTitle;
    private int idAuthor;
    private int idConference;
    public PaperDTO(){};
    
}
