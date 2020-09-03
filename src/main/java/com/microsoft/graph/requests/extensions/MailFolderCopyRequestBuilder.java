// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMailFolderCopyRequest;
import com.microsoft.graph.requests.extensions.MailFolderCopyRequest;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Folder Copy Request Builder.
 */
public class MailFolderCopyRequestBuilder extends BaseActionRequestBuilder implements IMailFolderCopyRequestBuilder {

    /**
     * The request builder for this MailFolderCopy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param destinationId the destinationId
     */
    public MailFolderCopyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String destinationId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("destinationId", destinationId);
    }

    /**
     * Creates the IMailFolderCopyRequest
     *
     * @return the IMailFolderCopyRequest instance
     */
    public IMailFolderCopyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMailFolderCopyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMailFolderCopyRequest instance
     */
    public IMailFolderCopyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MailFolderCopyRequest request = new MailFolderCopyRequest(
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
