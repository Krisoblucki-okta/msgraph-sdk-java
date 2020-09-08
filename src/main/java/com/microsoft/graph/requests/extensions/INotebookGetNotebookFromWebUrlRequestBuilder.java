// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.INotebookGetNotebookFromWebUrlRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Notebook Get Notebook From Web Url Request Builder.
 */
public interface INotebookGetNotebookFromWebUrlRequestBuilder extends IRequestBuilder {

    /**
     * Creates the INotebookGetNotebookFromWebUrlRequest
     *
     * @return the INotebookGetNotebookFromWebUrlRequest instance
     */
    INotebookGetNotebookFromWebUrlRequest buildRequest();

    /**
     * Creates the INotebookGetNotebookFromWebUrlRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the INotebookGetNotebookFromWebUrlRequest instance
     */
    INotebookGetNotebookFromWebUrlRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
