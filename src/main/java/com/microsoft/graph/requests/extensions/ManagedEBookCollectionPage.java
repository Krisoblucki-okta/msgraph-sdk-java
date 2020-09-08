// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedEBook;
import com.microsoft.graph.requests.extensions.IManagedEBookCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedEBookCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedEBookCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Collection Page.
 */
public class ManagedEBookCollectionPage extends BaseCollectionPage<ManagedEBook, IManagedEBookCollectionRequestBuilder> implements IManagedEBookCollectionPage {

    /**
     * A collection page for ManagedEBook
     *
     * @param response the serialized ManagedEBookCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedEBookCollectionPage(final ManagedEBookCollectionResponse response, final IManagedEBookCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
