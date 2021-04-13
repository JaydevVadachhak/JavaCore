/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author jaydev
 */
public class Array3D {
    public static void main(String[] args){
        int array3d [][][] = new int [3][4][5];
        int i,j,k;
        
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                for(k=0;k<5;k++){
                    array3d[i][j][k]=i*j*k;
                }
            }
        }
            
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                for(k=0;k<5;k++){
                    System.out.println(array3d[i][j][k]+ " ");
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
