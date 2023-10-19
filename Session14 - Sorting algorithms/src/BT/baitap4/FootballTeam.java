package BT.baitap4;

public class FootballTeam {
    private int Id;
    private String name;
    private int numberOfPlayer;
    private int score;

    public FootballTeam() {
    }

    public FootballTeam(int id, String name, int numberOfPlayer, int score) {
        Id = id;
        this.name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", numberOfPlayer=" + numberOfPlayer +
                ", score=" + score +
                '}'+"\n";
    }
}
