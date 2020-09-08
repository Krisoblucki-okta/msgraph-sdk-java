// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyFontColorFilterRequest;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyFontColorFilterRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Font Color Filter Request Builder.
 */
public class WorkbookFilterApplyFontColorFilterRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFilterApplyFontColorFilterRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyFontColorFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param color the color
     */
    public WorkbookFilterApplyFontColorFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String color) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("color", color);
    }

    /**
     * Creates the IWorkbookFilterApplyFontColorFilterRequest
     *
     * @return the IWorkbookFilterApplyFontColorFilterRequest instance
     */
    public IWorkbookFilterApplyFontColorFilterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFilterApplyFontColorFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyFontColorFilterRequest instance
     */
    public IWorkbookFilterApplyFontColorFilterRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFilterApplyFontColorFilterRequest request = new WorkbookFilterApplyFontColorFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("color")) {
            request.body.color = getParameter("color");
        }

        return request;
    }
}
