// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAtan2Request;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsAtan2Request;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Atan2Request Builder.
 */
public class WorkbookFunctionsAtan2RequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsAtan2RequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAtan2
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param xNum the xNum
     * @param yNum the yNum
     */
    public WorkbookFunctionsAtan2RequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement xNum, final com.google.gson.JsonElement yNum) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("xNum", xNum);
        bodyParams.put("yNum", yNum);
    }

    /**
     * Creates the IWorkbookFunctionsAtan2Request
     *
     * @return the IWorkbookFunctionsAtan2Request instance
     */
    public IWorkbookFunctionsAtan2Request buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsAtan2Request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAtan2Request instance
     */
    public IWorkbookFunctionsAtan2Request buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsAtan2Request request = new WorkbookFunctionsAtan2Request(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("xNum")) {
            request.body.xNum = getParameter("xNum");
        }

        if (hasParameter("yNum")) {
            request.body.yNum = getParameter("yNum");
        }

        return request;
    }
}
