package com.Northeastern.Zhilei;

public final class Roomba implements iRobot{
    int[][] room;
    int i, j;
    Direction dir;
    final int height = room.length;
    final int width = room[0].length;

    public Roomba(int[][] room) {
        this.room = room;
        dir = Direction.DOWN;
        i = 0;
        j = 0;
    }

    @Override
    public boolean move() {
        if(i < height && i >= 0 && j < width && j >= 0 && room[i][j] != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final void turnLeft() {
        if(dir == Direction.DOWN) {
            dir = Direction.LEFT;
        } else if(dir == Direction.LEFT) {
            dir = Direction.DOWN;
        } else if(dir == Direction.RIGHT) {
            dir = Direction.UP;
        } else {
            dir = Direction.RIGHT;
        }
    }

    @Override
    public final void turnRight() {
        if(dir == Direction.DOWN) {
            dir = Direction.RIGHT;
        } else if(dir == Direction.RIGHT) {
            dir = Direction.DOWN;
        } else if(dir == Direction.LEFT) {
            dir = Direction.UP;
        } else {
            dir = Direction.LEFT;
        }
    }

    @Override
    public final void clean() {
        room[i][j] = 1;
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
