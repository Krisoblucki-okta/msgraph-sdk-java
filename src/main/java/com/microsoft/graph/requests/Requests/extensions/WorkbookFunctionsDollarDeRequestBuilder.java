// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Dollar De Request Builder.
 */
public class WorkbookFunctionsDollarDeRequestBuilder extends BaseWorkbookFunctionsDollarDeRequestBuilder implements IWorkbookFunctionsDollarDeRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDollarDe
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param fractionalDollar the fractionalDollar
     * @param fraction the fraction
     */
    public WorkbookFunctionsDollarDeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement fractionalDollar, final com.google.gson.JsonElement fraction) {
        super(requestUrl, client, requestOptions, fractionalDollar, fraction);
    }
}
