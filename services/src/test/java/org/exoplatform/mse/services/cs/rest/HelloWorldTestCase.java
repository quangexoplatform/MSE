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
package org.exoplatform.mse.services.cs.rest;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.RuntimeDelegate;
import org.exoplatform.mse.services.test.*;
import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.exoplatform.services.rest.impl.ContainerResponse;
import org.exoplatform.services.rest.impl.MultivaluedMapImpl;
import org.exoplatform.services.rest.impl.RuntimeDelegateImpl;
import org.exoplatform.services.rest.tools.ByteArrayContainerResponseWriter;
import org.exoplatform.container.*;


/**
 * Created by The eXo Platform SAS
 * Author : nguyen hong quang
 *          quangnh@exoplatform.com
 * Apr 13, 2012  
 */
public class HelloWorldTestCase extends AbstractResourceTest {
	private HelloWorld helloWorld;
	static final String             baseURI = "";
	public void setUp() throws Exception {
		RuntimeDelegate.setInstance(new RuntimeDelegateImpl());
		super.setUp();
		ExoContainer myContainer = ExoContainerContext.getCurrentContainer();
		helloWorld = (HelloWorld) myContainer.getComponentInstance(HelloWorld.class);

		registry(helloWorld);

	}
	public void testServiceHello() throws Exception{
		MultivaluedMap<String, String> h = new MultivaluedMapImpl();
		String username = "root";
		h.putSingle("username", username);
		Log log = ExoLogger.getLogger(HelloWorldTestCase.class.getName()); 
		
		String eventURI = "/helloworld/sayHello";
		ByteArrayContainerResponseWriter writer = new ByteArrayContainerResponseWriter();
		ContainerResponse response = service("GET", eventURI, baseURI, h, null, writer);
		log.info(response.getEntity());
		assertNotNull(response);
		assertNotSame(Response.Status.NOT_FOUND, response.getStatus());
	}
	public void tearDown() throws Exception {
		super.tearDown();
	}

}
