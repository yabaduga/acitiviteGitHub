package com.yaba.FR_179_14_04;

import com.sun.xml.internal.ws.resources.SoapMessages;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class SommeMatrice extends RecursiveTask <Double> {
    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     */

    double [][] datas;
    int ligne1;
    int ligne2;

    SommeMatrice(double[][] entree, int ligne1, int ligne2) {
        datas = entree;
        this.ligne1=ligne1;
        this.ligne2=ligne2;
    }
    @Override
    protected Double compute() {
        double  retval=0;

        for (int i=ligne1;i<=ligne2;i++)
            for (int j=0;j<datas[i].length;j++) {
                retval+=datas[i][j];


            }

        return retval;

    }
}
