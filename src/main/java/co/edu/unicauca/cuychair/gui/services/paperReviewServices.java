package co.edu.unicauca.cuychair.gui.services;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.jackson.JacksonFeature;

import co.edu.unicauca.cuychair.gui.DTOs.paperReviewAPI.ResultChangeStateDTO;
import co.edu.unicauca.cuychair.gui.domain.PaperReview;

public class PaperReviewServices {
    private static final String ENDPOINT = "http://localhost:8093/paperReview";
    private final Client client;

    // Constructor
    public PaperReviewServices() {
        this.client = ClientBuilder.newClient().register(JacksonFeature.class);
    }

    // Método para obtener un PaperReview por ID
    public PaperReview getPaperReview(int paperReviewId) {
        WebTarget target = client.target(ENDPOINT + "/get/" + paperReviewId);
        return target.request(MediaType.APPLICATION_JSON).get(PaperReview.class);
    }

    // Método para obtener un PaperReview por paperId
    public PaperReview getPaperReviewByPaper(int paperId) {
        WebTarget target = client.target(ENDPOINT + "/getByPaper/" + paperId);
        return target.request(MediaType.APPLICATION_JSON).get(PaperReview.class);
    }

    // Método para cambiar el estado de un PaperReview
    public ResultChangeStateDTO changeState(int paperReviewId, String newState, String comment) {
        WebTarget target = client.target(ENDPOINT + "/changeState/" + paperReviewId + "/" + newState);
        Response response = target.request(MediaType.APPLICATION_JSON)
                .method("PATCH", Entity.entity(comment, MediaType.TEXT_PLAIN));
        return response.readEntity(ResultChangeStateDTO.class);
    }

}
