package com.scurrae.chris.tangazo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardViewNative;

public class Main extends AppCompatActivity {

    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Card card = new Card(getBaseContext());

        //Create a CardHeader
        CardHeader header = new CardHeader(getBaseContext());

        //Add Header to card
        card.addCardHeader(header);
        CardViewNative cardView = (CardViewNative) Main.this.findViewById(R.id.carddemo);
        cardView.setCard(card);
    }


}
