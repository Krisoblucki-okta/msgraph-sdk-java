// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidWorkProfileCompliancePolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Work Profile Compliance Policy Request.
 */
public interface IAndroidWorkProfileCompliancePolicyRequest extends IHttpRequest {

    /**
     * Gets the AndroidWorkProfileCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidWorkProfileCompliancePolicy> callback);

    /**
     * Gets the AndroidWorkProfileCompliancePolicy from the service
     *
     * @return the AndroidWorkProfileCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileCompliancePolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidWorkProfileCompliancePolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidWorkProfileCompliancePolicy with a source
     *
     * @param sourceAndroidWorkProfileCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidWorkProfileCompliancePolicy sourceAndroidWorkProfileCompliancePolicy, final ICallback<AndroidWorkProfileCompliancePolicy> callback);

    /**
     * Patches this AndroidWorkProfileCompliancePolicy with a source
     *
     * @param sourceAndroidWorkProfileCompliancePolicy the source object with updates
     * @return the updated AndroidWorkProfileCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileCompliancePolicy patch(final AndroidWorkProfileCompliancePolicy sourceAndroidWorkProfileCompliancePolicy) throws ClientException;

    /**
     * Posts a AndroidWorkProfileCompliancePolicy with a new object
     *
     * @param newAndroidWorkProfileCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidWorkProfileCompliancePolicy newAndroidWorkProfileCompliancePolicy, final ICallback<AndroidWorkProfileCompliancePolicy> callback);

    /**
     * Posts a AndroidWorkProfileCompliancePolicy with a new object
     *
     * @param newAndroidWorkProfileCompliancePolicy the new object to create
     * @return the created AndroidWorkProfileCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileCompliancePolicy post(final AndroidWorkProfileCompliancePolicy newAndroidWorkProfileCompliancePolicy) throws ClientException;

    /**
     * Posts a AndroidWorkProfileCompliancePolicy with a new object
     *
     * @param newAndroidWorkProfileCompliancePolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidWorkProfileCompliancePolicy newAndroidWorkProfileCompliancePolicy, final ICallback<AndroidWorkProfileCompliancePolicy> callback);

    /**
     * Posts a AndroidWorkProfileCompliancePolicy with a new object
     *
     * @param newAndroidWorkProfileCompliancePolicy the object to create/update
     * @return the created AndroidWorkProfileCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileCompliancePolicy put(final AndroidWorkProfileCompliancePolicy newAndroidWorkProfileCompliancePolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidWorkProfileCompliancePolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidWorkProfileCompliancePolicyRequest expand(final String value);

}

