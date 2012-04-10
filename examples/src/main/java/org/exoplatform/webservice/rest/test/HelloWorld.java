/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package org.exoplatform.webservice.rest.test;

/**
 * Created by The eXo Platform SAS
 * Author : nguyen hong quang
 *          quangnh@exoplatform.com
 * Apr 6, 2012  
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
import org.exoplatform.services.rest.resource.ResourceContainer;
 
@Path("/helloworld")
public class HelloWorld implements ResourceContainer {
 
  @GET
  @Path("/sayHello/")
  public Response sayHello() {
    String responseContent = "Howdy, cowboy?";
    return Response.ok(responseContent, MediaType.TEXT_PLAIN).build();
  }
 
  @GET
  @Path("/giveGreetingTo/")
  public Response giveGreetingTo(@QueryParam("clientName") String clientName) {
    String responseContent = "Welcome " + clientName;
    return Response.ok(responseContent, MediaType.TEXT_PLAIN).build();
  }
 
}
