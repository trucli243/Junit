/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ktsnt;

import testSNT.ktNt;


/**
 *
 * @author admin
 */
public class KtSNT {

    public static void main(String[] args) {
        int []a = {2,3,5,6,4,8,9,11};
        int sum = 0;
        for (int x:a)
            if (ktNt.ktNt(x) == true)
                sum += x;
        System.out.println(sum);
    }
}
