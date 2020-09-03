// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.List;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Request.
 */
public class ListRequest extends BaseRequest implements IListRequest {
	
    /**
     * The request for the List
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, List.class);
    }

    /**
     * Gets the List from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<List> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the List from the service
     *
     * @return the List from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public List get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<List> callback) {
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
     * Patches this List with a source
     *
     * @param sourceList the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final List sourceList, final ICallback<List> callback) {
        send(HttpMethod.PATCH, callback, sourceList);
    }

    /**
     * Patches this List with a source
     *
     * @param sourceList the source object with updates
     * @return the updated List
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public List patch(final List sourceList) throws ClientException {
        return send(HttpMethod.PATCH, sourceList);
    }

    /**
     * Creates a List with a new object
     *
     * @param newList the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final List newList, final ICallback<List> callback) {
        send(HttpMethod.POST, callback, newList);
    }

    /**
     * Creates a List with a new object
     *
     * @param newList the new object to create
     * @return the created List
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public List post(final List newList) throws ClientException {
        return send(HttpMethod.POST, newList);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IListRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ListRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IListRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ListRequest)this;
     }

}

