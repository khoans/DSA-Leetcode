package com.nskhoa.DSA;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecretMessageDecoder {

    public static void decodeAndPrintGrid(String url) throws Exception {
        String[][] grid = fetchAndProcessDocumentData(url);
        printGrid(grid);
    }

    private static String[][] fetchAndProcessDocumentData(String url) throws Exception {
        Document doc = Jsoup
                .connect(url)
                .get();

        Elements rows = doc.select("table tr");

        List<Cell> cells = new ArrayList<>();

        // Determine the size of the Grid
        int maxX = 0, maxY = 0;

        for (int i = 1; i < rows.size(); i++) {
            Element row = rows.get(i);
            Elements cols = row.select("td");
            if (cols.size() < 3) {
                continue;
            }
            int x = Integer.parseInt(cols
                                             .get(0)
                                             .text()
                                             .trim());
            String ch = cols
                    .get(1)
                    .text();
            int y = Integer.parseInt(cols
                                             .get(2)
                                             .text()
                                             .trim());
            cells.add(new Cell(x, y, ch));
            if (x > maxX) {
                maxX = x;
            }
            if (y > maxY) {
                maxY = y;
            }
        }

        String[][] grid = new String[maxY + 1][maxX + 1];
        for (String[] row : grid) {
            Arrays.fill(row, " ");
        }

        for (Cell cell : cells) {
            grid[cell.y][cell.x] = cell.ch;
        }

        return grid;
    }

    private static void printGrid(String[][] grid) {
        int maxY = grid.length - 1;

        for (int row = maxY; row >= 0; row--) {
            int lastNonSpace = grid[row].length - 1;
            while (lastNonSpace >= 0 && grid[row][lastNonSpace].equals(" ")) {
                lastNonSpace--;
            }
            for (int col = 0; col <= lastNonSpace; col++) {
                System.out.print(grid[row][col]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        decodeAndPrintGrid(
                "https://docs.google.com/document/d/e/2PACX-1vSZ9d7OCd4QMsjJi2VFQmPYLebG2sGqI879_bSPugwOo_fgRcZLAFyfajPWU91UDiLg-RxRD41lVYRA/pub");
    }

    static class Cell {
        int x, y;
        String ch;

        Cell(int x, int y, String ch) {
            this.x = x;
            this.y = y;
            this.ch = ch;
        }
    }

}
