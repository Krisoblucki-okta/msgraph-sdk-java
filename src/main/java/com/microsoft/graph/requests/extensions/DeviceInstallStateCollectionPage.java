// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceInstallState;
import com.microsoft.graph.requests.extensions.IDeviceInstallStateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceInstallStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceInstallStateCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Install State Collection Page.
 */
public class DeviceInstallStateCollectionPage extends BaseCollectionPage<DeviceInstallState, IDeviceInstallStateCollectionRequestBuilder> implements IDeviceInstallStateCollectionPage {

    /**
     * A collection page for DeviceInstallState
     *
     * @param response the serialized DeviceInstallStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceInstallStateCollectionPage(final DeviceInstallStateCollectionResponse response, final IDeviceInstallStateCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
