package resource;

import entity.BillRequest;
import entity.BillResponse;
import org.eclipse.jetty.http.HttpStatus;
import service.BillingService;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by sallu on 10/31/2016.
 */
@Path("/split")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BillingResource {

    @POST
    public Response calculate(@Valid BillRequest billRequest){

        BillResponse response = BillingService.INSTANCE.calculate(billRequest);

        return Response.status(HttpStatus.OK_200).entity(response).build();

    }
}
