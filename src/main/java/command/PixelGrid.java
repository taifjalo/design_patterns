package command;

public class PixelGrid {
    private final int GRID_WIDTH = 8;
    private final int GRID_HEIGHT = 8;
    private int[][] grid;
    private int x = 0;
    private int y = 0;
    private GUI gui;

    public PixelGrid(GUI gui) {
        grid = new int[GRID_HEIGHT][GRID_WIDTH];
        for (int i = 0; i < GRID_HEIGHT; i++) {
            for (int j = 0; j < GRID_WIDTH; j++) {
                grid[i][j] = 0;
            }
        }

        this.gui = gui;
    }

    public PixelGrid(int[][] grid, GUI gui) {
        this.grid = grid;
        this.gui = gui;
    }

    public int[][] getGrid() {
        return grid;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveUp() {
        x = Math.max(0, x - 1);
        gui.setCursor();
    }

    public void moveDown() {
        x = Math.min(grid.length - 1, x + 1);
        gui.setCursor();
    }

    public void moveLeft() {
        y = Math.max(0, y - 1);
        gui.setCursor();
    }

    public void moveRight() {
        y = Math.min(grid[0].length - 1, y + 1);
        gui.setCursor();
    }

    public void togglePixel() {
        if (grid[x][y] == 1) {
            grid[x][y] = 0;
        } else {
            grid[x][y] = 1;
        }
        gui.togglePixel();
    }

    public void generateCode() {
        System.out.println("int[][] pixelArt = {");
        for (int i = 0; i < grid.length; i++) {
            System.out.print("    { ");
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
                if (j < grid[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("},");
        }
        System.out.println("};\n");
    }
}