// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupSetting;
import com.microsoft.graph.requests.extensions.IGroupSettingCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.GroupSettingCollectionPage;
import com.microsoft.graph.requests.extensions.GroupSettingCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Setting Collection Page.
 */
public class GroupSettingCollectionPage extends BaseCollectionPage<GroupSetting, IGroupSettingCollectionRequestBuilder> implements IGroupSettingCollectionPage {

    /**
     * A collection page for GroupSetting
     *
     * @param response the serialized GroupSettingCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupSettingCollectionPage(final GroupSettingCollectionResponse response, final IGroupSettingCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
