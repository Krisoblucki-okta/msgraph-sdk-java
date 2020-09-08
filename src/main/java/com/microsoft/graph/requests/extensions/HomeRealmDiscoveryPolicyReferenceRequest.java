// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Home Realm Discovery Policy Reference Request.
 */
public class HomeRealmDiscoveryPolicyReferenceRequest extends BaseRequest implements IHomeRealmDiscoveryPolicyReferenceRequest {

    /**
     * The request for the HomeRealmDiscoveryPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HomeRealmDiscoveryPolicyReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, HomeRealmDiscoveryPolicy.class);
    }

    public void delete(final ICallback<HomeRealmDiscoveryPolicy> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public HomeRealmDiscoveryPolicy delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IHomeRealmDiscoveryPolicyReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (HomeRealmDiscoveryPolicyReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IHomeRealmDiscoveryPolicyReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (HomeRealmDiscoveryPolicyReferenceRequest)this;
    }
    /**
     * Puts the HomeRealmDiscoveryPolicy
     *
     * @param srcHomeRealmDiscoveryPolicy the HomeRealmDiscoveryPolicy reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(HomeRealmDiscoveryPolicy srcHomeRealmDiscoveryPolicy, final ICallback<HomeRealmDiscoveryPolicy> callback) {
        send(HttpMethod.PUT, callback, srcHomeRealmDiscoveryPolicy);
    }

    /**
     * Puts the HomeRealmDiscoveryPolicy
     *
     * @param srcHomeRealmDiscoveryPolicy the HomeRealmDiscoveryPolicy reference to PUT
     * @return the HomeRealmDiscoveryPolicy
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public HomeRealmDiscoveryPolicy put(HomeRealmDiscoveryPolicy srcHomeRealmDiscoveryPolicy) throws ClientException {
        return send(HttpMethod.PUT, srcHomeRealmDiscoveryPolicy);
    }
}
