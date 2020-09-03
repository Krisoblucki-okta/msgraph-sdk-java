// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMessageMoveRequest;
import com.microsoft.graph.requests.extensions.MessageMoveRequest;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Move Request Builder.
 */
public class MessageMoveRequestBuilder extends BaseActionRequestBuilder implements IMessageMoveRequestBuilder {

    /**
     * The request builder for this MessageMove
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param destinationId the destinationId
     */
    public MessageMoveRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String destinationId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("destinationId", destinationId);
    }

    /**
     * Creates the IMessageMoveRequest
     *
     * @return the IMessageMoveRequest instance
     */
    public IMessageMoveRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMessageMoveRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMessageMoveRequest instance
     */
    public IMessageMoveRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MessageMoveRequest request = new MessageMoveRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("destinationId")) {
            request.body.destinationId = getParameter("destinationId");
        }

        return request;
    }
}
