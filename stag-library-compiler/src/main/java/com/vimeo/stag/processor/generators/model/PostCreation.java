package com.vimeo.stag.processor.generators.model;

import com.google.gson.stream.JsonReader;

/**
 * Created by andreguggenberger on 26/02/2017.
 */

public interface PostCreation {

    void objectCreated(JsonReader reader);
}
