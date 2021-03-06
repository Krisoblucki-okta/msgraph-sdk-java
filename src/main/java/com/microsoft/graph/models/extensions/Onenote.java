// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Notebook;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.models.extensions.OnenotePage;
import com.microsoft.graph.models.extensions.OnenoteResource;
import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.models.extensions.OnenoteSection;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.NotebookCollectionResponse;
import com.microsoft.graph.requests.extensions.NotebookCollectionPage;
import com.microsoft.graph.requests.extensions.OnenoteOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.OnenoteOperationCollectionPage;
import com.microsoft.graph.requests.extensions.OnenotePageCollectionResponse;
import com.microsoft.graph.requests.extensions.OnenotePageCollectionPage;
import com.microsoft.graph.requests.extensions.OnenoteResourceCollectionResponse;
import com.microsoft.graph.requests.extensions.OnenoteResourceCollectionPage;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionResponse;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionPage;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionResponse;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote.
 */
public class Onenote extends Entity implements IJsonBackedObject {


    /**
     * The Notebooks.
     * The collection of OneNote notebooks that are owned by the user or group. Read-only. Nullable.
     */
    public NotebookCollectionPage notebooks;

    /**
     * The Operations.
     * The status of OneNote operations. Getting an operations collection is not supported, but you can get the status of long-running operations if the Operation-Location header is returned in the response. Read-only. Nullable.
     */
    public OnenoteOperationCollectionPage operations;

    /**
     * The Pages.
     * The pages in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     */
    public OnenotePageCollectionPage pages;

    /**
     * The Resources.
     * The image and other file resources in OneNote pages. Getting a resources collection is not supported, but you can get the binary content of a specific resource. Read-only. Nullable.
     */
    public OnenoteResourceCollectionPage resources;

    /**
     * The Section Groups.
     * The section groups in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     */
    public SectionGroupCollectionPage sectionGroups;

    /**
     * The Sections.
     * The sections in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     */
    public OnenoteSectionCollectionPage sections;


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


        if (json.has("notebooks")) {
            final NotebookCollectionResponse response = new NotebookCollectionResponse();
            if (json.has("notebooks@odata.nextLink")) {
                response.nextLink = json.get("notebooks@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("notebooks").toString(), JsonObject[].class);
            final Notebook[] array = new Notebook[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Notebook.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            notebooks = new NotebookCollectionPage(response, null);
        }

        if (json.has("operations")) {
            final OnenoteOperationCollectionResponse response = new OnenoteOperationCollectionResponse();
            if (json.has("operations@odata.nextLink")) {
                response.nextLink = json.get("operations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("operations").toString(), JsonObject[].class);
            final OnenoteOperation[] array = new OnenoteOperation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OnenoteOperation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            operations = new OnenoteOperationCollectionPage(response, null);
        }

        if (json.has("pages")) {
            final OnenotePageCollectionResponse response = new OnenotePageCollectionResponse();
            if (json.has("pages@odata.nextLink")) {
                response.nextLink = json.get("pages@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("pages").toString(), JsonObject[].class);
            final OnenotePage[] array = new OnenotePage[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OnenotePage.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            pages = new OnenotePageCollectionPage(response, null);
        }

        if (json.has("resources")) {
            final OnenoteResourceCollectionResponse response = new OnenoteResourceCollectionResponse();
            if (json.has("resources@odata.nextLink")) {
                response.nextLink = json.get("resources@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("resources").toString(), JsonObject[].class);
            final OnenoteResource[] array = new OnenoteResource[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OnenoteResource.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            resources = new OnenoteResourceCollectionPage(response, null);
        }

        if (json.has("sectionGroups")) {
            final SectionGroupCollectionResponse response = new SectionGroupCollectionResponse();
            if (json.has("sectionGroups@odata.nextLink")) {
                response.nextLink = json.get("sectionGroups@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("sectionGroups").toString(), JsonObject[].class);
            final SectionGroup[] array = new SectionGroup[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SectionGroup.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            sectionGroups = new SectionGroupCollectionPage(response, null);
        }

        if (json.has("sections")) {
            final OnenoteSectionCollectionResponse response = new OnenoteSectionCollectionResponse();
            if (json.has("sections@odata.nextLink")) {
                response.nextLink = json.get("sections@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("sections").toString(), JsonObject[].class);
            final OnenoteSection[] array = new OnenoteSection[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OnenoteSection.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            sections = new OnenoteSectionCollectionPage(response, null);
        }
    }
}
