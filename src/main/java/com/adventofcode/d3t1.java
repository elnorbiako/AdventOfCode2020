package com.adventofcode;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class d3t1 {


    public static void main(String[] args) {


        String data = ".#..........#......#..#.....#..\n" +
                "....#.............#.#....#..#..\n" +
                ".....##...###....#..#.......#..\n" +
                ".#....#..#......#........#.....\n" +
                ".#.........###.#..........##...\n" +
                "...............##........#.....\n" +
                "#..#..........#..##..#....#.#..\n" +
                "....#.##....#..#...#.#....#....\n" +
                "...###...#............#.#......\n" +
                "#.........#..#...............#.\n" +
                "#.#...........#...............#\n" +
                "..#.#......#..###.#...#..##....\n" +
                ".....#..#..#..#............#...\n" +
                "......#.......#.....#....##....\n" +
                "#......#...#.......#.#.#.......\n" +
                "...........##.#.............#..\n" +
                ".#.........#..#.####...........\n" +
                "..#...........#....##..........\n" +
                "#...........#.......#..#.#.....\n" +
                ".....##...#.....#..##..#..#....\n" +
                "#.#..........................#.\n" +
                "##.....#..........#.......##..#\n" +
                "....#..#............#.#.#......\n" +
                ".......#.......#..#............\n" +
                "...#.#..........#..#.....#.....\n" +
                ".....#...##..##.....##........#\n" +
                ".#.....#........##............#\n" +
                "..#....#.#...#.....#.##........\n" +
                "........##.....#......##...##..\n" +
                "......#..................#.....\n" +
                "..##......##.....##...##.......\n" +
                "......#..#...##......##........\n" +
                ".#..#..#.#.....................\n" +
                ".#....#.#...#....#.......##...#\n" +
                ".####.#..##...#.#.#....#...#...\n" +
                ".#....#.....#...#..#.........##\n" +
                "...........#.#####.#.#..##..#..\n" +
                ".#......##...#..###.#.#....#...\n" +
                "...#.....#........#..###...#...\n" +
                ".......#................##.#...\n" +
                ".##...#.#..................#...\n" +
                "..#........#....#..........#..#\n" +
                "..#.........#..................\n" +
                "...#.#..........#.#..##........\n" +
                "...#.##..........##...........#\n" +
                "...........#..#........#.......\n" +
                ".#....#.#...........#....#.##..\n" +
                ".#...#..#............#....#.#..\n" +
                "...#..#...#.........####.#.#...\n" +
                "..#...#...........###..#...##.#\n" +
                "......##...#.#.#....##....#....\n" +
                "#..#.#.....##....#.......#...#.\n" +
                ".#.....#.....#..#..##..........\n" +
                "................#.#.#...##.....\n" +
                ".#.....#............#......#...\n" +
                "...#...#..#.#....######.....#..\n" +
                "..#..........##......##.....#..\n" +
                "......#..#.##...#.#............\n" +
                "....#.......#..#...#..#.#......\n" +
                "#......##.#..#........#.....#..\n" +
                "..#.........#..#.........#.....\n" +
                "..#.........##.......#.#.#..##.\n" +
                "...#....##.................#.#.\n" +
                "...#........##.#.......#.##..##\n" +
                "....#.#...#...#....#...........\n" +
                ".........#....##........#......\n" +
                "...#........#..#.......#...#...\n" +
                "#.......#....#...#...........#.\n" +
                ".......#......#...##...........\n" +
                ".#.#......##.#.......#..#...#..\n" +
                ".#.....##.#...#......#..#......\n" +
                "........#.............#.#..#..#\n" +
                "#...........#....#.....#.##.#.#\n" +
                "................#...#........##\n" +
                "#..#.##..#.....#...##.#........\n" +
                "#.....#.#..##......#.#..#..###.\n" +
                "....#...#.....#................\n" +
                "......#...#..##...........#....\n" +
                "......#.........##.#...#......#\n" +
                "#...#.#.....#..#.#..#..#......#\n" +
                "...#.#..#..#.#........###.#....\n" +
                "..#...#.......#.#.......#......\n" +
                "...#....#.....#.......#......#.\n" +
                "#...........#....#..#..#.......\n" +
                "..........##......##.........##\n" +
                "##............#..#.#...#..#.#..\n" +
                "..#.##....##...##..#...#.......\n" +
                "............##.##..###..#..#...\n" +
                "......#....##...##.........#...\n" +
                "......#..#.#......####..#......\n" +
                "..............#....#..#..##....\n" +
                "...#.#..#...##.#.......#.#.....\n" +
                "...#.#....#.......#..#..#..##..\n" +
                "..........#.........#..........\n" +
                "...#.....#............#.....##.\n" +
                "....#.#......................#.\n" +
                ".........#...#.#...#...........\n" +
                "...#........#..##.....#...#.#..\n" +
                "......##.....#.#..#...###.#...#\n" +
                "#....#..#.#.....#...#..........\n" +
                ".#.##.###.........#..##.#....#.\n" +
                "#.........#....#........#...#..\n" +
                "...........#...............#..#\n" +
                "###....................#....#..\n" +
                ".................#....#.....#..\n" +
                "..........#.........#.......#..\n" +
                "........#..#....#.....##.......\n" +
                "#...##.#...#.#.#............#..\n" +
                "....#.........##.#.#..#...###..\n" +
                ".##..............#...#.....##.#\n" +
                "###...#..................#...#.\n" +
                ".....#..#...#..#...#...........\n" +
                ".#.................#...#..#..#.\n" +
                ".#.........###...#.##......###.\n" +
                ".####............#......#..#...\n" +
                "....#........#..#.#....#..##..#\n" +
                "..#....#.#...#.#.....##....#...\n" +
                "..###..#..#....##....#..#..#...\n" +
                "...#.#.....#.#....#.....#......\n" +
                ".....#..........#.#............\n" +
                ".......#...........#.#..#..#...\n" +
                "......##........#.....#.......#\n" +
                "..#.#.....##............#..##..\n" +
                "....#.#........#...........##..\n" +
                "#......#..##........#.....#....\n" +
                "#...#...###..............##....\n" +
                "#..#........#........#.....##.#\n" +
                "......##.####........#..#....#.\n" +
                "...##..#.##.....#...#...#..#...\n" +
                "#..............###.##..##......\n" +
                "......................#.....#..\n" +
                ".........#.#.......#...##.#....\n" +
                "....#......#..........###..#...\n" +
                "#...####.#.................#..#\n" +
                "##.#....#....#.....##..#....#.#\n" +
                "..#.....#..##.........#.#..#.#.\n" +
                ".....#.....#...................\n" +
                "#....##.#.........###....#.....\n" +
                "#........#.#.......#.#.........\n" +
                ".##.#...#.....#...#.......##.##\n" +
                "#..#.............#.............\n" +
                "..........#.........####.......\n" +
                "..##..............#..#.#.......\n" +
                "..#.#.....#........#......##...\n" +
                "#.#.......#.#................#.\n" +
                ".#...#........#....##....#.##..\n" +
                ".#..#...#...#......#.#.........\n" +
                "......##............#.........#\n" +
                ".#....#.#.#.........#..#..##...\n" +
                "#....#......#.......###........\n" +
                ".......#........##..#...#..###.\n" +
                "#.##..........#..###..#..#.#...\n" +
                ".#..#....#..........#.#.##.....\n" +
                "#..#...#.#...#..#..#.#...#.....\n" +
                ".........#...#.#............#..\n" +
                "#..#.............#......##.##..\n" +
                "...##.......#..................\n" +
                "....#......#...#.....#......#..\n" +
                ".....##..#......#....#....#....\n" +
                "....#...#...#...#.....#........\n" +
                ".#....#........##....#..#.#...#\n" +
                "#.......#..#......#......#...#.\n" +
                "..............#......#......#..\n" +
                "#......#..##...#........#....#.\n" +
                "#..#..#..#.....#..#........#...\n" +
                "#...#.....#...#..........#...##\n" +
                "........#.......#...#.....#.#..\n" +
                "...................##.......#..\n" +
                ".#......#........#.##..#....#..\n" +
                ".....#.....#...#..#..#......#..\n" +
                "........##.#..##.........#....#\n" +
                ".........#.......#.............\n" +
                "............#.###.###..#.#.....\n" +
                ".............#....#...........#\n" +
                "..#.....#.#..##.##........#....\n" +
                "...#....#....#.........#.....#.\n" +
                ".#............#......#.........\n" +
                "..#.#..........##.##......#.#..\n" +
                "....#.........................#\n" +
                "..........##...................\n" +
                "#.......#.#..............#...#.\n" +
                "...##..#..##...##.#..#.#.#.....\n" +
                "...########.#..##....#.........\n" +
                "##.#........##.....#........#..\n" +
                "#.#.....#........#..#....#...#.\n" +
                "..#............#.......###.##.#\n" +
                "#.#............................\n" +
                "...#.#.#....#..........#..#....\n" +
                "..###.#.....#.#..#.............\n" +
                "#........#..........#.#..#.....\n" +
                "...........#..#....#.........#.\n" +
                "..#............#.....#.#.......\n" +
                "#.#............#..#.....#.#.#..\n" +
                "...#...#.......................\n" +
                ".#.#.#...##.............#..#..#\n" +
                "..#.........#..#.....##....##..\n" +
                ".#...#............#.......#..##\n" +
                "....#..#.#.#...####............\n" +
                "#.......#....#..##....##....#..\n" +
                ".....##.#....#.#..#.......#....\n" +
                "...........#.......#....##.#.##\n" +
                "..........#...#....##...#.#....\n" +
                "..#.............#.............#\n" +
                "....#..#.....#....#.#..###.#...\n" +
                ".......#.##.#......#...##...#.#\n" +
                ".#..#.#..#.#.......#....###.#..\n" +
                "#..........##...##.........##..\n" +
                "##..#......##.#.####.#.....#...\n" +
                "....#.#...#........#..##..#.#..\n" +
                ".#.............................\n" +
                ".##..#.#...##.....#....#.....#.\n" +
                "..##.........#......#.........#\n" +
                ".#.#........#...#.#.#....##....\n" +
                ".#.................##.........#\n" +
                "...#...............#....#......\n" +
                "..#...#..#..........###..#...##\n" +
                "..........#..#..........##..#..\n" +
                "...#.............#.##.#...#....\n" +
                "...#...........#...............\n" +
                "......#.........##.#...#...#...\n" +
                "...#.#........#..#.....#..#...#\n" +
                "#.#...#....##...#.....#....#...\n" +
                "#.#.#..#.....#.........#.......\n" +
                "##...........#..####...........\n" +
                "#..........#........###...#..#.\n" +
                "#..#.......#....#......###.....\n" +
                "..#.....#......#.###......##...\n" +
                "...#.##..#............#...#....\n" +
                ".##........#.....#.............\n" +
                "#....#.##..#...........##.#.#..\n" +
                "..#.....#.#....#.......#......#\n" +
                "#..#.......#............#......\n" +
                "#.......##....#...#..#.........\n" +
                ".................#..##.........\n" +
                "..............#..#..#.##.......\n" +
                "#.#.......................#..#.\n" +
                "..#..##...........#....#..#..#.\n" +
                "...#....#.......#.......#....#.\n" +
                ".....#.#..#.#.....#.........#.#\n" +
                "..#.#.........#.....#..........\n" +
                "...#.#.#.......#.#.......#.#..#\n" +
                "...##...#.#.#.....#.....##....#\n" +
                "##.......#.#.#.#.......#...##..\n" +
                "....#.#...........#......#.....\n" +
                ".#.....#........####...........\n" +
                "#......#........#.....#..#..#..\n" +
                "..#..#......#...##.......#....#\n" +
                "#........#..........#.....#.#..\n" +
                ".#...........#.....#.....#.....\n" +
                "..........#..#...#....#....##..\n" +
                ".....#.#..........#.....##..#..\n" +
                "......#.........##.............\n" +
                "..#..#.....##......##........#.\n" +
                ".#.#.#.#..#.#..#.......#.......\n" +
                "#.#...####.#.#....#.#........#.\n" +
                "....#...#.....#......#..##.....\n" +
                "##.........#.........#..#.#..#.\n" +
                "..#.#........#.#........#.##...\n" +
                "#....#......#...#....#.........\n" +
                ".##.............###....###.#...\n" +
                "..##.#.......#...#..#......#...\n" +
                ".....#.##..................#...\n" +
                ".....#.#...#..#................\n" +
                "........#..#..#...........#.#.#\n" +
                "....#.###.....#..#.#.....##..##\n" +
                "....##.#.........#..##.........\n" +
                ".##........#......#..###..#.##.\n" +
                ".........##...............#.##.\n" +
                "..#...............#.#...#..#.#.\n" +
                "....#....##.....#...#..#.....#.\n" +
                "#...#.....................#....\n" +
                ".....#.#............#...##.#.#.\n" +
                "...#......#.......#........##.#\n" +
                ".#.#..#.#....#.##.......##....#\n" +
                ".........#...#..##.........#...\n" +
                ".#...#..#....................#.\n" +
                ".......#...#........#.#..#.#.##\n" +
                ".#.............#......#..#.#...\n" +
                "............##.........#....#.#\n" +
                "#.........##..##...............\n" +
                ".#.#....#.#..#..........##.....\n" +
                "..###...#..#.#.......#..#...##.\n" +
                ".....#....#.#............##.#..\n" +
                "##.....#.#..#..#...............\n" +
                "...##...#......#....#..#..#....\n" +
                ".............#....#..#..##...##\n" +
                "#.......#............#....##..#\n" +
                "..#.##.....#.......#....#....#.\n" +
                "..........#...#.............###\n" +
                "..#....#.#..................#..\n" +
                "#.#...#..#...........#.........\n" +
                "....##..#..##..#..........#....\n" +
                "#...#...#.#....#.##...#.......#\n" +
                "#......##.#...##..#.....#......\n" +
                "....#.......#.#............#...\n" +
                "#....#...........###...........\n" +
                "#..#...#...#......#.#..#.......\n" +
                "...............................\n" +
                "#........##.............#.#....\n" +
                ".............#........#....#.##\n" +
                "........##.####.....##..#......\n" +
                "#.#.#.#.......##....##.....#...\n" +
                ".......#..##..#...#............\n" +
                "..........#...#....#..#.#.#.##.\n" +
                "...#........##....#...#........\n" +
                "#..#.##....#....#........#.....\n" +
                ".##...#.....##...#.............\n" +
                ".#...#..#.#.....#.##.....#.....\n" +
                "...........#.............#...#.\n" +
                ".#..#................#...#..#..\n" +
                "#..........#......##..##....#..\n" +
                "####..#...........#.#....#.....\n" +
                "..#.#.##..#...##........#....##\n" +
                ".#.......##........#.....#.....\n" +
                "............#................#.\n" +
                ".#...#...#.....#.#....#.##..#..\n" +
                "..#.............#.#....#.#.....\n" +
                "..............#...........#....\n" +
                "..............#........#....#..\n" +
                "..........##........#..#...#...\n" +
                "...#.#....#.#....#..#.....#...#\n" +
                "..#......#...........#..#..#.#.\n" +
                ".....##.....#.####....#........";


        String[] mapLines = data.split("\\s*\\n\\s*");

        List<String> fullTaskMap = createFullMap(Arrays.asList(mapLines));

        System.out.println(treeChecker(3,1,fullTaskMap));

    }

    public static List<String> createFullMap(List<String> map) {

        List<String> fullMap = new ArrayList<>();

        for (String mapLine : map) {
            fullMap.add(StringUtils.repeat(mapLine, 100));
        }

        return fullMap;
    }

    public static int treeChecker(int xOffset, int yOffset, List<String> mapToCheck) {

        int counter = 0;
        int temXOff = xOffset;
        for (int i = 1; i < mapToCheck.size(); i += yOffset ) {
            if(mapToCheck.get(i).charAt(temXOff) == '#') {
                counter++;
            }
            temXOff += xOffset;
        }

        return counter;
    }


}
