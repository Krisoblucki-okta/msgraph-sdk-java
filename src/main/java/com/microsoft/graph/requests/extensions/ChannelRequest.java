// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Channel;
import com.microsoft.graph.requests.extensions.IConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatMessageRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatMessageRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTabCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTabRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTabCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTabRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel Request.
 */
public class ChannelRequest extends BaseRequest implements IChannelRequest {
	
    /**
     * The request for the Channel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChannelRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Channel.class);
    }

    /**
     * Gets the Channel from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Channel> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Channel from the service
     *
     * @return the Channel from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Channel get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Channel> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Channel with a source
     *
     * @param sourceChannel the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Channel sourceChannel, final ICallback<Channel> callback) {
        send(HttpMethod.PATCH, callback, sourceChannel);
    }

    /**
     * Patches this Channel with a source
     *
     * @param sourceChannel the source object with updates
     * @return the updated Channel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Channel patch(final Channel sourceChannel) throws ClientException {
        return send(HttpMethod.PATCH, sourceChannel);
    }

    /**
     * Creates a Channel with a new object
     *
     * @param newChannel the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Channel newChannel, final ICallback<Channel> callback) {
        send(HttpMethod.POST, callback, newChannel);
    }

    /**
     * Creates a Channel with a new object
     *
     * @param newChannel the new object to create
     * @return the created Channel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Channel post(final Channel newChannel) throws ClientException {
        return send(HttpMethod.POST, newChannel);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IChannelRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ChannelRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IChannelRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ChannelRequest)this;
     }

}

