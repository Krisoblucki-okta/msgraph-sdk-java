// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkforceIntegration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workforce Integration Request.
 */
public class WorkforceIntegrationRequest extends BaseRequest implements IWorkforceIntegrationRequest {
	
    /**
     * The request for the WorkforceIntegration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkforceIntegrationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkforceIntegration.class);
    }

    /**
     * Gets the WorkforceIntegration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkforceIntegration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkforceIntegration from the service
     *
     * @return the WorkforceIntegration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkforceIntegration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WorkforceIntegration> callback) {
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
     * Patches this WorkforceIntegration with a source
     *
     * @param sourceWorkforceIntegration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkforceIntegration sourceWorkforceIntegration, final ICallback<WorkforceIntegration> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkforceIntegration);
    }

    /**
     * Patches this WorkforceIntegration with a source
     *
     * @param sourceWorkforceIntegration the source object with updates
     * @return the updated WorkforceIntegration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkforceIntegration patch(final WorkforceIntegration sourceWorkforceIntegration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkforceIntegration);
    }

    /**
     * Creates a WorkforceIntegration with a new object
     *
     * @param newWorkforceIntegration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkforceIntegration newWorkforceIntegration, final ICallback<WorkforceIntegration> callback) {
        send(HttpMethod.POST, callback, newWorkforceIntegration);
    }

    /**
     * Creates a WorkforceIntegration with a new object
     *
     * @param newWorkforceIntegration the new object to create
     * @return the created WorkforceIntegration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkforceIntegration post(final WorkforceIntegration newWorkforceIntegration) throws ClientException {
        return send(HttpMethod.POST, newWorkforceIntegration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkforceIntegrationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkforceIntegrationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkforceIntegrationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkforceIntegrationRequest)this;
     }

}

