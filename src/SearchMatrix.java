import javax.swing.*;//����һ����ʾ�ı�

public class SearchMatrix {

	public static void main(String[] args) {
		int target=9;
		int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
       System.out.println(searchMatrix(arr, target)) ;
     JOptionPane.showMessageDialog(null, searchMatrix(arr, 9),"�������Ƿ����ҵ�"+target,JOptionPane.INFORMATION_MESSAGE);
     
    }

    public static boolean searchMatrix(int[][] matrix, int target) { //������
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
	}
	
	
    }
    
    
    
    

