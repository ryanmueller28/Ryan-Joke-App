package com.doane.myapplication;

import java.util.ArrayList;
import java.util.List;

public class jokeSelect {
    String getJoke(String joke){
        String Joke = new String();
        if(joke.equals("Knock-Knock")){
            Joke += ("\"Knock Knock\"\n" +
                    "    \"Who's there?\"\n" +
                    "    \"You know.\"\n" +
                    "    \"You know who?\"");
        }else if (joke.equals("Riddle"))
        {
            Joke += ("This thing all things devours:\n" +
                    "Birds, beasts, trees, flowers;\n" +
                    "Gnaws iron, bites steel;\n" +
                    "Grinds hard stones to meal;\n" +
                    "Slays king, ruins town,\n" +
                    "And beats high mountain down.");
            Joke += ("\n\n\nTime.");
        }else{
            Joke += ("Did you hear about the chameleon who couldn't change color?\n"
                    + "He had a reptile dysfunction.");
        }
        return Joke;
    }
}
