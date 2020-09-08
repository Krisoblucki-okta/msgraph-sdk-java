// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RecordOperation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Record Operation Request.
 */
public interface IRecordOperationRequest extends IHttpRequest {

    /**
     * Gets the RecordOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<RecordOperation> callback);

    /**
     * Gets the RecordOperation from the service
     *
     * @return the RecordOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RecordOperation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<RecordOperation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this RecordOperation with a source
     *
     * @param sourceRecordOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final RecordOperation sourceRecordOperation, final ICallback<RecordOperation> callback);

    /**
     * Patches this RecordOperation with a source
     *
     * @param sourceRecordOperation the source object with updates
     * @return the updated RecordOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RecordOperation patch(final RecordOperation sourceRecordOperation) throws ClientException;

    /**
     * Posts a RecordOperation with a new object
     *
     * @param newRecordOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final RecordOperation newRecordOperation, final ICallback<RecordOperation> callback);

    /**
     * Posts a RecordOperation with a new object
     *
     * @param newRecordOperation the new object to create
     * @return the created RecordOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RecordOperation post(final RecordOperation newRecordOperation) throws ClientException;

    /**
     * Posts a RecordOperation with a new object
     *
     * @param newRecordOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final RecordOperation newRecordOperation, final ICallback<RecordOperation> callback);

    /**
     * Posts a RecordOperation with a new object
     *
     * @param newRecordOperation the object to create/update
     * @return the created RecordOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RecordOperation put(final RecordOperation newRecordOperation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRecordOperationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRecordOperationRequest expand(final String value);

}

