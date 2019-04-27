package objetsmetiers;

 class Revue extends Document{

    int nbPages=-1;



    public Revue(String titre, int nbPages) {
        super(titre);
        this.nbPages=nbPages;
    }

    @Override
    public String getInfos(){

        return super.getInfos()+ " en "  + nbPages + " pages ";
    }
}

