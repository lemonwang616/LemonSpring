package main.java.kinghts;

public class BraveKinghts implements Knight {

    private Quest quest;

    public BraveKinghts(Quest quest){
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
