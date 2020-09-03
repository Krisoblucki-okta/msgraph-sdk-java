// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.SecureScore;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ISecureScoreCollectionPage;
import com.microsoft.graph.requests.extensions.SecureScoreCollectionResponse;
import com.microsoft.graph.requests.extensions.ISecureScoreCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreCollectionRequest;
import com.microsoft.graph.requests.extensions.SecureScoreCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Secure Score Collection Request.
 */
public class SecureScoreCollectionRequest extends BaseCollectionRequest<SecureScoreCollectionResponse, ISecureScoreCollectionPage> implements ISecureScoreCollectionRequest {

    /**
     * The request builder for this collection of SecureScore
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecureScoreCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SecureScoreCollectionResponse.class, ISecureScoreCollectionPage.class);
    }

    public void get(final ICallback<ISecureScoreCollectionPage> callback) {
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

    public ISecureScoreCollectionPage get() throws ClientException {
        final SecureScoreCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SecureScore newSecureScore, final ICallback<SecureScore> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SecureScoreRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSecureScore, callback);
    }

    public SecureScore post(final SecureScore newSecureScore) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SecureScoreRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSecureScore);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISecureScoreCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SecureScoreCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISecureScoreCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SecureScoreCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISecureScoreCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SecureScoreCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ISecureScoreCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (SecureScoreCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ISecureScoreCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ISecureScoreCollectionRequest)this;
    }
    public ISecureScoreCollectionPage buildFromResponse(final SecureScoreCollectionResponse response) {
        final ISecureScoreCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SecureScoreCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SecureScoreCollectionPage page = new SecureScoreCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
