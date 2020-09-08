// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidCompliancePolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Compliance Policy Request.
 */
public interface IAndroidCompliancePolicyRequest extends IHttpRequest {

    /**
     * Gets the AndroidCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidCompliancePolicy> callback);

    /**
     * Gets the AndroidCompliancePolicy from the service
     *
     * @return the AndroidCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidCompliancePolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidCompliancePolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidCompliancePolicy with a source
     *
     * @param sourceAndroidCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidCompliancePolicy sourceAndroidCompliancePolicy, final ICallback<AndroidCompliancePolicy> callback);

    /**
     * Patches this AndroidCompliancePolicy with a source
     *
     * @param sourceAndroidCompliancePolicy the source object with updates
     * @return the updated AndroidCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidCompliancePolicy patch(final AndroidCompliancePolicy sourceAndroidCompliancePolicy) throws ClientException;

    /**
     * Posts a AndroidCompliancePolicy with a new object
     *
     * @param newAndroidCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidCompliancePolicy newAndroidCompliancePolicy, final ICallback<AndroidCompliancePolicy> callback);

    /**
     * Posts a AndroidCompliancePolicy with a new object
     *
     * @param newAndroidCompliancePolicy the new object to create
     * @return the created AndroidCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidCompliancePolicy post(final AndroidCompliancePolicy newAndroidCompliancePolicy) throws ClientException;

    /**
     * Posts a AndroidCompliancePolicy with a new object
     *
     * @param newAndroidCompliancePolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidCompliancePolicy newAndroidCompliancePolicy, final ICallback<AndroidCompliancePolicy> callback);

    /**
     * Posts a AndroidCompliancePolicy with a new object
     *
     * @param newAndroidCompliancePolicy the object to create/update
     * @return the created AndroidCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidCompliancePolicy put(final AndroidCompliancePolicy newAndroidCompliancePolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidCompliancePolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidCompliancePolicyRequest expand(final String value);

}

