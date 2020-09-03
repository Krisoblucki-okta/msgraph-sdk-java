// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsExpon_DistRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsExpon_DistRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Expon_Dist Request Builder.
 */
public class WorkbookFunctionsExpon_DistRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsExpon_DistRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsExpon_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param lambda the lambda
     * @param cumulative the cumulative
     */
    public WorkbookFunctionsExpon_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement lambda, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
        bodyParams.put("lambda", lambda);
        bodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsExpon_DistRequest
     *
     * @return the IWorkbookFunctionsExpon_DistRequest instance
     */
    public IWorkbookFunctionsExpon_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsExpon_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsExpon_DistRequest instance
     */
    public IWorkbookFunctionsExpon_DistRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsExpon_DistRequest request = new WorkbookFunctionsExpon_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("lambda")) {
            request.body.lambda = getParameter("lambda");
        }

        if (hasParameter("cumulative")) {
            request.body.cumulative = getParameter("cumulative");
        }

        return request;
    }
}
