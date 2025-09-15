import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
   
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // row ka pehla element

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1); // har row ka first element 1 hota hai

            for (int j = 1; j < row.size(); j++) {
                newRow.add(row.get(j - 1) + row.get(j)); 
                // beech ke elements = upar ke do elements ka sum
            }

            newRow.add(1); // har row ka last element bhi 1 hota hai
            row = newRow;  // ab next loop ke liye newRow ko current row bana diya
        }

        return row;
    }
}


