// Problem 102: Triangle Containment

class Problem_102 {
    public boolean isPointInTriangle(int px, int py, int x1, int y1, int x2, int y2, int x3, int y3) {
        int areaOrig = triangleArea(x1, y1, x2, y2, x3, y3);
        int area1 = triangleArea(px, py, x2, y2, x3, y3);
        int area2 = triangleArea(x1, y1, px, py, x3, y3);
        int area3 = triangleArea(x1, y1, x2, y2, px, py);

        return areaOrig == area1 + area2 + area3;
    }

    private int triangleArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);
    }
}


