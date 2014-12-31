package com.example.bfinerocks.flashcard.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;

import com.example.bfinerocks.flashcard.R;
import com.example.bfinerocks.flashcard.fragments.FlashCardGeneratorFragment;

/**
 * Created by BFineRocks on 12/30/14.
 */
public class FlashCardGeneratorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_card_generator);
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.container, new FlashCardGeneratorFragment())
                .commit();

        Bundle bundle = getIntent().getExtras();
//        Deck deck = bundle.getParcelable("com.example.bfinerocks.flashcard.models.Deck");
          Log.i("deck", bundle.getParcelable("com.example.bfinerocks.flashcard.models.Deck").toString());
 //       Log.i("deck", bundle.getParcelableArrayList("com.example.bfinerocks.flashcard.models.Deck").toString());
    }
}
