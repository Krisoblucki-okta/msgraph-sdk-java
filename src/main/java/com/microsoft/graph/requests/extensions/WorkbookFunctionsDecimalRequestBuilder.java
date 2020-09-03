// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDecimalRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDecimalRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Decimal Request Builder.
 */
public class WorkbookFunctionsDecimalRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsDecimalRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDecimal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param radix the radix
     */
    public WorkbookFunctionsDecimalRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement radix) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("radix", radix);
    }

    /**
     * Creates the IWorkbookFunctionsDecimalRequest
     *
     * @return the IWorkbookFunctionsDecimalRequest instance
     */
    public IWorkbookFunctionsDecimalRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDecimalRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDecimalRequest instance
     */
    public IWorkbookFunctionsDecimalRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsDecimalRequest request = new WorkbookFunctionsDecimalRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("radix")) {
            request.body.radix = getParameter("radix");
        }

        return request;
    }
}
