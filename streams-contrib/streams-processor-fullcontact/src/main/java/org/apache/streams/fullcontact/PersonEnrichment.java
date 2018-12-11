/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.streams.fullcontact;

import org.apache.streams.fullcontact.api.EnrichPersonRequest;
import org.apache.streams.fullcontact.pojo.PersonSummary;

import org.apache.juneau.http.annotation.Body;
import org.apache.juneau.remote.RemoteInterface;
import org.apache.juneau.rest.client.remote.RemoteMethod;

@RemoteInterface(path = "https://api.fullcontact.com/v3/person.enrich")
public interface PersonEnrichment {

  @RemoteMethod(method ="POST")
  public PersonSummary enrichPerson(@Body EnrichPersonRequest request);

}