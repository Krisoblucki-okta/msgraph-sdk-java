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
import com.microsoft.graph.models.extensions.TeamMemberSettings;
import com.microsoft.graph.models.extensions.TeamGuestSettings;
import com.microsoft.graph.models.extensions.TeamMessagingSettings;
import com.microsoft.graph.models.extensions.TeamFunSettings;
import com.microsoft.graph.models.extensions.Channel;
import com.microsoft.graph.models.extensions.TeamsAppInstallation;
import com.microsoft.graph.models.extensions.TeamsAsyncOperation;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.generated.BaseChannelCollectionResponse;
import com.microsoft.graph.requests.extensions.ChannelCollectionPage;
import com.microsoft.graph.requests.generated.BaseTeamsAppInstallationCollectionResponse;
import com.microsoft.graph.requests.extensions.TeamsAppInstallationCollectionPage;
import com.microsoft.graph.requests.generated.BaseTeamsAsyncOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.TeamsAsyncOperationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Team.
 */
public class BaseTeam extends Entity implements IJsonBackedObject {


    /**
     * The Web Url.
     * A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not parsed.
     */
    @SerializedName("webUrl")
    @Expose
    public String webUrl;

    /**
     * The Member Settings.
     * Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the team.
     */
    @SerializedName("memberSettings")
    @Expose
    public TeamMemberSettings memberSettings;

    /**
     * The Guest Settings.
     * Settings to configure whether guests can create, update, or delete channels in the team.
     */
    @SerializedName("guestSettings")
    @Expose
    public TeamGuestSettings guestSettings;

    /**
     * The Messaging Settings.
     * Settings to configure messaging and mentions in the team.
     */
    @SerializedName("messagingSettings")
    @Expose
    public TeamMessagingSettings messagingSettings;

    /**
     * The Fun Settings.
     * Settings to configure use of Giphy, memes, and stickers in the team.
     */
    @SerializedName("funSettings")
    @Expose
    public TeamFunSettings funSettings;

    /**
     * The Is Archived.
     * Whether this team is in read-only mode.
     */
    @SerializedName("isArchived")
    @Expose
    public Boolean isArchived;

    /**
     * The Channels.
     * The collection of channels &amp; messages associated with the team.
     */
    public ChannelCollectionPage channels;

    /**
     * The Installed Apps.
     * The apps installed in this team.
     */
    public TeamsAppInstallationCollectionPage installedApps;

    /**
     * The Operations.
     * 
     */
    public TeamsAsyncOperationCollectionPage operations;


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


        if (json.has("channels")) {
            final BaseChannelCollectionResponse response = new BaseChannelCollectionResponse();
            if (json.has("channels@odata.nextLink")) {
                response.nextLink = json.get("channels@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("channels").toString(), JsonObject[].class);
            final Channel[] array = new Channel[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Channel.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            channels = new ChannelCollectionPage(response, null);
        }

        if (json.has("installedApps")) {
            final BaseTeamsAppInstallationCollectionResponse response = new BaseTeamsAppInstallationCollectionResponse();
            if (json.has("installedApps@odata.nextLink")) {
                response.nextLink = json.get("installedApps@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("installedApps").toString(), JsonObject[].class);
            final TeamsAppInstallation[] array = new TeamsAppInstallation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TeamsAppInstallation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            installedApps = new TeamsAppInstallationCollectionPage(response, null);
        }

        if (json.has("operations")) {
            final BaseTeamsAsyncOperationCollectionResponse response = new BaseTeamsAsyncOperationCollectionResponse();
            if (json.has("operations@odata.nextLink")) {
                response.nextLink = json.get("operations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("operations").toString(), JsonObject[].class);
            final TeamsAsyncOperation[] array = new TeamsAsyncOperation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TeamsAsyncOperation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            operations = new TeamsAsyncOperationCollectionPage(response, null);
        }
    }
}
