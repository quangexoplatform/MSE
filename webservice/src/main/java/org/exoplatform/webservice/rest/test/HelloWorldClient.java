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
 * Apr 10, 2012  
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLConnection;
 
public class HelloWorldClient {
 
  private static void writeOutResponse(InputStream in, Writer out) throws IOException {
    int c = in.read();
    while (c != -1) {
      out.append((char) c);
      c = in.read();
    }
    out.flush();
  }
 
  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Missing input URL");
      return;
    }
    try {
      URLConnection connection = new URL(args[0]).openConnection();
      writeOutResponse(connection.getInputStream(), new OutputStreamWriter(System.out));
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
 
}