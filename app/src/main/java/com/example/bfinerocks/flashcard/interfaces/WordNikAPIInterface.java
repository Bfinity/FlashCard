package com.example.bfinerocks.flashcard.interfaces;

import org.json.JSONObject;

/**
 * Created by BFineRocks on 12/19/14.
 */
public interface WordNikAPIInterface {
    public void onWordNikCallSuccess(JSONObject jsonObject);
    public void onWordNikCallFailure();
}
