package com.scurrae.chris.tangazo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.recyclerview.internal.CardArrayRecyclerViewAdapter;
import it.gmariotti.cardslib.library.recyclerview.view.CardRecyclerView;
import it.gmariotti.cardslib.library.view.CardViewNative;

public class Main extends AppCompatActivity {

    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ArrayList<Card> cards = new ArrayList<Card>();
//        Card card = new Card(getBaseContext());

//        //Create a CardHeader
//        CardHeader header = new CardHeader(getBaseContext());
//
//        //Add Header to card
//        card.addCardHeader(header);
//        CardViewNative cardView = (CardViewNative) Main.this.findViewById(R.id.carddemo);
//        cardView.setCard(card);
//
//        Card card1 = new Card(getBaseContext());
//
//        //Create a CardHeader
//        CardHeader header1 = new CardHeader(getBaseContext());
//
//        //Add Header to card
//        card.addCardHeader(header1);
//        CardViewNative cardView1 = (CardViewNative) Main.this.findViewById(R.id.carddemo);
//        cardView1.setCard(card);


        //Create a Card
        Card card = new Card(getBaseContext());

        //Create a CardHeader
        CardHeader header = new CardHeader(getBaseContext());

        //Add Header to card
        card.addCardHeader(header);

        cards.add(card);


        //Create a Card
        Card card2 = new Card(getBaseContext());

        //Create a CardHeader
        CardHeader header2 = new CardHeader(getBaseContext());

        //Add Header to card
        card.addCardHeader(header2);

        cards.add(card2);


        Card card3 = new Card(getBaseContext());

        //Create a CardHeader
        CardHeader header3 = new CardHeader(getBaseContext());

        //Add Header to card
        card.addCardHeader(header3);

        cards.add(card3);



        CardArrayRecyclerViewAdapter mCardArrayAdapter = new CardArrayRecyclerViewAdapter(Main.this, cards);

        //Staggered grid view
        CardRecyclerView mRecyclerView = (CardRecyclerView) Main.this.findViewById(R.id.carddemo_recyclerview);
        mRecyclerView.setHasFixedSize(false);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(Main.this));

        //Set the empty view
        if (mRecyclerView != null) {
            mRecyclerView.setAdapter(mCardArrayAdapter);
        }
    }


}
