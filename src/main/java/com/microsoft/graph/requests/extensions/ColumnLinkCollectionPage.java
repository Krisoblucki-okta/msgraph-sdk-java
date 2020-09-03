// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ColumnLink;
import com.microsoft.graph.requests.extensions.IColumnLinkCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ColumnLinkCollectionPage;
import com.microsoft.graph.requests.extensions.ColumnLinkCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Column Link Collection Page.
 */
public class ColumnLinkCollectionPage extends BaseCollectionPage<ColumnLink, IColumnLinkCollectionRequestBuilder> implements IColumnLinkCollectionPage {

    /**
     * A collection page for ColumnLink
     *
     * @param response the serialized ColumnLinkCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ColumnLinkCollectionPage(final ColumnLinkCollectionResponse response, final IColumnLinkCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
