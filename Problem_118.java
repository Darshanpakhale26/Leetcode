// 118 Given a non-empty array of integers, return the triangle of Pascal's.

class Problem_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
            List<Integer> row = new ArrayList<>();
            for (int colIndex = 0; colIndex <= rowIndex; colIndex++) {
                if (colIndex == 0 || colIndex == rowIndex) {
                    row.add(1);
                } else {
                    int leftParent = triangle.get(rowIndex - 1).get(colIndex - 1);
                    int rightParent = triangle.get(rowIndex - 1).get(colIndex);
                    row.add(leftParent + rightParent);
                }
            }
            triangle.add(row);
        }
        
        return triangle;
    }
}
