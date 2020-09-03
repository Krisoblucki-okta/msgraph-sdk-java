// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupValidatePropertiesRequest;
import com.microsoft.graph.requests.extensions.GroupValidatePropertiesRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Validate Properties Request Builder.
 */
public class GroupValidatePropertiesRequestBuilder extends BaseActionRequestBuilder implements IGroupValidatePropertiesRequestBuilder {

    /**
     * The request builder for this GroupValidateProperties
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param displayName the displayName
     * @param mailNickname the mailNickname
     * @param onBehalfOfUserId the onBehalfOfUserId
     */
    public GroupValidatePropertiesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String displayName, final String mailNickname, final java.util.UUID onBehalfOfUserId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("displayName", displayName);
        bodyParams.put("mailNickname", mailNickname);
        bodyParams.put("onBehalfOfUserId", onBehalfOfUserId);
    }

    /**
     * Creates the IGroupValidatePropertiesRequest
     *
     * @return the IGroupValidatePropertiesRequest instance
     */
    public IGroupValidatePropertiesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupValidatePropertiesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupValidatePropertiesRequest instance
     */
    public IGroupValidatePropertiesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        GroupValidatePropertiesRequest request = new GroupValidatePropertiesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("displayName")) {
            request.body.displayName = getParameter("displayName");
        }

        if (hasParameter("mailNickname")) {
            request.body.mailNickname = getParameter("mailNickname");
        }

        if (hasParameter("onBehalfOfUserId")) {
            request.body.onBehalfOfUserId = getParameter("onBehalfOfUserId");
        }

        return request;
    }
}
