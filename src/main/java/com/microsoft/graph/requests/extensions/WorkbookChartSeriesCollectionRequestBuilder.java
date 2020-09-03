// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.models.extensions.WorkbookChartSeries;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesCollectionRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesCountRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesItemAtRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Series Collection Request Builder.
 */
public class WorkbookChartSeriesCollectionRequestBuilder extends BaseRequestBuilder implements IWorkbookChartSeriesCollectionRequestBuilder {

    /**
     * The request builder for this collection of WorkbookChart
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartSeriesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWorkbookChartSeriesCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWorkbookChartSeriesCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookChartSeriesCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookChartSeriesRequestBuilder byId(final String id) {
        return new WorkbookChartSeriesRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IWorkbookChartSeriesCountRequestBuilder count() {
        return new WorkbookChartSeriesCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }

    public IWorkbookChartSeriesItemAtRequestBuilder itemAt(final Integer index) {
        return new WorkbookChartSeriesItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }
}
