// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ApplePushNotificationCertificate;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Apple Push Notification Certificate Request.
 */
public interface IApplePushNotificationCertificateRequest extends IHttpRequest {

    /**
     * Gets the ApplePushNotificationCertificate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ApplePushNotificationCertificate> callback);

    /**
     * Gets the ApplePushNotificationCertificate from the service
     *
     * @return the ApplePushNotificationCertificate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplePushNotificationCertificate get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ApplePushNotificationCertificate> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ApplePushNotificationCertificate with a source
     *
     * @param sourceApplePushNotificationCertificate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ApplePushNotificationCertificate sourceApplePushNotificationCertificate, final ICallback<ApplePushNotificationCertificate> callback);

    /**
     * Patches this ApplePushNotificationCertificate with a source
     *
     * @param sourceApplePushNotificationCertificate the source object with updates
     * @return the updated ApplePushNotificationCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplePushNotificationCertificate patch(final ApplePushNotificationCertificate sourceApplePushNotificationCertificate) throws ClientException;

    /**
     * Posts a ApplePushNotificationCertificate with a new object
     *
     * @param newApplePushNotificationCertificate the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ApplePushNotificationCertificate newApplePushNotificationCertificate, final ICallback<ApplePushNotificationCertificate> callback);

    /**
     * Posts a ApplePushNotificationCertificate with a new object
     *
     * @param newApplePushNotificationCertificate the new object to create
     * @return the created ApplePushNotificationCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplePushNotificationCertificate post(final ApplePushNotificationCertificate newApplePushNotificationCertificate) throws ClientException;

    /**
     * Posts a ApplePushNotificationCertificate with a new object
     *
     * @param newApplePushNotificationCertificate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ApplePushNotificationCertificate newApplePushNotificationCertificate, final ICallback<ApplePushNotificationCertificate> callback);

    /**
     * Posts a ApplePushNotificationCertificate with a new object
     *
     * @param newApplePushNotificationCertificate the object to create/update
     * @return the created ApplePushNotificationCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplePushNotificationCertificate put(final ApplePushNotificationCertificate newApplePushNotificationCertificate) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IApplePushNotificationCertificateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IApplePushNotificationCertificateRequest expand(final String value);

}

