package ugandaRest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/info")
public class UgandaFarmer {
	
	@GET
	@Produces("application/json")
	public Response myDetail() throws JSONException{
		JSONObject json = new JSONObject();
		
		String fname = "Shankar";
		String lname = "Sridhar";
		
		json.put("firstName", fname);
		json.put("lastName",lname);
				
		String result = "@Produces(\"application/json\") Output:\n\n Farmer Info \n\n"+json;
		
		return Response.status(200).entity(result).build();
		
	}
	
	@Path("{name}")
	@GET
	@Produces("application/json")
	public Response getDetail(@PathParam("name") String name) throws JSONException{
		
		JSONObject json = new JSONObject();
		
		String nameParts[] = name.split(".");
		
		json.put("firstName", nameParts[0]);
		json.put("LastName", nameParts[1]);
		
		String result = "@Produces(\"application/json\") Output:\n\n Farmer Info \n\n"+json;
		
		return Response.status(200).entity(result).build();
		
	}
}
