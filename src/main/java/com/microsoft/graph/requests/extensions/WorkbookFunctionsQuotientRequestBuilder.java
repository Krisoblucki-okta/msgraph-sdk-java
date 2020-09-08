// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsQuotientRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsQuotientRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Quotient Request Builder.
 */
public class WorkbookFunctionsQuotientRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsQuotientRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsQuotient
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param numerator the numerator
     * @param denominator the denominator
     */
    public WorkbookFunctionsQuotientRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement numerator, final com.google.gson.JsonElement denominator) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("numerator", numerator);
        bodyParams.put("denominator", denominator);
    }

    /**
     * Creates the IWorkbookFunctionsQuotientRequest
     *
     * @return the IWorkbookFunctionsQuotientRequest instance
     */
    public IWorkbookFunctionsQuotientRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsQuotientRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsQuotientRequest instance
     */
    public IWorkbookFunctionsQuotientRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsQuotientRequest request = new WorkbookFunctionsQuotientRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("numerator")) {
            request.body.numerator = getParameter("numerator");
        }

        if (hasParameter("denominator")) {
            request.body.denominator = getParameter("denominator");
        }

        return request;
    }
}
