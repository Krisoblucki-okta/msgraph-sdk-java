// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.VisualInfo;
import com.microsoft.graph.models.generated.Status;
import com.microsoft.graph.models.extensions.ActivityHistoryItem;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.generated.BaseActivityHistoryItemCollectionResponse;
import com.microsoft.graph.requests.extensions.ActivityHistoryItemCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base User Activity.
 */
public class BaseUserActivity extends Entity implements IJsonBackedObject {


    /**
     * The Visual Elements.
     * Required. The object containing information to render the activity in the UX.
     */
    @SerializedName("visualElements")
    @Expose
    public VisualInfo visualElements;

    /**
     * The Activity Source Host.
     * Required. URL for the domain representing the cross-platform identity mapping for the app. Mapping is stored either as a JSON file hosted on the domain or configurable via Windows Dev Center. The JSON file is named cross-platform-app-identifiers and is hosted at root of your HTTPS domain, either at the top level domain or include a sub domain. For example: https://contoso.com or https://myapp.contoso.com but NOT https://myapp.contoso.com/somepath. You must have a unique file and domain (or sub domain) per cross-platform app identity. For example, a separate file and domain is needed for Word vs. PowerPoint.
     */
    @SerializedName("activitySourceHost")
    @Expose
    public String activitySourceHost;

    /**
     * The Activation Url.
     * Required. URL used to launch the activity in the best native experience represented by the appId. Might launch a web-based app if no native app exists.
     */
    @SerializedName("activationUrl")
    @Expose
    public String activationUrl;

    /**
     * The App Activity Id.
     * Required. The unique activity ID in the context of the app - supplied by caller and immutable thereafter.
     */
    @SerializedName("appActivityId")
    @Expose
    public String appActivityId;

    /**
     * The App Display Name.
     * Optional. Short text description of the app used to generate the activity for use in cases when the app is not installed on the user’s local device.
     */
    @SerializedName("appDisplayName")
    @Expose
    public String appDisplayName;

    /**
     * The Content Url.
     * Optional. Used in the event the content can be rendered outside of a native or web-based app experience (for example, a pointer to an item in an RSS feed).
     */
    @SerializedName("contentUrl")
    @Expose
    public String contentUrl;

    /**
     * The Created Date Time.
     * Set by the server. DateTime in UTC when the object was created on the server.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Expiration Date Time.
     * Set by the server. DateTime in UTC when the object expired on the server.
     */
    @SerializedName("expirationDateTime")
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Fallback Url.
     * Optional. URL used to launch the activity in a web-based app, if available.
     */
    @SerializedName("fallbackUrl")
    @Expose
    public String fallbackUrl;

    /**
     * The Last Modified Date Time.
     * Set by the server. DateTime in UTC when the object was modified on the server.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The User Timezone.
     * Optional. The timezone in which the user's device used to generate the activity was located at activity creation time; values supplied as Olson IDs in order to support cross-platform representation.
     */
    @SerializedName("userTimezone")
    @Expose
    public String userTimezone;

    /**
     * The Content Info.
     * Optional. A custom piece of data - JSON-LD extensible description of content according to schema.org syntax.
     */
    @SerializedName("contentInfo")
    @Expose
    public com.google.gson.JsonElement contentInfo;

    /**
     * The Status.
     * Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
     */
    @SerializedName("status")
    @Expose
    public Status status;

    /**
     * The History Items.
     * Optional. NavigationProperty/Containment; navigation property to the activity's historyItems.
     */
    public ActivityHistoryItemCollectionPage historyItems;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("historyItems")) {
            final BaseActivityHistoryItemCollectionResponse response = new BaseActivityHistoryItemCollectionResponse();
            if (json.has("historyItems@odata.nextLink")) {
                response.nextLink = json.get("historyItems@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("historyItems").toString(), JsonObject[].class);
            final ActivityHistoryItem[] array = new ActivityHistoryItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ActivityHistoryItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            historyItems = new ActivityHistoryItemCollectionPage(response, null);
        }
    }
}
