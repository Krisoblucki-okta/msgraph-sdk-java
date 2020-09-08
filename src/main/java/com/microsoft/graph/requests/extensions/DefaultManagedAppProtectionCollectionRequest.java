// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.DefaultManagedAppProtection;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionCollectionPage;
import com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionCollectionResponse;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionCollectionRequest;
import com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Default Managed App Protection Collection Request.
 */
public class DefaultManagedAppProtectionCollectionRequest extends BaseCollectionRequest<DefaultManagedAppProtectionCollectionResponse, IDefaultManagedAppProtectionCollectionPage> implements IDefaultManagedAppProtectionCollectionRequest {

    /**
     * The request builder for this collection of DefaultManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DefaultManagedAppProtectionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DefaultManagedAppProtectionCollectionResponse.class, IDefaultManagedAppProtectionCollectionPage.class);
    }

    public void get(final ICallback<IDefaultManagedAppProtectionCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDefaultManagedAppProtectionCollectionPage get() throws ClientException {
        final DefaultManagedAppProtectionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DefaultManagedAppProtection newDefaultManagedAppProtection, final ICallback<DefaultManagedAppProtection> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DefaultManagedAppProtectionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDefaultManagedAppProtection, callback);
    }

    public DefaultManagedAppProtection post(final DefaultManagedAppProtection newDefaultManagedAppProtection) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DefaultManagedAppProtectionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDefaultManagedAppProtection);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDefaultManagedAppProtectionCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DefaultManagedAppProtectionCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDefaultManagedAppProtectionCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DefaultManagedAppProtectionCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDefaultManagedAppProtectionCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DefaultManagedAppProtectionCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDefaultManagedAppProtectionCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DefaultManagedAppProtectionCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDefaultManagedAppProtectionCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDefaultManagedAppProtectionCollectionRequest)this;
    }
    public IDefaultManagedAppProtectionCollectionPage buildFromResponse(final DefaultManagedAppProtectionCollectionResponse response) {
        final IDefaultManagedAppProtectionCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DefaultManagedAppProtectionCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DefaultManagedAppProtectionCollectionPage page = new DefaultManagedAppProtectionCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
