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
 * The class for the Workbook Functions Accr Int Request Builder.
 */
public class WorkbookFunctionsAccrIntRequestBuilder extends BaseWorkbookFunctionsAccrIntRequestBuilder implements IWorkbookFunctionsAccrIntRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAccrInt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param issue the issue
     * @param firstInterest the firstInterest
     * @param settlement the settlement
     * @param rate the rate
     * @param par the par
     * @param frequency the frequency
     * @param basis the basis
     * @param calcMethod the calcMethod
     */
    public WorkbookFunctionsAccrIntRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement issue, final com.google.gson.JsonElement firstInterest, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement par, final com.google.gson.JsonElement frequency, final com.google.gson.JsonElement basis, final com.google.gson.JsonElement calcMethod) {
        super(requestUrl, client, requestOptions, issue, firstInterest, settlement, rate, par, frequency, basis, calcMethod);
    }
}
