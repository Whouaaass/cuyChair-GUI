package co.edu.unicauca.cuychair.gui.api.dtos.paperAPI;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PaperDTO {
    private int id;
    private String title;
    private String Abstract;
    private String subTitle;
    private int idAuthor;
    private int idConference;
    public PaperDTO(){};
    
}
