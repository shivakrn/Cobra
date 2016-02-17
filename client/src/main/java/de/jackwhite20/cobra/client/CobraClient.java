/*
 * Copyright (c) 2016 "JackWhite20"
 *
 * This file is part of Cobra.
 *
 * Cobra is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.jackwhite20.cobra.client;

import de.jackwhite20.cobra.client.impl.http.HTTPBody;
import de.jackwhite20.cobra.client.impl.http.HTTPHeader;
import de.jackwhite20.cobra.client.impl.http.HTTPResponse;

import java.io.IOException;
import java.net.Proxy;
import java.net.URL;

/**
 * Created by JackWhite20 on 17.02.2016.
 */
public interface CobraClient {

    String post(URL url, HTTPBody body, HTTPHeader... headers) throws IOException;

    String post(URL url, Proxy proxy, HTTPBody body, HTTPHeader... headers) throws IOException;

    HTTPResponse get(URL url, Proxy proxy, HTTPHeader... headers) throws IOException;

    HTTPResponse get(URL url, HTTPHeader... headers) throws IOException;
}
