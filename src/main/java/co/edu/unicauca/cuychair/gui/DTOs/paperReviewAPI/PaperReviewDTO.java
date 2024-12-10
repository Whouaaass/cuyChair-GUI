package co.edu.unicauca.cuychair.gui.DTOs.paperReviewAPI;

import co.edu.unicauca.cuychair.gui.domain.Paper;
import co.edu.unicauca.cuychair.gui.domain.User;

public class PaperReviewDTO {
    private int idPaperReview;
    private Paper paper;
    private User evaluator;
    private boolean reviewed;
    private String comment;
    //private PaperReviewState state;
}
