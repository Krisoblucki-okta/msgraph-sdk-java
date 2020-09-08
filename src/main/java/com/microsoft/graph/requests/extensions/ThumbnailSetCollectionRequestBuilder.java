// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.ThumbnailSet;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IThumbnailSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IThumbnailSetRequestBuilder;
import com.microsoft.graph.requests.extensions.IThumbnailSetCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Thumbnail Set Collection Request Builder.
 */
public class ThumbnailSetCollectionRequestBuilder extends BaseRequestBuilder implements IThumbnailSetCollectionRequestBuilder {

    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThumbnailSetCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IThumbnailSetCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IThumbnailSetCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ThumbnailSetCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IThumbnailSetRequestBuilder byId(final String id) {
        return new ThumbnailSetRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
