// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Person;
import com.microsoft.graph.requests.extensions.IPersonCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PersonCollectionPage;
import com.microsoft.graph.requests.extensions.PersonCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Collection Page.
 */
public class PersonCollectionPage extends BaseCollectionPage<Person, IPersonCollectionRequestBuilder> implements IPersonCollectionPage {

    /**
     * A collection page for Person
     *
     * @param response the serialized PersonCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PersonCollectionPage(final PersonCollectionResponse response, final IPersonCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
