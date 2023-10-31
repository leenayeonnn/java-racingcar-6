package model.domain;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    private List<Name> winner;

    public Winner(){
        winner = new ArrayList<>();
    }

    public List<Name> getWinner() {
        return winner;
    }

    @Override
    public String toString() {

        StringBuilder message = new StringBuilder();

        for(int i = 0; i < winner.size(); i++){

            String name = winner.get(i).getName();
            message.append(name);

            if(i != (winner.size() - 1)){
                message.append(", ");
            }
        }

        return message.toString();
    }

    public void add(Name name){
        winner.add(name);
    }

    public void clear(){
        winner.clear();
    }

}
