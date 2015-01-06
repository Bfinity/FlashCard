package com.example.bfinerocks.flashcard.models;

import android.os.Parcel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BFineRocks on 12/28/14.
 */
public class Deck implements android.os.Parcelable {
    private ArrayList<WordCard> myDeck;
    private String deckName;
    private String fireabaseID;

    public Deck(String deckName){
        this.deckName = deckName;
        myDeck = new ArrayList<WordCard>();
    }

    public Deck(){

    }

    public String getDeckName(){
        return deckName;
    }

    public void addWordCardToDeck(WordCard wordCard){
        myDeck.add(wordCard);
    }

    public void addListOfWordCardsToDeck(List<WordCard> listOfCards){
        myDeck.addAll(listOfCards);
    }

    public WordCard getWordCardFromDeck(int cardNumber){
        return myDeck.get(cardNumber);
    }

    public void editAWordCardInDeck(int cardEditedNumber, WordCard editedWordCard){
        myDeck.set(cardEditedNumber, editedWordCard);
    }

    public List<WordCard> getMyDeck(){
        return myDeck;
    }

    public void setFireabaseID(String fireabaseID){
        this.fireabaseID = fireabaseID;
    }

    public String getFireabaseID(){
        return fireabaseID;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.myDeck);
     //   dest.writeSerializable(this.myDeck);
        dest.writeString(this.deckName);
    }

    private Deck(Parcel in) {
      //  this.myDeck = (ArrayList<WordCard>) in.readSerializable();
        this.myDeck = new ArrayList<WordCard>();
        in.readTypedList(myDeck, WordCard.CREATOR);
        this.deckName = in.readString();
    }

    public static final Creator<Deck> CREATOR = new Creator<Deck>() {
        public Deck createFromParcel(Parcel source) {
            return new Deck(source);
        }

        public Deck[] newArray(int size) {
            return new Deck[size];
        }
    };
}
