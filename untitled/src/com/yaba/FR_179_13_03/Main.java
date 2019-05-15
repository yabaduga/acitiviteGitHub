package com.yaba.FR_179_13_03;

public class Main {
    static Personne p = new Personne("x", "x");

    public static void main(String[] args) throws Exception {
        int count = 0;

        for (; ; ) {
            count++;
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    p = p.nomme("Manuel", "Antunes");
                    System.out.println(p);
                }
            });
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    p = p.nomme("Bob", "l'Ours");
                    System.out.println(p);
                }
            });
            t1.start();
            t2.start();

            t1.join();
            t2.join();

            String nom = p.getNom();
            String prenom = p.getPrenom();
            assert prenom.equals("Manuel") && nom.equals("Antunes") || prenom.equals("Bob") && nom.equals("l'Ours") || prenom.equals("x") && nom.equals("x") : "Erreur " + prenom + " ," + nom + ", " + count;
        }
    }
}