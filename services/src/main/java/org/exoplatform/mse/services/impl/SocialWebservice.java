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
package org.exoplatform.mse.services.impl;

import org.exoplatform.mse.services.SocialWS;
import org.exoplatform.services.rest.resource.ResourceContainer;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * Created by The eXo Platform SAS
 * Author : nguyen hong quang
 *          quangnh@exoplatform.com
 * Apr 19, 2012  
 */

@Path("/helloworld")
public class SocialWebservice implements SocialWS, ResourceContainer{

	@GET
	@Path("/sayHello/")
	@Override
	public Response test() {
		// TODO Auto-generated method stub
		String responseContent = "Welcome to MSE project?";
	    return Response.ok(responseContent, MediaType.TEXT_PLAIN).build();
	}

}
